package com.gokul.flightcheckin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan({"com"})
@SpringBootApplication
public class FlightcheckinApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightcheckinApplication.class, args);
	}

}
