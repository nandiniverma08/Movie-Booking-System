package com.moviebooking.models;

import java.util.ArrayList;
import java.util.List;

import io.micrometer.common.lang.NonNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.NonFinal;

@Getter
public class Theatre {
	
	private final String id;
	private final String name;
	private final List<Screen> screens;
	
	public Theatre(@NonNull String id, @NonNull String name, List<Screen> screens) {
		this.id = id;
		this.name = name;
		this.screens = new ArrayList<>();
	}
	
	

}
