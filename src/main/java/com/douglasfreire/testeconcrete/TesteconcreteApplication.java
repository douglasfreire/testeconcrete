package com.douglasfreire.testeconcrete;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EntityScan(basePackages = {"com.douglasfreire.testeconcrete.entities"})
@EnableJpaRepositories(basePackages = {"com.douglasfreire.testeconcrete.repositories"})
@EnableTransactionManagement
@SpringBootApplication
public class TesteconcreteApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteconcreteApplication.class, args);
	}

}
