package com.CN.rough;

public class Test1 {

	public static void main(String[] args) {
	    String s="Anurag";
	    System.out.println(s.hashCode());
	  s=  s.concat("Akhil");
	  System.out.println(s.hashCode());
	  
	  StringBuffer sb= new StringBuffer("Anurag");
	  System.out.println(sb.hashCode());
	  sb=sb.append("Akhil");
	  System.out.println(sb.hashCode());
	  
	  StringBuilder sb1= new StringBuilder("Anurag");
	  System.out.println(sb1.hashCode());
	  sb1=sb1.append("Akhil");
	  System.out.println(sb1.hashCode());
	   
	}

}
