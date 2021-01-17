package com.firstpackage.ticketservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.firstpackage.ticketservice.service.PriceCalculator;

@RestController
@RequestMapping("/api/v1.0/ticket")
public class TicketController {
	
	@Autowired
	PriceCalculator priceCalc;
	
	@RequestMapping(method = RequestMethod.GET, path="/price")
	public int getTicketPrice(@RequestParam("id") int id, @RequestParam("num") int numberOfTickets) {
		return priceCalc.calculatePrice(id,numberOfTickets);
	}

}
