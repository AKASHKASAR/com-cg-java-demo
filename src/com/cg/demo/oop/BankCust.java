package com.cg.demo.oop;

//member = member or field
//access static member in static context - free access - class reference
//access static member in non static context - free access - class reference
//access non static member in static context - restricted access - object reference
//access non static member in non static context - restricted access - ??? reference

public class BankCust {

	static int ifsc = 13344;
	int accno;
	String name;
	double balance;
	// non static context
	void checkBalance() 
	{
		System.out.println(BankCust.ifsc); // 2.
		System.out.println(ifsc);//2
			System.out.println("Balance");
	}
	//static context
	static void openAcc()
	{
		System.out.println(BankCust.ifsc); // 1.
		System.out.println(ifsc);//1
		System.out.println("Open An Account.");
		
		BankCust obj = new BankCust(); //3
		System.out.println(obj.balance); //3
	}
	
	public static void main(String[] args) {
		
		BankCust c1 = new BankCust();
		
		c1.accno = 1233;
		c1.name = "AKash KAsar";
		c1.balance = 131232;
		
		System.out.println(c1.accno +" " + c1.name + " " +c1.balance);
		
		c1.checkBalance(); //method invocation
		//checkBalance();
		//System.out.println(balance);
		System.out.println(c1.balance);
		
		openAcc();
		System.out.println(ifsc);
		System.out.println(c1.ifsc);
	}
}
