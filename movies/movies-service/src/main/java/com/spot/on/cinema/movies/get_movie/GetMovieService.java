package com.spot.on.cinema.movies.get_movie;

import org.springframework.stereotype.Service;

@Service
public class GetMovieService {

	public GetMovieResponse getMovieById(String movieId) {
		return new GetMovieResponse(movieId, "My favourite movie!");
	}

}
