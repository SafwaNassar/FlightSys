package io.FlightsBookingSystem.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.FlightsBookingSystem.Model.Ticket;

@Repository
public interface TicketRepo extends JpaRepository<Ticket, String> {

}
