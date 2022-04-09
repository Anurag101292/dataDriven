package com.CN.rough;

public class EqualTo{
	
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

//	The main difference between the .equals() method and == operator is that one is a method,
//	and the other is the operator.
//	We can use == operators for reference comparison (address comparison) and .equals() method for
//	content comparison. In simple words, == checks if both objects point to the same memory
//	location whereas .equals() evaluates to the comparison of values in the objects.
//	If a class does not override the equals method, then by default, it uses the equals(Object o)
//	method of the closest parent class that has overridden this method.

	public void run(){
		System.out.println("Anurag");
	}

}
