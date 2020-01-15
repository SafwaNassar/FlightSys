package io.FlightsBookingSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.FlightsBookingSystem.Model.Ticket;
import io.FlightsBookingSystem.Service.TicketService;
//Ticket Controller Class

@RestController
public class TicketController {

	@Autowired
	private TicketService ticketService;	
	
//	using instance of ticket service to show all tickets using the below URL
	@RequestMapping("/tickets")
	public List<Ticket> getAllTickets(){
		return ticketService.getAllTickets();
	}	
	
	
//	using instance of ticket service to show one ticket by his ID using the below URL
	@RequestMapping("/tickets/{id}")
	public Ticket getTicket(@PathVariable String id){
		return ticketService.getTicket(id);
	}


//	using instance of ticket service to add new ticket using the below URL
	@RequestMapping(method = RequestMethod.POST, value = "/addTicket")
	public void addTicket(@RequestBody Ticket ticket){
		ticketService.addTicket(ticket);
	}	

	
//	using instance of ticket service to update specific ticket by his ID using the below URL
	@RequestMapping(method = RequestMethod.PUT, value = "/admin/tickets/{id}")
	public void addTicket(@RequestBody Ticket ticket, @PathVariable String id){
		ticketService.updateTicket(id,ticket);
	}
	
	
//	using instance of ticket service to delete specific ticket by his ID using the below URL
	@RequestMapping(method = RequestMethod.DELETE, value = "/tickets/{id}")
	public void deleteTicket(@RequestBody Ticket ticket, @PathVariable String id){
		ticketService.deleteTicket(id);
	}

}
