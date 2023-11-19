package com.dinhle.BookingTicket.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Trip")
public class Trip {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String destination;
	private LocalDate departureDate;
	private LocalDate returnDate;
	private String transportation;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public LocalDate getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}
	public LocalDate getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}
	public String getTransportation() {
		return transportation;
	}
	public void setTransportation(String transportation) {
		this.transportation = transportation;
	}
	public Trip(Long id, String destination, LocalDate departureDate, LocalDate returnDate, String transportation) {
		super();
		this.id = id;
		this.destination = destination;
		this.departureDate = departureDate;
		this.returnDate = returnDate;
		this.transportation = transportation;
	}
	public Trip() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Trip [id=" + id + ", destination=" + destination + ", departureDate=" + departureDate + ", returnDate="
				+ returnDate + ", transportation=" + transportation + "]";
	}
	
	
}
