package com.firstpackage.priceservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstpackage.priceservice.entity.TicketPrice;

public interface PriceRepo extends JpaRepository<TicketPrice, Integer> {

}
