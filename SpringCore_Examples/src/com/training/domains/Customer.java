package com.training.domains;

import java.util.logging.Logger;

public class Customer {

	Logger log = Logger.getLogger(this.getClass().getName());
	
	private int customerId;
	private String customerName;
	private long phoneNumber;

	private Address addr;
	
	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public Customer() {
		super();

		log.info("Customer initialized");
	}
	
	public Customer(int customerId, String customerName, long phoneNumber) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
	}

	

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", phoneNumber=" + phoneNumber
				+ ", addr=" + addr + "]";
	}

	
}
