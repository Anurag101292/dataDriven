package com.CN.rough;

public class Missingno {
public static void ismissing(int n,int[] arr) 
{

	int value;
	
	
	int Sum=(n*(n+1))/2;
	int Sum1=0;
	
	for(int i=0;i<n-1;i++)
	{
		
		Sum1=Sum1+arr[i];
	}
	
	
	value=Sum-Sum1;
	System.out.println(value);
	
	
	
	
}
	
	public static void main(String[] args) {
		
		int[] arr1= {1,2,4,5,6};
		Missingno.ismissing(6,arr1);
		
	}
}
