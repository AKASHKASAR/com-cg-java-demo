package com.cg.demo;

import java.util.Scanner;

public class SumofCube {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter any no. : ");
		
		int n = input.nextInt();
		
		int sum = 0;
		
		for(int i=1;i<=n;i++)
		{	
			sum += (i*i*i);
			System.out.println(sum);
		}
		System.out.println("Sum Of Cubes : " +sum);
	}

}
