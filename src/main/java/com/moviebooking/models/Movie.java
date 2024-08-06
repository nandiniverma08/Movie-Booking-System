package com.moviebooking.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Movie {
	
	private final String id;
	private final String name;
	
	public Movie(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	

}
