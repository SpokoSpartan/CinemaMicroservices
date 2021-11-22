package com.spot.on.cinema.ticket.order_ticket;

import lombok.Value;

@Value
public class OrderTicketCommand {

	String movieId;
	String userId;

}
