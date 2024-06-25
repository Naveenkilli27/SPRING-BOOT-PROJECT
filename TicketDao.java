package com.example.spring.mysql.api.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.spring.mysql.api.model.Ticket;

public interface TicketDao extends JpaRepository<Ticket, Integer>{

}
