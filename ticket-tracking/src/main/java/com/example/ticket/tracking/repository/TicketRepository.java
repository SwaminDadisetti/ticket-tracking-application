package com.example.ticket.tracking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ticket.tracking.domain.TicketTracking;



@Repository
public interface TicketRepository extends JpaRepository<TicketTracking ,String>{

}
