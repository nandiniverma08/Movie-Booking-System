package com.moviebooking.api;

import com.moviebooking.models.Screen;
import com.moviebooking.models.Theatre;
import com.moviebooking.services.TheatreService;

import io.micrometer.common.lang.NonNull;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TheatreController {
	
	private TheatreService theatreService;
	
	public String createTheatre(@NonNull String theatreName) {
		return theatreService.createTheatre(theatreName).getId();
	}
	
	public String createScreenInTheatre(String screenName, String theatreId) {
		Theatre theatre = theatreService.getTheatre(theatreId);
		return theatreService.createScreenInTheatre(screenName,theatre).getId();
	}
	
	public String createSeatInScreen(String rowNo, String seatNo, String screenId) {
		Screen screen = theatreService.getScreen(screenId);
		return theatreService.createSeatInScreen(rowNo, seatNo, screen).getId();
	}

}
