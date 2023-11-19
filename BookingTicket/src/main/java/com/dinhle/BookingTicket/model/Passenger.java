package com.dinhle.BookingTicket.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Passenger")
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "booking_id", nullable = false)
    private Booking booking;

    private String name;
    private int age;
    private String gender;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Booking getBooking() {
		return booking;
	}
	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Passenger(Long id, Booking booking, String name, int age, String gender) {
		super();
		this.id = id;
		this.booking = booking;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Passenger [id=" + id + ", booking=" + booking + ", name=" + name + ", age=" + age + ", gender=" + gender
				+ "]";
	}

    
}
