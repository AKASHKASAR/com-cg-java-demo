package com.cg.demo.method;

public class Product {

	int MRP;
	int ProductID;
	String ProductName;
	double Quantity;
	
	void outputOfProduct() {
		System.out.println("Product is Working..!!");
	}
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Product(int mRP, int productID) {
		super();
		MRP = mRP;
		ProductID = productID;
	
	}

	public Product(int mRP, int productID, String productName, double quantity) {
		super();
		MRP = mRP;
		ProductID = productID;
		ProductName = productName;
		Quantity = quantity;
	}


	@Override
	public String toString() {
		return "Product [MRP=" + MRP + ", ProductID=" + ProductID + ", ProductName=" + ProductName + ", Quantity="
				+ Quantity + "]";
	}


	
	
//	product(){
//		System.out.println(" Product Information");
//	}
	
//	
//	Product(int MRP, int ProductID,  String ProductName){
//		
//		this.MRP = MRP;
//		this.ProductID = ProductID;
//		this.ProductName = ProductName;
//		
//	}
//	
//	
//	Product(int MRP, int ProductID,  String ProductName,  double Quantity){
//	
//		this.MRP = MRP;
//		this.ProductID = ProductID;
//		this.ProductName = ProductName;
//		this.Quantity = Quantity;
//	}
//
//	@Override
//	public String toString() {
//		return "Product [MRP=" + MRP + ", ProductID=" + ProductID + ", ProductName=" + ProductName + ", Quantity="
//				+ Quantity + "]";
//	}
//	
//	
}
