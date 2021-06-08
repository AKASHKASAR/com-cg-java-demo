package com.cg.demo.basic;

import java.util.Scanner;

public class Fibbonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Number : ");
			int n = scan.nextInt();
			int num1 = 1, i=0, num2 = 0, Nxterm = num1 + num2;
			
			for(i=0;i<n;i++)
			{
				Nxterm = num1 + num2;
				System.out.println("Number : " + Nxterm);
				num1 = num2;
				num2 = Nxterm;
			}
			
			
	}

}
