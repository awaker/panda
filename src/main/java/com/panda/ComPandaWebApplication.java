package com.panda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ComPandaWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComPandaWebApplication.class, args);
	}
}
