package com.spot.on.cinema.ticket.order_ticket;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class OrderTicketController {

	private final OrderTicketService service;

	@PostMapping("/order")
	public ResponseEntity<OrderTicketResponse> orderTicket(@RequestBody OrderTicketCommand command) {
		return ResponseEntity.ok(service.orderTicket(command));
	}

}
