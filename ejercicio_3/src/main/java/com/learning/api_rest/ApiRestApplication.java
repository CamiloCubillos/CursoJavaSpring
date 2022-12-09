package com.learning.api_rest;

import com.learning.api_rest.controller.HelloController;
import com.learning.api_rest.entity.Laptop;
import com.learning.api_rest.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class ApiRestApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ApiRestApplication.class, args);

		LaptopRepository laptopRepository = context.getBean(LaptopRepository.class);

		Laptop l1 = new Laptop(null,199.99,10,"Asus","F500");
		Laptop l2 = new Laptop(null, 399.99, 5, "Alienware","Gaming-TUX20");
		laptopRepository.save(l1);
		laptopRepository.save(l2);
	}
}
