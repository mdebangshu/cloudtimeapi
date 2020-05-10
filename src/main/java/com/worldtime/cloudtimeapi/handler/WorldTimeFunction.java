package com.worldtime.cloudtimeapi.handler;

import java.util.function.Function;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import com.worldtime.cloudtimeapi.model.Country;
import com.worldtime.cloudtimeapi.model.WorldTime;
import com.worldtime.cloudtimeapi.service.WorldTimeService;

@Component
public class WorldTimeFunction implements Function<Country, WorldTime> {

	private static Log logger = LogFactory.getLog(WorldTimeFunction.class);

	private final WorldTimeService worldTimeService;

	public WorldTimeFunction(final WorldTimeService worldTimeService) {
		this.worldTimeService = worldTimeService;
	}

	@Override
	public WorldTime apply(Country country) {
		logger.info("Fetching current time of Country : " + country.getCountry());
		return worldTimeService.getWorldTime(country.getCountry());
	}
}