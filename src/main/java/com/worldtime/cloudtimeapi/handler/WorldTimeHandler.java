package com.worldtime.cloudtimeapi.handler;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import com.amazonaws.services.lambda.runtime.Context;
import com.worldtime.cloudtimeapi.model.Country;
import com.worldtime.cloudtimeapi.model.WorldTime;

public class WorldTimeHandler extends SpringBootRequestHandler<Country, WorldTime> {
	
	private static Log logger = LogFactory.getLog(WorldTimeHandler.class);
	
	@Override
	public Object handleRequest(Country country, Context context) {
		logger.debug("Handler invoked to fetch current time");
		return super.handleRequest(country, context);
	}
}