package com.moviebooking.models;

import java.util.Date;

import javax.xml.crypto.Data;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Show {
	
	private final String id;
	private final Movie movie;
	private final Screen screen;
	private final Data date;
	private final Integer durationInSeconds;
	
	
	public Show(String id, Movie movie, Screen screen, Date date, Integer durationInSeconds) {
		super();
		this.id = id;
		this.movie = movie;
		this.screen = screen;
		this.date = date;
		this.durationInSeconds = durationInSeconds;
	}
	
	
	
	
	
	

}
