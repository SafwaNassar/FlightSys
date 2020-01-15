package io.FlightsBookingSystem.Repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.FlightsBookingSystem.Model.Flight;

@Repository
public interface FlightRepo extends JpaRepository<Flight, String> {

//	Query list of flight using two parameters "Source and Destination"
	List<Flight> flightSrcAndFlightDes(String src, String des);


//	list of flight using one parameters "Fare"
	List<Flight> fare(String fare);

}
