package com.service.registry.registrySample.registrySample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RegistrySampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistrySampleApplication.class, args);
	}
}
