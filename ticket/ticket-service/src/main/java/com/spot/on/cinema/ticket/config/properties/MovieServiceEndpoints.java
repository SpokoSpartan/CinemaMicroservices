package com.spot.on.cinema.ticket.config.properties;

import lombok.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@Value
@ConstructorBinding
@ConfigurationProperties(prefix = "movie-service.endpoints")
public class MovieServiceEndpoints {

	String movieById;

}
