package com.cg.demo.oop;

public class BlockDemo {

	static int num = 10;
	
	
	
public static void main(String[] args) {
	
	BlockDemo obj = new BlockDemo();
	BlockDemo obj2 = new BlockDemo();
	BlockDemo obj3= new BlockDemo();
	
	System.out.println("main");
	m1();
	System.out.println(num);
	
}
static void m1() {
	System.out.println("m1");
}
static {		
	System.out.println("aaa");
}
{
	
	System.out.println("bbb");
}
static {		
	System.out.println("aaa");
}
{
	
	System.out.println("bbb");
}

}
