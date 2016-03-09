package com.training.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.domains.Customer;

public class Const_RefBean {

	public static void main(String[] args) {

		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean2.xml");
		
		Customer customer1 = ctx.getBean(Customer.class);
		
		System.out.println(customer1);
		System.out.println(customer1.getAddr());
	}

}
