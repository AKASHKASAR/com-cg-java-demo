package com.cg.demo.col;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class EmpDemo {
	
	public static void main(String[] args) {
			
	Employee emp = new Employee();
	
	List<Employee> empList = new ArrayList<Employee>();
	
	empList.add(emp);
	empList.add(new Employee());
	empList.add(new Employee(103, "akash" , 102.3));
//	empList.add("akash");
//	empList.add("akash");
		
	System.out.println("Iterate Using For Loop");
	
	for(int i = 0 ; i<empList.size();i++) {
		System.out.println(empList.get(i).toString());
	}
	
	System.out.println("Iterate using for each loop");
	
	
	for(Employee e : empList) {
		System.out.println(e.toString());
	}
	
	System.out.println("Iterate using Iterator");
	Iterator<Employee>iterator = empList.iterator();
	
	while(iterator.hasNext()) {
		System.out.println(iterator.next().toString());
	}
	
//	empList.forEach();
	
//	empList.add("aaa");
//	empList.add(delete);
//	
//	Stack stack = new Stack();
//	Vector vector = new Vector (3, 3);
//	System.out.println(stack.size());
//	System.out.println(stack.capacity());
	
	}

}
