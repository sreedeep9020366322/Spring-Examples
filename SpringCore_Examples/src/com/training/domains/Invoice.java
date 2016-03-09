package com.training.domains;

import java.util.HashMap;
import java.util.List;

public class Invoice {

	private long invoiceNumber;
	private Customer customer;
	private double amount;
	
	private List<Item> itemList;
	
	private HashMap<String, Double> taxes;
	
	public HashMap<String, Double> getTaxes() {
		return taxes;
	}
	
	public void setTaxes(HashMap<String, Double> taxes) {
		this.taxes = taxes;
	}

	public List<Item> getItemList() {
		return itemList;
	}
	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}
	public long getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(long invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Invoice(long invoiceNumber, Customer customer, double amount) {
		super();
		this.invoiceNumber = invoiceNumber;
		this.customer = customer;
		this.amount = amount;
	}
	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Invoice [invoiceNumber=" + invoiceNumber + ", customer=" + customer + ", amount=" + amount
				+ ", itemList=" + itemList + ", taxes=" + taxes + "]";
	}

	
	
}
