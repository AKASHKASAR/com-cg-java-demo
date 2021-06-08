package com.cg.demo.ex;

public class DemoException {
	
	public static void main(String[] args) {
		int i = 5;
		try {
			if(i<10) {
				throw new MyException("Error");
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		
		
	}
	}

}
