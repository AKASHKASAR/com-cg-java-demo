package com.cg.demo.multi;

public class ThreadDemo implements Runnable{
	
	void printLoop() {

		for(int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
			
		}
	}
	public void run() {
		this.printLoop();
	}
	
		public static void main(String[] args) {
		
			
			Thread obj = new Thread ((Runnable) new ThreadDemo());
			Thread obj1 = new Thread ((Runnable) new ThreadDemo());
			Thread obj2 = new Thread ((Runnable) new ThreadDemo());
			
			obj.start();
			obj1.start();
			obj2.start();
//			obj.printLoop();
//			obj1.printLoop();
//			obj2.printLoop();
	}
}