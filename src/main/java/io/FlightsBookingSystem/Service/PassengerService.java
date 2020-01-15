package io.FlightsBookingSystem.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import io.FlightsBookingSystem.Model.Passenger;
import io.FlightsBookingSystem.Repo.PassengerRepo;

@Service
public class PassengerService   {
	@Autowired
	private PassengerRepo passengerRepo;


	public List<Passenger> getAllPassenger() {
	
		List<Passenger> passengers = new ArrayList<>();
		passengerRepo.findAll()
		.forEach(passengers ::add);
		return passengers;
	}

//	Array list return all passengers in the Database
	public List<Passenger>  getPassenger(String id) {
		List<Passenger> passengers = new ArrayList<>();
		passengerRepo.findAll()
		.forEach(passengers ::add);
		return passengers;
	}

//	method add passenger to the Database
	public void addPassenger(Passenger passenger) {
		passenger.setPassword(passwordEncoder().encode(passenger.getPassword()));
		passengerRepo.save(passenger);	
	}
	
	
//	method update passenger in the Database
	public  void updatePassenger(String id,Passenger passenger) {
		passengerRepo.save(passenger);
	}


//	method delete passenger from the Database
	public void deletePassenger(String id) {
		passengerRepo.deleteById(id);
		
	}


	@Bean
	private PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
