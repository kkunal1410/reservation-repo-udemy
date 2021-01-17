package com.firstpackage.priceservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.firstpackage.priceservice.service.PriceFinder;

@RestController
@RequestMapping("/api/v1.0/pricing")
public class PriceController {

	@Autowired
	PriceFinder priceFinder;
	
	@RequestMapping(method = RequestMethod.GET, path="/price/{id}")
	public int getTicketPrice(@PathVariable int id) {
		return priceFinder.findPrice(id);
	}
}
