package io.FlightsBookingSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.FlightsBookingSystem.Model.Flight;
import io.FlightsBookingSystem.Service.FlightService;
//Flight Controller Class
@RestController
public class FlightController {

	@Autowired
	private FlightService flightService;	


//	using instance of flight service to show all flights using the below URL
	@RequestMapping("/flights")
	public List<Flight> getAllFlights(){
			return flightService.getAllFlights();
	}	
	
	
//	using instance of flight service to show one flight by his ID using the below URL
	@RequestMapping("/flights/{id}")
	public Flight getFlight(@PathVariable String id){
		return flightService.getFlight(id);
	}

	
//	using instance of flight service to add new flight using the below URL
	@RequestMapping(method = RequestMethod.POST, value = "/admin/addFlight")
	public ResponseEntity<Flight> addFlight(@RequestBody Flight flight){
		
		flightService.addFlight(flight);
		return new ResponseEntity<Flight>(flight, HttpStatus.OK);
	}	
	
	
//	using instance of flight service to update specific flight by his ID using the below URL
	@RequestMapping(method = RequestMethod.PUT, value = "/admin/flights/{id}")
	public void addFlight(@RequestBody Flight flight, @PathVariable String id){
		flightService.updateFlight(id,flight);
	}
	
	
//	using instance of flight service to delete specific flight by his ID using the below URL
	@RequestMapping(method = RequestMethod.DELETE, value = "/admin/flights/{id}")
	public void deleteFlight(@RequestBody Flight flight, @PathVariable String id){
		flightService.deleteFlight(id);
	}
	
	
//	Method used to search throw all flights and get back with flight that matches source and destinations
	 @RequestMapping("/findbysrc")
	 public List<Flight> findBySrc(@RequestParam("flightSrc") String flightSrc, 
			 					@RequestParam("flightDes") String flightDes) 
	 {

			return flightService.findBySrcAndDes(flightSrc, flightDes);
	 }
	
	 
//		Method used to search throw all flights and get back with flight that matches fare
	 @RequestMapping("/findbyfare")
	 public List<Flight> findByFare(@RequestParam("fare") String fare) 
{
			return flightService.findByFare(fare);
		
}
}
