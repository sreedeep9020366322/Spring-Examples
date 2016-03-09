package com.training.apps;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.domains.Customer;

public class InjectSimpleValues {

	public static void main(String[] args) {
		
		BeanFactory container = new ClassPathXmlApplicationContext("bean.xml");
		
		Customer cust1 = (Customer) container.getBean("custBean1");
		
		Customer cust2 = container.getBean("custBean1",Customer.class);
		
		Customer cust3 = container.getBean(Customer.class);
		
		System.out.println("Customer " +cust1);
		System.out.println("Customer 1 hash code: " + cust1.hashCode());
		
		System.out.println("Customer " +cust2);
		System.out.println("Customer 2 hash code: " + cust2.hashCode());
		
		System.out.println("Customer " +cust3);
		System.out.println("Customer 3 hash code: " + cust3.hashCode());
	}
}
