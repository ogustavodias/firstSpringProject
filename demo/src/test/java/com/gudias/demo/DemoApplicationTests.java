package com.gudias.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.gudias.domain.Customer;
import com.gudias.repository.ICustomerRepository;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private ICustomerRepository repository;

	@Test
	void insertCustomer() {
		Customer customer = Customer.builder().name("Gustavo Alves Dias").build();
		repository.save(customer);
	}

}
