package com.cg.demo;

public class IfDemo {

	public static void main(String[] args) {
		
		int salary = 10000;
		int leaves = 04;
		
		int expectedsalary = 12000;
		int expectedleaves = 2;
		
		
		if(salary >= expectedsalary)
		{
			System.out.println("Join this company");
		}
		else
		{
			System.out.println("Do not Join.");
		}
		
		if((salary >= expectedsalary) || (leaves >= expectedleaves))
		{
			System.out.println("Join the COmpany.");
		}
		else
		{
			System.out.println("DO not Join.");
		}
		
		
		

	}

}
