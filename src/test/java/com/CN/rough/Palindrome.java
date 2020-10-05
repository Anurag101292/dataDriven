package com.CN.rough;

public class Palindrome {

	public static boolean ispalindrome(String str)

	{
		char[] ch = str.toCharArray();

		int i = 0; int j=ch.length-1;
		while(i<j)
             
             if(ch[i]==ch[j]) 
             {
            	 return true;
             }
             i++;
             j--;
		
		
		return false;
		
	}
	public static void main(String[] args) 
    { 
        String str = "abba"; 
  
        if (ispalindrome(str)) 
            System.out.print("Yes"); 
        else
            System.out.print("No"); 
    } 
}
