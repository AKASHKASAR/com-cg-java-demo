package com.cg.demo.reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
	
	public static void main(String[] args) {
		
		String str = "9595622764";
		
		System.out.println("*****" + str.substring(6));
		
		System.out.println(str.substring(0,2) + "**" + str.substring(4,6));
		
		String str1 = "BCD";
		String str2 = "ABCDE";
		
		Pattern pattern = Pattern.compile(str1);
		Matcher matcher = pattern.matcher(str2);
		
		System.out.println(matcher.matches());
		System.out.println(matcher.lookingAt());
		System.out.println(matcher.find());
		
		
	}

}
