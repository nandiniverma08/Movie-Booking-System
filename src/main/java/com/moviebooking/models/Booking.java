package com.moviebooking.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

@AllArgsConstructor
@Getter
public class Booking {
	
	private final String id;
	private final Show show;
	private final List<Seat> seatsBooked;
	private final String user;
	private BookingStatus bookingStatus;
	
	public Booking(@NonNull String id,@NonNull Show show,@NonNull List<Seat> seatsBooked,@NonNull String user) {
		this.id = id;
		this.show = show;
		this.seatsBooked = seatsBooked;
		this.user = user;
		this.bookingStatus = BookingStatus.Created;
	}
	
	
	public boolean isConfirmed() {
		return this.bookingStatus == BookingStatus.Confirmed;
	}
	
	public void confirmBooking() {
		if(this.bookingStatus != BookingStatus.Created) {
			throw new InvalidStateException();
		}
		this.bookingStatus = BookingStatus.Confirmed;
	}
	
	public void expireBooking() {
		if(this.bookingStatus != BookingStatus.Confirmed) {
			throw new InvalidStateException();
		}
		this.bookingStatus = BookingStatus.Expired;
	}
	
	
	
	
	
	

}
