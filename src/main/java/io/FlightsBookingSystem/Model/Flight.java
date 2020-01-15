package io.FlightsBookingSystem.Model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Flight")
public class Flight {
//	below flight table columns 

	@Id
	private String flightID ;
	@Column(name = "flightDate")
	private LocalDate flightDate;
	
	@Column(name = "flightSrc")
	private String flightSrc;
	
	@Column(name = "flightDes")
	private String flightDes;
	
	@Column(name = "flightTime")
	private LocalTime flightTime;
	
	@Column(name = "fare")
	private int fare;
	
//	Default constractor
	public Flight() {
		
	}	


	public Flight(String flightID, LocalDate flightDate, String flightSrc, String flightDes, LocalTime flightTime,
			int fare) {
		super();
		this.flightID = flightID;
		this.flightDate = flightDate;
		this.flightSrc = flightSrc;
		this.flightDes = flightDes;
		this.flightTime = flightTime;
		this.fare = fare;
	}
	
//	Setters and getters for private variables
	public String getFlightID() {
		return flightID;
	}
	public void setFlightID(String flightID) {
		this.flightID = flightID;
	}
	public LocalDate getFlightDate() {
		return flightDate;
	}
	public void setFlightDate(LocalDate flightDate) {
		this.flightDate = flightDate;
	}
	public String getFlightSrc() {
		return flightSrc;
	}
	public void setFlightSrc(String flightSrc) {
		this.flightSrc = flightSrc;
	}
	public String getFlightDes() {
		return flightDes;
	}
	public void setFlightDes(String flightDes) {
		this.flightDes = flightDes;
	}
	public LocalTime getFlightTime() {
		return flightTime;
	}
	public void setFlightTime(LocalTime flightTime) {
		this.flightTime = flightTime;
	}
	
	
//	OverRide to string method to show the class data
	 @Override
	    public String toString() {
	        return "Flight{" +
	                ", flightDate='" + flightDate + '\'' +
	                ", flightSrc='" + flightSrc + '\'' +
	                ", flightDes='" + flightDes + '\'' +
	                ", flightTime=" + flightTime +
	                '}';
	    }
}


