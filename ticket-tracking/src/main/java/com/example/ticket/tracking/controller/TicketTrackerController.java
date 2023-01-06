package com.example.ticket.tracking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.ticket.tracking.domain.TicketTracking;
import com.example.ticket.tracking.services.TicketService;

@Controller
public class TicketTrackerController {
	@Autowired
	private TicketService  service;
	@GetMapping("/")
	public String viewHomePage(Model model) {
		List<TicketTracking>listTicketTracking=service.listAll();
		model.addAttribute("listTitle", listTicketTracking);
		System.out.println("Get/");
		return "index";
	}
		@GetMapping("/new")
		public String add(Model model){
			model.addAttribute("TicketTracking", new TicketTracking());
			return "new";
	}
		@RequestMapping( value = "/save",method = RequestMethod.POST)
		public String saveTicketTracking(@ModelAttribute("Title" )TicketTracking Title){
			service.save(Title);
			return "redirect:/";
		}
		@RequestMapping("/edit/{Title}")
		public ModelAndView showEditTicketTrackingpage(@PathVariable(name="Title") String id){
			ModelAndView mav= new ModelAndView("new");
			TicketTracking Title = service.get(id);
			mav.addObject("TicketTracking",Title);
			return mav;
		}
		@RequestMapping("/delete/{Title}")
		public  String deleteTicketTracking(@PathVariable(name ="Title") String id) {
			service.delete(id);
			return "redirect:/";
		}
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

