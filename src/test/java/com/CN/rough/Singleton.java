package com.CN.rough;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Singleton {

	
	public static void main(String[] args) {
	/**	SingleABC obj1 = SingleABC.getInstance();
		SingleABC obj2 =SingleABC.getInstance();
		
		
		String s= "Anurag";
		String s1="Anurag";
		String s2 = new String("Anurag");
		String s3= new String("Anurag");
		
		System.out.println(s==s1);
		System.out.println(s==s2);
		System.out.println(s2==s3);
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		System.out.println(s2.equals(s3));**/
		
		
		SingletonBrowserClass sbc = SingletonBrowserClass.getInstanceOfSingletonBrowserClass();
		sbc.getDriver();
		

		
	}
}
