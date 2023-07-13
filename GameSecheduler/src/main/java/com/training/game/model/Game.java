package com.training.game.model;

import jakarta.persistence.OneToMany;

public class Game {
    private int gameNo;
    
    @OneToMany
 	private String gameName;
	public int getGameNo() {
		return gameNo;
	}
	public void setGameNo(int gameNo) {
		this.gameNo = gameNo;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public Game(int gameNo, String gameName) {
		super();
		this.gameNo = gameNo;
		this.gameName = gameName;
	}


}
