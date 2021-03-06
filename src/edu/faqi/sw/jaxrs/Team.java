package edu.faqi.sw.jaxrs;

import java.util.List;

public class Team {
	private String name;
	private List<Player> players;
	
	public Team(){}
	public Team(String name, List<Player> players) {
		super();
		this.name = name;
		this.players = players;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Player> getPlayers() {
		return players;
	}
	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	
	@Override
	public String toString() {
		return "Team [name=" + name + ", players=" + players + "]";
	}

}
