package com.cpd.quickcart.eureka_server_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApiApplication.class, args);
	}

}
