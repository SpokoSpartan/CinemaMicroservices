package com.spot.on.cinema.ticket.order_ticket;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderTicketService {

	public OrderTicketResponse orderTicket(OrderTicketCommand command) {
		return new OrderTicketResponse(UUID.randomUUID().toString());
	}

}
