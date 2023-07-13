package com.training.game.model;

import jakarta.persistence.ManyToOne;

public class Day {
	
	
	@ManyToOne
	private String dayName;
 	private String venue;
	public String getDayName() {
		return dayName;
	}
	public void setDayName(String dayName) {
		this.dayName = dayName;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}

}
