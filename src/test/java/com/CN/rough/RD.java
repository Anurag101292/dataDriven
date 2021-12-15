package com.CN.rough;

import java.util.*;
import java.util.stream.Collectors;

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

	public static void removeduplicates(int[] arr){
		LinkedHashSet<Integer> ar = new LinkedHashSet<Integer>();
		for(int a:arr){
			ar.add(a);
		}
		Iterator<Integer> i =ar.iterator();
		while(i.hasNext()){

			System.out.print(i.next()+ " ");
		}
	}
	public static void rDupli(int[] arr){
		Arrays.stream(arr).boxed().collect(Collectors.toSet()).forEach(s -> System.out.print(s+" "));
	}
	public static void main(String[] args) {
		int[] arr= {1,1,2,3,3,4,5};
		removeduplicates(arr);
		rDupli(arr);
		removedupli(arr);
	}
}
