package com.mattressrun.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@SpringBootApplication
@EnableJdbcRepositories
public class MattressrunCoreServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MattressrunCoreServiceApplication.class, args);
	}

}
