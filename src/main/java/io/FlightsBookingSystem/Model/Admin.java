package io.FlightsBookingSystem.Model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Admin {
//	below admin table columns 
	@Id
	private String adminID ;
	private String firstName;
    private String lastName;
	private String name;
	private Date dateOfBirth = new Date();

    private String email;
    @JsonIgnore
    private String password;

	private String address;
	private String mobile;
//    private RoleEnum roleEnum;
	
//	Default constractor
public Admin() {
		
	}	

// constractor take id, name and password
	public Admin(String adminID, String name,String password) {
	super();
	this.adminID = adminID;
	this.name = name;
	this.password = password;
	}
	
	
	
//	Setters and getters for private variables
	public String getAdminID() {
		return adminID;
	}
	public void setAdminID(String adminID) {
		this.adminID = adminID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
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


//	OverRide to string method to show the class data
	@Override
    public String toString() {
        return "Admin{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}




