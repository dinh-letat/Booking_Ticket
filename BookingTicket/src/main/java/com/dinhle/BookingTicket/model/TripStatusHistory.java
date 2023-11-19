package com.dinhle.BookingTicket.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TripStatusHistory")
public class TripStatusHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "trip_id", nullable = false)
    private Trip trip;

    private String status;
    private LocalDate statusDate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Trip getTrip() {
		return trip;
	}
	public void setTrip(Trip trip) {
		this.trip = trip;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDate getStatusDate() {
		return statusDate;
	}
	public void setStatusDate(LocalDate statusDate) {
		this.statusDate = statusDate;
	}
	public TripStatusHistory(Long id, Trip trip, String status, LocalDate statusDate) {
		super();
		this.id = id;
		this.trip = trip;
		this.status = status;
		this.statusDate = statusDate;
	}
	public TripStatusHistory() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "TripStatusHistory [id=" + id + ", trip=" + trip + ", status=" + status + ", statusDate=" + statusDate
				+ "]";
	}

    
}
