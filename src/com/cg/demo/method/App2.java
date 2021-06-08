package com.cg.demo.method;

public class App2 {

	public static void main(String[] args) {
		
		
		
		Product obj = new Product();
		obj.MRP = 1002;
		obj.ProductID = 100;
		obj.ProductName = " aksah";
		obj.Quantity = 200;
		System.out.println(obj.toString());
		
		Product obj1 = new Product(100, 01, "DaburHoney", 100);
		System.out.println(obj1.toString());
		
		Product obj2 = new Product(100, 01, "DaburHoney", 100);
		System.out.println(obj2.toString());
		
		Product obj3 = new Product(100, 01, "DaburHoney", 100);
		System.out.println(obj3.toString());
		
		Product obj4 = new Product(100, 01, "DaburHoney", 100);
		System.out.println(obj4.toString());
		
	}
}
