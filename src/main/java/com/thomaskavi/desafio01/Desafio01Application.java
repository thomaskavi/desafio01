package com.thomaskavi.desafio01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.thomaskavi.desafio01.entities.Order;
import com.thomaskavi.desafio01.services.OrderService;

@SpringBootApplication
public class Desafio01Application implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(Desafio01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Order order1 = new Order(1034, 150.00, 20.0);
		Order order2 = new Order(2282, 800.00, 10.0);
		Order order3 = new Order(1309, 95.90, 0.0);

		System.out.println("Pedido código: " + order1.getCode());
		System.out.println("Valor total: R$" + orderService.total(order1));
		System.out.println();

		System.out.println("Pedido código: " + order2.getCode());
		System.out.println("Valor total: R$" + orderService.total(order2));
		System.out.println();

		System.out.println("Pedido código: " + order3.getCode());
		System.out.println("Valor total: R$" + orderService.total(order3));

	}

}
