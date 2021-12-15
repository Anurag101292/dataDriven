package com.CN.Search;

public class BinarySearch {

	int binarySearch(int arr[], int l, int r, int x) {

		if (r >= l) {
			int mid = l + (r - l) / 2;
			if (arr[mid] == x)
				return mid;
			if (arr[mid] > x)
				return binarySearch(arr, l, mid - 1, x);

			return binarySearch(arr, mid + 1, r, x);
		}
		return -1;
	}

	public static int binarySerch(int[] array, int low ,int high,  int key ){

		int mid = (low+high)/2;
		while(low<high){
			if (array[mid]==key){
				return mid;
			}
			if(array[mid]<key){

			return	binarySerch(array,mid+1,high,key);
			}else{

			return	binarySerch(array,low,mid-1,key);

			}
		}
		return -1;
	}

	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();

		int arr[] = { 2, 4, 6, 8, 10 };
		int l = 0;
		int n = arr.length;
		int x = 8;
		//int result = bs.binarySearch(arr, l, n, x);
		int result = binarySerch(arr,l,n,x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
	}
}
