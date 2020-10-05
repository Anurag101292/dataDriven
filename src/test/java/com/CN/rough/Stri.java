package com.CN.rough;

public class Stri {
	
	public static void main(String[] args) {
		String a ="Anurag";
		String a1=new String("Anurag");
		String a2="Anurag";
		String a3=new String("Anurag");
		
		System.out.println(a==a1);
		System.out.println(a==a2);
		System.out.println(a1==a3);
		System.out.println(a.equals(a1));
		System.out.println(a.equals(a2));
		System.out.println(a1.equals(a3));
	}

}
