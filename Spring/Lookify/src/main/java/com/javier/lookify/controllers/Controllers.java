package com.javier.lookify.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.javier.lookify.models.Song;
import com.javier.lookify.repositories.SongRepository;
import com.javier.lookify.services.SongService;

@Controller
public class Controllers {
	
	private final SongService songService;
	public Controllers( SongService songService) {
		this.songService=songService;
	}
	
	//Main page
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	//Render Dashboard
	@RequestMapping("/dashboard")
	public String dashboard(Model model) {
		model.addAttribute("songs", songService.allSongs());
		return "dashboard.jsp";
	}
	@RequestMapping("/songs/new")
	public String newSong(@ModelAttribute("song") Song song) {
		
		return "newsong.jsp";
	}
	
	@PostMapping("/songs/new")
	public String createSong(@Valid @ModelAttribute("song") Song song, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("songs", songService.allSongs());
			return "newsong.jsp";
		}
		songService.addSong(song);
		return "redirect:/dashboard";
	}
	
	@RequestMapping("/songs/{id}")
	public String showSong(@PathVariable("id") Long id,Model model) {
		model.addAttribute("song", songService.findSong(id));
		return "showSong.jsp";
	}
	
	@RequestMapping("/songs/delete/{id}")
	public String deleteSong(@PathVariable("id") Long id,Model model) {
		songService.deleteSong(id);
		return "redirect:/dashboard";
	}
	
	@RequestMapping("/search/topten")
	public String topTen(Model model) {
		model.addAttribute("songs",songService.findTopTen());
		return "topten.jsp";
	}
	@RequestMapping("/search")
	public String searchArtist(@RequestParam("artist") String artist) {
		return "redirect:/search/"+artist;
	}
	@RequestMapping("/search/{artist}")
	public String findArtist(@PathVariable("artist") String artist,Model model) {
		model.addAttribute("songs",songService.findByArtist(artist));
		return "searchResults.jsp";
	}
	
}
