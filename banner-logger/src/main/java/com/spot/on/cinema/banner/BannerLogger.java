package com.spot.on.cinema.banner;

import java.util.logging.Logger;

public class BannerLogger {

	private static final Logger LOGGER = Logger.getLogger(BannerLogger.class.getName());

	private static final String FIRST_LINE = ".  .                .     __.       ,       ";
	private static final String SECOND_LINE = "|  | _   * _.* _  _.|_   (__ ._  _ -+- _ ._ ";
	private static final String THIRD_LINE = "|/\\|(_)  |(_.|(/,(_.[ )  .__)[_)(_) | (_)[ )";
	private static final String FOURTH_LINE = "       ._|                   |              ";

	public BannerLogger() {
		LOGGER.info(FIRST_LINE);
		LOGGER.info(SECOND_LINE);
		LOGGER.info(THIRD_LINE);
		LOGGER.info(FOURTH_LINE);
	}

}
