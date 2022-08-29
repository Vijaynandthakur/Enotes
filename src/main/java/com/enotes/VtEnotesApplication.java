package com.enotes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing        //why we have use here enableJpa Auditing for add notes
public class VtEnotesApplication {

	public static void main(String[] args) {
		SpringApplication.run(VtEnotesApplication.class, args);
	}

}
