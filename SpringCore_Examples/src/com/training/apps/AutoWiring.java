package com.training.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.domains.Customer;
import com.training.domains.Invoice;

public class AutoWiring {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("AutoWire.xml");
		
		Invoice invoice = ctx.getBean(Invoice.class);
		
		System.out.println("invoice " + invoice);
		System.out.println("add" + invoice.getCustomer().getAddr());
	}

}
