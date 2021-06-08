package com.cg.demo.basic;

import java.util.Scanner;

public class PrimeNo {
	
	static int CheckPrime(int a) {
		int x= 0; 
		
		for(x=2; x< a-1;x++) 
		{
			if(a%x == 0) {
				return 0;
			}
		}
		if(x==a)
		{
			return 1;
		}
		
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("ENter No. : ");
		int n = sc.nextInt();
		
		
		
		
		for( int i = 0; i < n; i++)
		{
			if(CheckPrime(i) == 1)
			{
				System.out.println("Prime Number : " + i);
			}
		}
		
	}

}
