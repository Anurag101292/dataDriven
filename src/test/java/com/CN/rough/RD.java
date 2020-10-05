package com.CN.rough;

public class RD {

	public static void removedupli(int arr[]) {
		
		int n =arr.length;
		for (int i=0;i<arr.length;i++) {
			
			int flag=0;
			for (int j=0;j<i;j++)
			{
				
				if(arr[i]==arr[j]) 
				{
					flag=1;
					break;
				}else{continue;}
				
				
			}if(flag==0) 
			{System.out.print(arr[i]);}
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr= {1,1,2,3,3,4,5};
		
		removedupli(arr);
	}
}
