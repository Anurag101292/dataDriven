package com.CN.rough;

import java.util.Arrays;

public class Anagram {

	public static void checkAnagram(String s1,String s2) {
		
		boolean status=true;
	s1=	s1.replaceAll("\\s+", "");
	s2= s2.replaceAll("\\s+", "");
		if(s1.length()!=s2.length())
			{status=false;}
		else {
		char[] A1=s1.toLowerCase().toCharArray();
		char[] A2=s2.toLowerCase().toCharArray();
		
		Arrays.sort(A1);
		Arrays.sort(A2);
		status=Arrays.equals(A1, A2);
		
		}
		if(status=true) 
		{
			System.out.println(s1+ " and "+s2+ " are Anagram");
		}else
		{
			System.out.println(s1+" and "+s2+ " are not Anagram");
		}
	}
	public static void main(String[] args) {
		Anagram.checkAnagram("Anurag", "Gar  una");
	}
}





