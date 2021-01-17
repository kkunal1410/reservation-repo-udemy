package com.firstpackage.priceservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstpackage.priceservice.entity.TicketPrice;
import com.firstpackage.priceservice.repo.PriceRepo;

@Service
public class PriceFinder {

	@Autowired
	PriceRepo pr;
	
	public int findPrice(int id) {
		
		 Optional<TicketPrice> tp=pr.findById(id);
		 
		 if(tp.isPresent()) {
			 return tp.get().getPrice();
		 }
		 
		 return 0;
	}
	
}
