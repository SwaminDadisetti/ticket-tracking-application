package com.example.ticket.tracking.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TicketTracking {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private String Tickettitle;
private String Ticketdescription;
private long date;
public TicketTracking() {
	super();
	// TODO Auto-generated constructor stub
}
public TicketTracking(String tickettitle, String ticketdescription, long date) {
	super();
	Tickettitle = tickettitle;
	Ticketdescription = ticketdescription;
	this.date = date;
}
public String getTickettitle() {
	return Tickettitle;
}
public void setTickettitle(String tickettitle) {
	Tickettitle = tickettitle;
}
public String getTicketdescription() {
	return Ticketdescription;
}
public void setTicketdescription(String ticketdescription) {
	Ticketdescription = ticketdescription;
}
public long getDate() {
	return date;
}
public void setDate(long date) {
	this.date = date;
}

}
