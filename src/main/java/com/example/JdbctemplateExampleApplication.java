package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.model.Customer;
import com.example.service.CustomerService;

@SpringBootApplication
@ComponentScan("com.example.dao.impl, com.example.service.impl")
public class JdbctemplateExampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JdbctemplateExampleApplication.class, args);
		CustomerService customerService = context.getBean(CustomerService.class);
		
		Customer customer = new Customer(111, "Swarup", 32);
		customerService.insert(customer);
		
		Customer customer1 = new Customer(222, "Swarup", 32);
		Customer customer2= new Customer(333, "Swarup", 32);
		Customer customer3 = new Customer(444, "Swarup", 32);
		List<Customer> custList = new ArrayList<>();
		custList.add(customer1);
		custList.add(customer2);
		custList.add(customer3);
		
		customerService.insertBatch(custList);
		
		
		System.out.println("App Exit");
		
	}
}
