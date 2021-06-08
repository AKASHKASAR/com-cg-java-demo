package com.cg.demo.oop;

// Method = DRY - don't repeat yourself

public class MethodDemo2 {
	
	static void MakeCoffee()
	{
		System.out.println("water");
		System.out.println("boil");
		System.out.println("milk");
		System.out.println("sugar");
		System.out.println("serve");
	}

	public static void main(String[] args) {
		
		System.out.println("");
		
		MakeCoffee();
		MakeCoffee();
		MakeCoffee();
		MakeCoffee();

	}

}
