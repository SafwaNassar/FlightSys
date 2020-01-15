package io.FlightsBookingSystem.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Passenger")
public class Passenger {
//	below passenger table columns 
		@Id
		private String passengerID;
		@Column(name = "firstName")
		private String firstName;
		
		@Column(name = "lastName")
	    private String lastName;
		
		@Column(name = "email")
	    private String email;
		
		@Column(name = "phone")
	    private String phone;
		
	    @JsonIgnore
	    private String password;

//Define the relation between ticket and passenger
		@ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "ticketID")
	    private Ticket ticket;

		
//		Default constractor
		public Passenger() {
		}
	    	    
		public Passenger(String passengerID,String firstName, String lastName, String email, String phone) {
			super();
			this.passengerID=passengerID;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.phone = phone;
//			this.roleEnum=roleEnum.USER;
		}
		 
		
//		Setters and getters for private variables
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
	    public Ticket getTicket() {
			return ticket;
		}

		public void setTicket(Ticket ticket) {
			this.ticket = ticket;
		}
		public String getPassengerID() {
			return passengerID;
		}


		public void setPassengerID(String passengerID) {
			this.passengerID = passengerID;
		}

		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}
		
//		OverRide to string method to show the class data
		@Override
	    public String toString() {
	        return "Passenger{" +
	                "firstName='" + firstName + '\'' +
	                ", lastName='" + lastName + '\'' +
	                ", email='" + email + '\'' +
	                ", phone='" + phone + '\'' +
	                '}';
	    }
	    
}
