package com.training.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.domains.Invoice;

public class CollectionInjection {

	public static void main(String[] args) {

		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Coll_Injection.xml");
		
		Invoice invoice = ctx.getBean(Invoice.class);
		
		System.out.println("invoice Number: "+ invoice.getInvoiceNumber());
		System.out.println("Customer: " + invoice.getCustomer());
		System.out.println("Address : "+ invoice.getCustomer().getAddr());
		System.out.println("Items :" + invoice.getItemList());
		System.out.println("Taxes: "+ invoice.getTaxes());
	}

}
