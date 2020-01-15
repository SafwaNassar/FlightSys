package io.FlightsBookingSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.FlightsBookingSystem.Model.Admin;
import io.FlightsBookingSystem.Model.Passenger;
import io.FlightsBookingSystem.Service.PassengerService;
//Passenger Controller Class

@RestController
public class PassengerController {
	
	@Autowired
	private PassengerService passengerService;

	
//	using instance of passenger service to show all passengers using the below URL
	@RequestMapping("/admin/passengers")
	public List<Passenger> getAllPassenger(){
		return passengerService.getAllPassenger();
	}	

	
//	using instance of passenger service to get information of specific passenger by his ID using the below URL
	@RequestMapping("/passenger/{id}")
	public List<Passenger> getPassengern(@PathVariable String id){
		return passengerService.getPassenger(id);
	}

	
//	using instance of passenger service to update specific passenger by his ID using the below URL	
	@RequestMapping(method = RequestMethod.PUT, value = "/passengers/{id}")
	public void addPassenger(@RequestBody Passenger passenger, @PathVariable String id){
		passengerService.updatePassenger(id,passenger);
	}
	
	
//	using instance of passenger service to delete specific passenger by his ID using the below URL
	@RequestMapping(method = RequestMethod.DELETE, value = "/passengers/{id}")
	public void deletePassenger(@RequestBody Passenger passenger, @PathVariable String id){
		passengerService.deletePassenger(id);
	}
}