package com.cg.demo.conc;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.cg.demo.col.Employee;

public class Emp implements Callable <Employee> {
	
	public static void main(String[] args)  throws InterruptedException, ExecutionException{
		
		Emp emp = new Emp();
		
		ExecutorService exservice = Executors.newSingleThreadExecutor();
		
		Future<Employee> future = exservice.submit(emp);
		
		Employee abc = future.get();
		
		System.out.println(abc);
		
		
		exservice.shutdown();
		
	}

	public Employee call() throws Exception {

		Employee A = new Employee(22, "Akash Kasar", 30000);
		return A;
	}
}
