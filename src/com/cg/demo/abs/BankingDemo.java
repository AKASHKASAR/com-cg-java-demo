package com.cg.demo.abs;

	interface CentralGovnRules{
		public abstract void payintrest();
	}
	
	interface StateGovnRules{
		public abstract void giveloan();
	}
	
	

	abstract class RBI{
		abstract void doKYC();
		
		void openAcc() {
			System.out.println("Open Acc");
		}
	}
	

	
abstract class HDFC extends RBI implements CentralGovnRules, StateGovnRules{
	public void doKYC() {
		System.out.println("Aadhar");
	}
	
	public void giveLoan() {
		System.out.println("HDFC is Giving Loan..");
	}
	
	public void payIntrest() {
		System.out.println("HDFC is Paying intrest..");
	}
	
	
	
	
}
	
	
	
	
public class BankingDemo {
	
public static void main(String[] args) {
	
	HDFC hdfc = new HDFC();
	hdfc.doKYC();
	hdfc.giveLoan();
	hdfc.payIntrest();
	hdfc.openAcc();
}
}
