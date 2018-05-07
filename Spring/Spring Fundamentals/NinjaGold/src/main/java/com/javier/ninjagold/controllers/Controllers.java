package com.javier.ninjagold.controllers;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controllers {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(path="/process_money",method=RequestMethod.POST)
	public String process_money(@RequestParam String building,Model model,HttpSession session) {
		int min=0,max=0;
		if (session.getAttribute("activities")==null) {
			session.setAttribute("gold", 0);
			session.setAttribute("activities", new ArrayList<Map>());
		}
		switch(building) {
			case "farm":{
				min=10;
				max=20;
			}break;
			case "cave":{
				min=5;
				max=10;
			}break;
			case "house":{
				min=2;
				max=5;
			}break;
			case "casino":{
				min=-50;
				max=50;
			}break;
		}
		Random random = new Random();
		int newGold = random.nextInt(max + 1 -min) + min;
		int gold = (Integer) session.getAttribute("gold") + newGold; 
		session.setAttribute("gold", gold);
		ArrayList<Map> activities = new ArrayList<Map>();
		activities = (ArrayList<Map>) session.getAttribute("activities");
		Map<String,String> message = new HashMap<String,String>();
		SimpleDateFormat currentDate = new SimpleDateFormat("EEE, d MMM yyyy h:mm a");
        String date = currentDate.format(new Date());
		if (newGold>=0) {
			message.put("message","You entered a "+building+" and earned " + newGold +" golds."+ date);
			message.put("color", "green");
			System.out.println(message);
		}
		else {
			message.put("message","You entered a "+building+" and lost " + newGold +" golds. Ouch. "+ date);
			message.put("color", "red");
			System.out.println(message); 
		}
		activities.add(0,message);
		return "redirect:/";
	}
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.removeAttribute("activities");
		session.setAttribute("gold",0);
		return "redirect:/";
	}
}
