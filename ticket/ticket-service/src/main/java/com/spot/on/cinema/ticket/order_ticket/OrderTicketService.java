package com.spot.on.cinema.ticket.order_ticket;

import com.spot.on.cinema.ticket.get_movie.GetMovieClient;
import com.spot.on.cinema.ticket.get_movie.GetMovieResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class OrderTicketService {

	private final GetMovieClient client;

	public OrderTicketResponse orderTicket(OrderTicketCommand command) {
		GetMovieResponse movieResponse = client.getMovieById(
				command.getMovieId()
		);
		log.info("Movie obtained from movie-service. Name of the movie: {}", movieResponse.getMovieName());
		return new OrderTicketResponse(UUID.randomUUID().toString());
	}

}
