package com.sk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class WebapponeApplication extends SpringBootServletInitializer {

	public static final Logger logger = LoggerFactory.getLogger(WebapponeApplication.class);

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		logger.debug("configure");
		return builder.sources(WebapponeApplication.class);
	}

	public static void main(String[] args) {
		logger.debug("main");
		SpringApplication.run(WebapponeApplication.class, args);
	}

}
