package com.CN.rough;



public class thirdLartgestno {

	public static void main(String[] args)
	{
		
	
	int[] arr = {2,4,3,44,5,6,7};
	
//	Arrays.sort(arr);
//	System.out.println(arr[arr.length-3]);
	int max=arr[0];
	int smallest=Integer.MAX_VALUE;
	for(int i=0;i<arr.length;i++) 
	{
		if(arr[i]>max) 
		{
			max=arr[i];	
		}	
		
		if(arr[i]<smallest)
		{
			smallest=arr[i];
		}
		
	}System.out.println("min value "+smallest);
	System.out.println("max value "+max);
	int secondvalue=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++)
	if(arr[i]>secondvalue && arr[i]<max) {
		secondvalue=arr[i];
	}
	int third= Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>third && arr[i]<secondvalue) 
		{
			third=arr[i];
		}
		
		
		
		
	}
	
	System.out.println(third);
	}
	
	}
	
