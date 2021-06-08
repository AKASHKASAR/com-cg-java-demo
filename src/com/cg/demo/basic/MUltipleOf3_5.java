package com.cg.demo.basic;

import java.util.Scanner;

public class MUltipleOf3_5 {
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any no.");
		
		int i = sc.nextInt();
		
		 int sum=0;
		
		for(int j=0;j<=i;j++) {
			
			if(j%3==0 || j%5 == 0) {
				
				 sum += j;
			}
			
			
		}
		System.out.println(i+ " : "+sum);
		
		

	}

}
