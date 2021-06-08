package com.cg.demo.basic;
import java.util.*;

public class SumofSquare {

	public void sos(int n) {
		double sum=0.0d;
		double sum1 = 0.0d;
		for(int i = 1; i<=n ; i++) {
			double d = i*i;
			System.out.println(i+" : "+d);
			sum +=d;
		}
		System.out.println("Sum : "+sum);
		
		for(int j = 1;j<=n;j++) {
			sum1 = sum1 + j;

		}
		
		System.out.println("Sum of Numbers:" +sum1);
		double sum2 = sum1*sum1;
		System.out.println("Square of Sum 1 : "+sum2);
		System.out.println("Difference : "+(sum-sum2));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		SumofSquare ss = new SumofSquare();
		ss.sos(n);
	}
	

}
