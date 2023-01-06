package com.example.ticket.tracking.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ticket.tracking.domain.TicketTracking;
import com.example.ticket.tracking.repository.TicketRepository;

	@Service
public class TicketService {
	@Autowired
	private TicketRepository repo;
	public List<TicketTracking> listAll(){
		return repo.findAll();
	}
	
		public void save(TicketTracking Title) {
			repo.save(Title);
	}
		public TicketTracking get(String  Title)
		{
			return repo.findById(Title).get();
		}

	public void delete(String  Title)
	{
		 repo.deleteById(Title);
	}
	
}