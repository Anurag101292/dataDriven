package com.CN.rough;

public class Reverse {

	public static StringBuilder isReverse(String str)
	{
		StringBuilder sb = new StringBuilder(str);
		
		
		return sb.reverse();
	}
	
	public static void main(String[] args) {
		isReverse("Anurag");
		System.out.println(isReverse("Anurag"));
		
	}
}
