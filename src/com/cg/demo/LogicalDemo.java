package com.cg.demo;
import java.util.Scanner;

public class LogicalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter your salary:");
		int num1 = sc.nextInt();
		
		System.out.println("salary offered:");
		int num2 = sc.nextInt();
		
		System.out.println(" Current Leavs : ");
		int num3 = sc.nextInt();
		
		System.out.println("Leavs Offered:");
		int num4 = sc.nextInt();
		
		if (num1 < num2) {
			
			System.out.println("Join the company");
		}
		else 
		{
			System.out.println(" DO not join.");
		}
		
		
		System.out.println((num1 < num2 ) || (num3 < num4));
		System.out.println((num1 < num2 ) && (num3 < num4));
	}

}
