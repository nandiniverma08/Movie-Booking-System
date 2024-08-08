package com.moviebooking.models;

import java.time.Instant;
import java.util.Date;

import javax.xml.crypto.Data;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class SeatLock {
	
	private Seat seat;
	private Show show;
	private Integer timeoutInSeconds;
	private Date lockTime;
	private String lockedBy;
	
	public boolean isLockExpired() {
        final Instant lockInstant = lockTime.toInstant().plusSeconds(timeoutInSeconds);
        final Instant currentInstant = new Date().toInstant();
        return lockInstant.isBefore(currentInstant);
    }

}
