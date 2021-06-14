package com.cg.demo.fun;

import java.util.Scanner;

//1.By Implementing the Interface:
//public class LambdaDemo implements MyInt {
//	public static void main(String[] args) {
//		LambdaDemo obj = new LambdaDemo();
//		obj.absMethod();
//	}
//	@Override
//	public void absMethod() {
//		System.out.println("absMethod");
//	}
//}

//2.By anonymous inner class 

public class LambdaDemo{
	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
	        System.out.println("1 Palindrome number");
	        System.out.println("2 Prime number");
	        System.out.println("3 Quit");
	        System.out.print("Enter your choice: ");
	        int choice = in.nextInt();
	        System.out.print("Enter A number: ");
	        int num = in.nextInt();

	        switch (choice) {
	            case 1:
	            int copyNum = num;
	            int revNum = 0;

	            while(copyNum != 0) {
	                int digit = copyNum % 10;
	                copyNum /= 10;
	                revNum = revNum * 10 + digit;
	            }

	            if (revNum == num) 
	                System.out.print(num + " is palindrome");
	            else
	                System.out.print(num + " is not palindrome");
	            break;

	            case 2:
	            	int c = 0;
	                for (int i = 1; i <= num; i++) {
	                    if (num % i == 0) {
	                        c++;
	                    }
	                }
	                if (c == 2) 
	                    System.out.print(num + " is Prime");
	                else
	                    System.out.print(num + " is not Prime");
	                break;

	            default:
	            System.out.println("quit");
	            break;
	        }
	    
	
	}
}

