package com.worldtime.cloudtimeapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.worldtime.cloudtimeapi.adapter.WorldTimeAdapter;
import com.worldtime.cloudtimeapi.model.WorldTime;

@Service
public class WorldTimeService {

	@Autowired
	private WorldTimeAdapter worldTimeAdapter;
	
	public WorldTime getWorldTime(String country) {
		return worldTimeAdapter.getWorldTime(country);
	}
}