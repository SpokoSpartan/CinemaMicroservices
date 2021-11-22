package com.spot.on.cinema.ticket.get_movie;

import com.spot.on.cinema.ticket.config.properties.MovieServiceEndpoints;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@RequiredArgsConstructor
public class GetMovieClient {

	private final RestTemplate restTemplate;
	private final MovieServiceEndpoints endpoints;

	public GetMovieResponse getMovieById(String movieId) {
		return restTemplate.getForObject(
				endpoints.getMovieById(),
				GetMovieResponse.class,
				movieId
		);
	}

}
