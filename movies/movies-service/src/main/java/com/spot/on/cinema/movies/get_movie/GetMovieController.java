package com.spot.on.cinema.movies.get_movie;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class GetMovieController {

	private final GetMovieService service;

	@GetMapping("/get-movie/{id}")
	public GetMovieResponse getMovie(@PathVariable("id") String movieId) {
		return service.getMovieById(movieId);
	}

}
