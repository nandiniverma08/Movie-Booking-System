package com.moviebooking.services;

import java.util.Map;
import java.util.UUID;

import com.moviebooking.models.Screen;
import com.moviebooking.models.Seat;
import com.moviebooking.models.Theatre;

public class TheatreService {
	
	private Map<String, Theatre> theatres;
	private Map<String, Screen> screens;
	private Map<String, Seat>  seats;
	
	
	
	public Theatre createTheatre(String theatreName) {
		String theatreId = UUID.randomUUID().toString();
		Theatre theatre = new Theatre(theatreId, theatreName);
		theatres.put(theatreId, theatre);
		return theatre;
	}



	public Theatre getTheatre(String theatreId) {
		if(!theatres.containsKey(theatreId)) {
			 throw new NotFoundException();
		}
		return theatres.get(theatreId);
	}



	public Screen createScreenInTheatre(String screenName, Theatre theatre) {
		Screen screen = createScreen(screenName, theatre);
		theatre.addScreen(screen);
		return screen;
	}



	private Screen createScreen(String screenName, Theatre theatre) {
		String screenId = UUID.randomUUID().toString();
		Screen screen = new Screen(screenId, screenName, theatre);
		screens.put(screenId, screen);
		return screen;
	}



	public Screen getScreen(String screenId) {
		if(!screens.containsKey(screenId)) {
			 throw new NotFoundException();
		}
		screens.get(screenId);
	}



	public Seat createSeatInScreen(String rowNo, String seatNo, Screen screen) {
		String seatId = UUID.randomUUID().toString();
		Seat seat = new Seat(seatId, rowNo, seatNo);
		seats.put(seatId, seat);
		screen.addSeat(seat);
		return seat;
	}

}
