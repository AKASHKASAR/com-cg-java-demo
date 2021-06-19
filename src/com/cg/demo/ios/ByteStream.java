package com.cg.demo.ios;

import java.io.*;

public class ByteStream {

	
	public static void main(String[] args) throws IOException {
		System.out.println("Start");
		
		
		FileInputStream fis = new FileInputStream("D:\\CapgeMini\\JEE\\Programs\\sample.txt");
		
		while(fis.available()>0) {
			System.out.println((char) fis.read());
		}
		System.out.println("\nEnd");
		try {
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
