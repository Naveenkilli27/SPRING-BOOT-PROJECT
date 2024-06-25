package com.example.spring.mysql.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.mysql.api.model.Ticket;
import com.example.spring.mysql.api.service.TicketService;

@RestController
public class TicketController {
	
@Autowired
private TicketService ts;
@PostMapping("/insert")
public Ticket insert(@RequestBody Ticket ticket) {
	return ts.insert(ticket);
}
@PostMapping("/insertall")
public List<Ticket> insertall(@RequestBody List<Ticket> tickets){
	return ts.insertAll(tickets);
}
@GetMapping("/Ticket/{id}")
public Ticket findTicketById(@PathVariable int id) {
	return ts.getTicketById(id);
}
@GetMapping("/Tickets")
public List<Ticket> findAllTicket(){
	return ts.getTickets();
}
@PutMapping("/update")
public Ticket updateTicket(@RequestBody Ticket ticket) {
	return ts.updateTicket(ticket);
}
@DeleteMapping("/delete/{id}")
public String delete(@PathVariable int id) {
	return ts.deleteTicket(id);
}
}

