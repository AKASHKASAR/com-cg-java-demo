package com.cg.demo.ex;

public class ThrowDemo {
	
	public static void checkEligibility(int age) {
		
		if(age<18) {
		//	System.out.println("Cannot Vote");
			throw new ArithmeticException("Cannot Vote")
		}
		else {
			System.out.println("Can Vote");
		}
	}

	public static void main(String[] args) {
		System.out.println("Election:");
		checkEligibility(19);
	}
	
}
