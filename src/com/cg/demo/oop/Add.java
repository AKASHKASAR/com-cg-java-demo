package com.cg.demo.oop;

public class Add {

	static void someMethodName() { // no parameter no arguements
		
	System.out.println("some output");
	}
	
	static void Addition(int a, int b) { // parameters var in meth sign.
		
		a = a +100; // next level
		
		System.out.println(a + b); //statements
	}
	
	public static void main(String[] args) {
		
		System.out.println("start");
		
		someMethodName(); // no parameter no arguements
		Addition(10, 20); //arguements (values in method call) 
		Addition(12, 23);
	}
}
