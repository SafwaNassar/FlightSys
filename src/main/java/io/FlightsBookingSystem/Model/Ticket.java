package io.FlightsBookingSystem.Model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Ticket")
public class Ticket {
//	below Ticket table columns 
	@Id
	private String ticketID ;
	@Column(name = "ticketDate")
	private LocalDate ticketDate;
	
	@Column(name = "ticketSrc")
	private String ticketSrc;
	
	@Column(name = "ticketDes")
	private String ticketDes;
	
	@Column(name = "price")
	private int price;
	
	@Column(name = "ticketTime")
	private LocalTime ticketTime;
	
	@Column(name = "upgrades")
    private Upgrades upgrades;

//Define the relation between ticket and passenger
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "flightID")
    private Flight flight;
	
	public Ticket() {
		
	}	

	public Ticket(String ticketID, LocalDate ticketDate, String ticketSrc, String ticketDes, int price,
			LocalTime ticketTime, Upgrades upgrades, Flight flight) {
		super();
		this.ticketID = ticketID;
		this.ticketDate = ticketDate;
		this.ticketSrc = ticketSrc;
		this.ticketDes = ticketDes;
		this.price = price;
		this.ticketTime = ticketTime;
		this.upgrades = upgrades;
		this.flight = flight;
	}
	
//	setters and getters
	public Upgrades getUpgrades() {
		return upgrades;
	}
	public void setUpgrades(Upgrades upgrades) {
		this.upgrades = upgrades;
	}
	public String getTicketID() {
		return ticketID;
	}
	public void setTicketID(String ticketID) {
		this.ticketID = ticketID;
	}
	public LocalDate getTicketDate() {
		return ticketDate;
	}
	public void setTicketDate(LocalDate ticketDate) {
		this.ticketDate = ticketDate;
	}
	public String getTicketSrc() {
		return ticketSrc;
	}
	public void setTicketSrc(String ticketSrc) {
		this.ticketSrc = ticketSrc;
	}
	public String getTicketDes() {
		return ticketDes;
	}
	public void setTicketDes(String ticketDes) {
		this.ticketDes = ticketDes;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public LocalTime getTicketTime() {
		return ticketTime;
	}
	public void setTicketTime(LocalTime ticketTime) {
		this.ticketTime = ticketTime;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	
	
//	OverRide to string method to show the class data
	@Override
	    public String toString() {
	        return "Ticket{" +
	                ", ticketDate='" + ticketDate + '\'' +
	                ", ticketSrc='" + ticketSrc + '\'' +
	                ", ticketDes='" + ticketTime +
	                '}';
	    }
}


