package com.firstpackage.ticketservice.restclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="PRICING", url="http://localhost:9090")
public interface PriceServClient {
	
	@RequestMapping(method=RequestMethod.GET, path="/api/v1.0/pricing/price/{id}")
	public int determinePrice(@PathVariable int id);
}
