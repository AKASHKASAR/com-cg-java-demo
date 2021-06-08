package com.cg.demo.basic;

import java.util.Scanner;

public class ForLoopPrime {

	
	static boolean primeNot(int num){
		// TODO Auto-generated method stub
		
			if(num<=1) {
				return false;
			}
			
			//check if num==2
			else if(num==2) {
				return true;
			}
			
			//checking for multiple of 2
			else if(num%2==0) {
				return false;
			}
			
			//check condition for odd digit
			for(int j=3;j<Math.sqrt(num);j+=2) {
				if(num%j==0) {
					return false;
				}
			}
		return true;
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int n=0;
		System.out.println("Prime Numbers : ");
		while(n<num) {
			if(primeNot(n)) {
				System.out.print(n+" ");				
			}
			n++;
		}

	}

}
