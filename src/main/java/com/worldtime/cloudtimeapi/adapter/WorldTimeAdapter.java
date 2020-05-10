package com.worldtime.cloudtimeapi.adapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.worldtime.cloudtimeapi.model.WorldTime;

@Component
public class WorldTimeAdapter {

	@Autowired
	private RestTemplate restTemplate;

	public WorldTime getWorldTime(String county) {
		ResponseEntity<WorldTime> responseEntity = restTemplate
				.getForEntity("http://worldtimeapi.org/api/timezone/Europe/" + county, WorldTime.class);
		return responseEntity.getBody();
	}
}