package com.cg.demo.basic;

import java.util.Scanner;

public class PrimeNo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Scanner sc = new Scanner(System.in);
		int i,j,n,c;
		System.out.println("ENter No. : ");
		n = sc.nextInt();
		System.out.println("Prime Numbers are : ");
		
		for(i = 2; i<=n ; i++)
		 {
	         c=0;
	         for(j=1;j<=i;j++)
	         {
	        	     if(i%j==0)
	        	     {
	        	         c++;
	        	     }
	         }
	         
	       if(c==2)
	       {
	             System.out.print(i+" ");
	         }
	     }
		
		
	}

}
