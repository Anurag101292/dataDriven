package com.CN.rough;

public class Removewhitespace {

	
	public static void remove(String Str) 
	{
	      String stringWithoutSpaces = Str.replaceAll("\\s+", "");
		System.out.println(stringWithoutSpaces);
	}
	public static void main(String[] args) {
		Removewhitespace.remove("Anurag upadhyay");
		
		
	}
}
