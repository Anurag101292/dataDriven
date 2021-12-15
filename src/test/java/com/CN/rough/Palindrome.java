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

	public static void isPalindromeInt(int a){
	    int temp;
	    int reminder;
	    int sum=0;
	    temp=a;
	    while(a>0){
	        reminder=a%10;
	        sum=(sum*10)+reminder;
	        a=a/10;
        }
	    if (temp==sum){
	        System.out.print("is palindrome");
        }else
            {System.out.print("is not palindrome");
            }
    }
	public static void main(String[] args) 
    { 
        String str = "abba";
        isPalindromeInt(4554);
  
        if (ispalindrome(str)) 
            System.out.print("Yes"); 
        else
            System.out.print("No"); 
    } 
}
