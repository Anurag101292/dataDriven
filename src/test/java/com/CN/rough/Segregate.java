package com.CN.rough;

public class Segregate {

	
	public static void main(String[] args) {
		int arr[] = new int[]{ 0, 1, 0, 1, 1, 1 }; 
		int count=0;
		
		int n = arr.length;
		for (int i=0;i<n;i++) {
			if(arr[i]==0) {
				count++;
			}
		}
		for (int i=0;i<=count;i++) {
			
			arr[i] = 0;
		}
		for (int i = count; i < n; i++) {
            arr[i] = 1;
		}
		        System.out.print("Array after segregation is "); 
		        for (int i = 0; i < n; i++) 
		            System.out.print(arr[i] + " ");     
		    
	}
}
