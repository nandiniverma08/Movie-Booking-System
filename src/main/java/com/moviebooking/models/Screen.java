package com.moviebooking.models;

import java.util.ArrayList;
import java.util.List;

import io.micrometer.common.lang.NonNull;
import lombok.Getter;

@Getter
public class Screen {

	private final String id;
	private final String name;
	private final Theatre theatre;
	
	private final List<Seat> seats;

	public Screen(@NonNull String id,@NonNull String name,@NonNull Theatre theatre) {
		super();
		this.id = id;
		this.name = name;
		this.theatre = theatre;
		this.seats = new ArrayList<>();
	}
	
	public void addSeat(@NonNull final Seat seat) {
		this.seats.add(seat); 
	}

	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}


	
	
	
	
}
