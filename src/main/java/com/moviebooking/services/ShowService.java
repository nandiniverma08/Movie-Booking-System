package com.moviebooking.services;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.moviebooking.models.Movie;
import com.moviebooking.models.Screen;
import com.moviebooking.models.Show;

import lombok.NonNull;

public class ShowService {

	private final Map<String, Show> shows;

	public ShowService() {
		this.shows = new HashMap<>();
	}

	public Show getShow(String showId) {
		if (!shows.containsKey(showId)) {
			throw new NotFoundException();
		}

		return shows.get(showId);
	}

	public Show createShow(@NonNull final Movie movie, @NonNull final Screen screen, @NonNull final Date startTime,
			@NonNull final Integer durationInSeconds) {
		if (!checkIfShowCreationAllowed(screen, startTime, durationInSeconds)) {
			throw new ScreenAlreadyOccupiedException();
		}
		String showId = UUID.randomUUID().toString();
		Show show = new Show(showId, movie, screen, startTime, durationInSeconds);
		shows.put(showId, show);

		return show;
	}

	public List<Show> getShowForScreen(Screen screen) {
		final List<Show> response = new ArrayList<>();
		for (Show show : shows.values()) {
			if (show.getScreen().equals(screen)) {
				response.add(show);
			}
		}
		return response;

	}

	private boolean checkIfShowCreationAllowed(final Screen screen, final Date startTime,
			final Integer durationInSeconds) {
		// TODO: Implement this. This method will return whether the screen is free at a
		// particular time for
		// specific duration. This function will be helpful in checking whether the show
		// can be scheduled in that slot
		// or not.
		return true;
	}

}
