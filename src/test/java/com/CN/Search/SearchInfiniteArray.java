package com.CN.Search;

import java.util.HashSet;

public class SearchInfiniteArray {
    public static int searchInfinite(int arr[], int key) {
        int low=0;
        int high=1;
        while(arr[high]<key){
            low=high;
            high=2*high;
        }
        return binarySearch(arr,low,high,key);
    }

    public static int binarySearch(int arr[], int low, int high, int key) {
        int mid = (low + high) / 2;
        if (low <= high) {
            if (arr[mid] == key) {
                return mid;
            }
            if (key < arr[mid]) {
                return binarySearch(arr, low, mid - 1, key);
            } else {
                return binarySearch(arr, mid + 1, high, key);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,23,43,56,78,80,81,82,91,92,98,101,112};
        int key = 43;
        int index=searchInfinite(arr, key);
        if(index==-1){System.out.print("Element not  present");}
        else
            {System.out.print("Element present at index"+" "+index);}
    }
}
