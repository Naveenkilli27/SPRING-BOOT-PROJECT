package com.example.spring.mysql.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.mysql.api.dao.TicketDao;
import com.example.spring.mysql.api.model.Ticket;

@Service
public class TicketService {
	
	@Autowired
	private TicketDao td;
	
	public Ticket insert(Ticket ticket) {
		return td.save(ticket);
	}
	public List<Ticket> insertAll(List<Ticket> tickets){
		return td.saveAll(tickets);
	}
	public Ticket getTicketById(int id) {
		return td.findById(id).orElse(null);
	}
	public List<Ticket> getTickets(){
		return td.findAll();
	}
	public String deleteTicket(int id) {
		td.deleteById(id);
		return "ticket removed || "+id;
	}
	public Ticket updateTicket(Ticket ticket) {
		Ticket existingTicket=td.findById(ticket.getId()).orElse( null);
		existingTicket.setAmount(ticket.getAmount());
		existingTicket.setCatagory(ticket.getCatagory());
		return td.save(existingTicket);
	}

}
