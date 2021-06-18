package com.cg.demo.conc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExPatDemo implements Runnable {

	
	public static void main(String[] args) {
		
		
			//1. Using thread object
//			for(int i =1;i <=10;i++) {
//			Thread thread = new Thread(new App());
//			thread.start();
//	}
		
			ExPatDemo exp = new ExPatDemo();
//			1. using newSIngleThreadExecutor() method
//			ExecutorService exService = Executors.newSingleThreadExecutor();
			
//			2.
//			ExecutorService exService = Executors.newCachedThreadPool();
			
//			3.
//			ExecutorService exService = Executors.newFixedThreadPool(3);
		
//			4.
			ExecutorService exService = Executors.newScheduledThreadPool(3);
			
			for(int i = 1; i<=10;i++) {
				exService.execute(exp);
			}
			exService.shutdown();
	}
	
	@Override
	public void run() {
		for(int i =1;i <=10;i++) {
			System.out.println(Thread.currentThread().getName()+" - "+ i);
		}
		
	}

}
