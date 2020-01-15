package io.FlightsBookingSystem.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.FlightsBookingSystem.Model.Ticket;
import io.FlightsBookingSystem.Repo.TicketRepo;

@Service
public class TicketService {
	@Autowired
	private TicketRepo ticketRepo;
	
//	Array list return all tickets in the Database
	public List<Ticket> getAllTickets() {
		List<Ticket> tickets = new ArrayList<>();
		ticketRepo.findAll()
		.forEach(tickets ::add);
		return tickets;
	}

//	method return an ticket with key"ID" from the Database
	public Ticket getTicket(String id) {
		return ticketRepo.findById(id).get();
	}

//	method add ticket to the Database
	public void addTicket(Ticket ticket) {
		ticketRepo.save(ticket);
		
	}
	
//	method update ticket in the Database
	public  void updateTicket(String id, Ticket ticket) {
		ticketRepo.save(ticket);
	}
	
//	method delete ticket from the Database
	public void deleteTicket(String id) {
		ticketRepo.deleteById(id);

	}
}
