package com.cg.demo.ex;

class RBI {
	public static void notes() throws InterruptedException{
		for (int i = 1; i <= 10; i++) {
			
				Thread.sleep(500);
			System.out.println(i);
		}
	}

}

class HDFC{
	public static void dispenceNotes() throws InterruptedException{
		RBI.notes();
	}
}

public class ThrowsDemo {

	public static void main(String[] args) {

	}
//	public static void m1() {
//		System.out.println(10 / 0);
//	}
//	
//	public static void m2() {
//		try{
//			ThrowsDemo.m1();
//		}catch(ArithmeticException ae){
//			System.out.println("Wrong "+ ae.toString());
//		}
//	}
//	
//	public static void m3() {
//		ThrowsDemo.m2();
//	}
//	
//	public static void main(String[] args) {
//		System.out.println("Start");
//		ThrowsDemo.m3();
//		System.out.println("End");
//	}
}
