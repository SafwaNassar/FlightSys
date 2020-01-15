package io.FlightsBookingSystem.Repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.FlightsBookingSystem.Model.Passenger;

@Repository
public interface PassengerRepo extends JpaRepository<Passenger, String> {
	
}
