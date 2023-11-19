package com.dinhle.BookingTicket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dinhle.BookingTicket.model.Trip;

public interface TripRepository extends JpaRepository<Trip, Long> {
	
}