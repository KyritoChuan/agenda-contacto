package com.api.agenda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({ "com.api.agenda.controllers", "com.api.agenda.dao", "com.api.agenda.services" })
@EntityScan({ "com.api.agenda.models" })
@EnableJpaRepositories({ "com.api.agenda.dao", "com.api.agenda.repositories" })
@SpringBootApplication
public class AgendaContactoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgendaContactoApplication.class, args);
	}

}
