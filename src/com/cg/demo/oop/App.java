package com.cg.demo.oop;
// static - free access - booking window
// non static - restricted access - cinema hall

class Employee{
	// attributes - fields
	int id;
	String name;
	double salary;
	
	//functionalities - methods
	void work()
	{
		System.out.println("Employee Works!");
	}
}
public class App {

	public static void main(String[] args) {
		
		Employee obj = new Employee();
		
		obj.id = 101;
		obj.name = "AKash";
		obj.salary = 100.6;
		
		
		System.out.println(obj.id + " " + obj.name + " " + obj.salary);
	 obj.work();
		
	}

}
