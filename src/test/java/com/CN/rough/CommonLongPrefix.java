package com.CN.rough;

public class CommonLongPrefix {

	
	public static String isprefix(String[] str) 
	{
		String prefix  =str[0];
	
		
		for(int i=1;i<str.length;i++) 
		{
		prefix =iscompare(prefix,str[i]);
		}
		
	return prefix;
		
	}
	
	public static String iscompare(String str1,String str2) 
	{
		char[] ch1 =str1.toCharArray();
		char[] ch2 =str2.toCharArray();
		String prefi="";
		
		for(int i=0,j=0;i<=ch1.length-1 && j<=ch2.length-1;i++,j++) 
		{
			if(ch1[i]!=ch2[j]) 
			{break;}
			else {
				prefi=prefi+ch1[i];
			}
		}
		return prefi;
		
		
		
	}
	public static void main(String[] args) {
		String[] str = {"Anurag","Anuj","Anuradha","Anupama"};
	String ans=	isprefix(str);
	System.out.println(ans);
		
		
	}
}
