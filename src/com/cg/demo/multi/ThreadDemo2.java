package com.cg.demo.multi;

public class ThreadDemo2 extends Thread {

	public void printLoop() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);

		}
	}

	@Override
	public void run() {
		this.printLoop();
	}

	public static void main(String[] args) {

		ThreadDemo2 obj = new ThreadDemo2();
		ThreadDemo2 obj2 = new ThreadDemo2();
		ThreadDemo2 obj3 = new ThreadDemo2();
//		obj.start();
//		obj2.start();
//		obj3.start();
		obj.printLoop();
		obj2.printLoop();
		obj3.printLoop();
	}
}