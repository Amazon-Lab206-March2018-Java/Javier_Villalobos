package com.javier.lookify.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.javier.lookify.models.Song;
import com.javier.lookify.repositories.SongRepository;

@Service
public class SongService {

	private SongRepository songRepository;
	public SongService(SongRepository songRepository) {
		this.songRepository = songRepository;
	}
	
	public List<Song> allSongs(){
		return (List<Song>) songRepository.findAll();
	}
	public void addSong(Song song) {
		this.songRepository.save(song);
	}
	public Song findSong(Long id){
		Optional<Song> optionalSong=songRepository.findById(id);
		return optionalSong.get();
	}

	public void deleteSong(Long id) {
		songRepository.deleteById(id);
	}

	public List<Song> findTopTen() {
		return songRepository.findTop10ByOrderByRatingDesc();
	}
	public List<Song> findByArtist(String artist) {
		return songRepository.findByArtistContaining(artist);
	}
	
}
