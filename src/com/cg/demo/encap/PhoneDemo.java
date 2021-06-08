package com.cg.demo.encap;




class FeaturePhone extends Phone{   //inheritance using extends
	void music() {
		System.out.println("Playing Music...");
	}
}

class SmartPhone extends FeaturePhone{ // can extends Phone also
	void camera() {
	System.out.println("Click Pix..");	
	}
	
}
public class PhoneDemo {
	
	public static void main(String[] args) {
		
		Phone phone = new Phone();
		phone.call();
		phone.SMS();
		FeaturePhone featurePhone = new FeaturePhone();
		featurePhone.music();
		featurePhone.call();
		featurePhone.SMS();
		
		SmartPhone smartPhone = new SmartPhone();
		smartPhone.camera();
		smartPhone.call();
		smartPhone.SMS();
		smartPhone.music();
		
		
		
	}

}
