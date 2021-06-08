package com.cg.demo.asc;

public class WrapperDemo {
	public static void main(String[] args) {
		
		String name = "AKash";
		
		int num = 10;
		
		Integer num2 = 10;
		
//		Integer. =static methods
//		num2. = non static
		
		WrapperDemo obj = new WrapperDemo();

		WrapperDemo obj2 = new WrapperDemo();
		
		//obj.
		
		System.out.println(obj.toString());

		System.out.println(obj2.hashCode());
		
		System.out.println(obj.equals(obj2));
		
		System.out.println(obj == obj2);



	}
}
