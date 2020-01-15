package io.FlightsBookingSystem.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.FlightsBookingSystem.Model.Flight;
import io.FlightsBookingSystem.Repo.FlightRepo;

@Service
public class FlightService {
	@Autowired
	private FlightRepo flightRepo;

//	Array list return all flights in the Database
	public List<Flight> getAllFlights() {
		List<Flight> flights = new ArrayList<>();
		flightRepo.findAll()
		.forEach(flights ::add);
		return flights;
	}

//	method return an flight with key"ID" from the Database
	public Flight getFlight(String id) {
		return flightRepo.findById(id).get();
	}

//	method add flight to the Database
	public void addFlight(Flight flight) {
		flightRepo.save(flight);
		
	}
	
//	method update flight in the Database
	public  void updateFlight(String id, Flight flight) {
		flightRepo.save(flight);
	}


//	method delete flight from the Database
	public void deleteFlight(String id) {
		flightRepo.deleteById(id);

	}

//	method search by source and destination in the Database
	public List<Flight> findBySrcAndDes(String flightSrc,String flightDes) {
		return flightRepo.flightSrcAndFlightDes(flightSrc, flightDes);
	}
	
//	method search by fare in the Database
	public List<Flight> findByFare(String fare) {
		return flightRepo.fare(fare);
	}

}
