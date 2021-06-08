package com.cg.demo.ex;

class CouponsException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	CouponsException() {
		super("You Are Not able to Use Coupons");

	}

	}

public class UserDefineChecked {
	public static void main(String[] args) throws CouponsException {
		int Coupons =10;
		try {
			if (Coupons < 5) {
			throw new CouponsException();
		}
		catch(Exception e) {
			System.out.println(e + "You Can Use Coupons Now");
		}
		
		
	}

}