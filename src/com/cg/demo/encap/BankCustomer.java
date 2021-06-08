package com.cg.demo.encap;

//encap= bind data and code together.

public class BankCustomer {

	private double balance;
	
	double checkBalance() {
		return balance;
	}
	
	double withdraw(double amount) {
		
		balance -= amount;
		return balance;
		
		
	}

	double deposit (double amount) {
		
		balance += amount;
		return balance;
		
		
	}

	
}
