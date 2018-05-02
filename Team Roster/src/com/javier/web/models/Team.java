package com.javier.web.models;

import java.util.ArrayList;

public class Team {
	private String name;
	private ArrayList<Player> players=new ArrayList<Player>();
	
	public Team(String name) {
		this.name = name;
	}

	public ArrayList<Player> getPlayers() {
		return players;
	}

	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}

	public String getTeam_Name() {
		return name;
	}

	public void setTeam_Name(String name) {
		this.name = name;
	}
	
	
}
