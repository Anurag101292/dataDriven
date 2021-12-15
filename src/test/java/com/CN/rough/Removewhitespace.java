package com.CN.rough;

public class Removewhitespace {

	
	public static void remove(String Str) 
	{
	      String stringWithoutSpaces = Str.replaceAll("\\s+", "");
		System.out.println(stringWithoutSpaces);
	}
	
	public static void stringReverse(String str) 
	{
		String[] arr = str.split("\\s");
		String rev= "";
		
		for(int i=arr.length-1;i>=0;i-- ) 
		{
			rev =rev+arr[i]+" ";
		}
		rev =rev.trim();
		
		
		
		System.out.println(rev);
		
		
	}
	public static void main(String[] args) {
		Removewhitespace.remove("Anurag upadhyay");
		Removewhitespace.stringReverse("Akhil is my love");
		
		
	}
}
