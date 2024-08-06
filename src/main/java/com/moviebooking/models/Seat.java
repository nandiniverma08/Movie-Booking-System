package com.moviebooking.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Seat {

	private final String id;
	private final String rowNo;
	private final String seatNo;
	
	
	public Seat(String id, String rowNo, String seatNo) {
		super();
		this.id = id;
		this.rowNo = rowNo;
		this.seatNo = seatNo;
	}
	
	
	
	
	
	
}
