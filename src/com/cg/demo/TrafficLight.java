package com.cg.demo;

import java.util.Scanner;

public class TrafficLight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Traffic Light : ");
		a = sc.next();
		
		if( a.equalsIgnoreCase("red"))
		{
			System.out.println(" STOP");
		}
		if( a.equalsIgnoreCase("yellow"))
		{
			System.out.println(" READY");
		}
		if( a.equalsIgnoreCase("green"))
		{
			System.out.println(" GO");
		}
		
	}

}
