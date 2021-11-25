package com.spot.on.cinema.banner;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

@ConditionalOnClass(BannerLogger.class)
public class BannerLoggerAutoConfiguration {

	@Bean
	@ConditionalOnMissingBean
	public BannerLogger bannerLogger() {
		return new BannerLogger();
	}


}
