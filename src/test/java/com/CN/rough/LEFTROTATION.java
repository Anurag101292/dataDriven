package com.CN.rough;

public class LEFTROTATION {
	// JAVA implementation of left rotation 
	// of an array K number of times 
	

	 
		// Function to leftRotate array multiple 
		// times 
		static int[] leftRotate(int arr[], int n, 
										int k) 
		{ 
			
		
			// Prints the rotated array from 
			// start position 
			for(int i = 0; i < n; ++i) 
				
				
			System.out.print(arr[(i + k) % n] 
							+ " "); 
			
			
			System.out.println();
			return arr;
			
		} 
		
		// Driver program 
		public static void main (String[] args) 
		{ 
				int arr[] = { 1, 3, 5, 7, 9 }; 
				int n = arr.length; 

				int k = 2; 
				leftRotate(arr, n, k); 

				k = 3; 
				leftRotate(arr, n, k); 

				k = 4; 
				leftRotate(arr, n, k); 
		} 
	} 

	// This code is contributed by Sanjal 
