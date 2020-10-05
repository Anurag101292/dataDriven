package com.CN.rough;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

import org.apache.commons.lang3.ArrayUtils;

public class Arraysearch {

	
	public static void main(String[] args) {
		int[] arr = {2,3,4,5,5,6,4};
	Integer[]	ntarr= new Integer[arr.length];
	
	ArrayUtils.reverse(arr);
//	System.out.println("reversed int array : " + Arrays.toString(arr));
		
		for(int  I:arr)
			
		{
			int A=I*2;
			ntarr[A]=Integer.valueOf(A);
		
		}
		System.out.println("New DATA "+Arrays.toString(ntarr));
		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>(Arrays.asList(ntarr));
		
		Iterator i=hs.iterator();
		while(i.hasNext()) 
		{
		
			i.next();
		}
		System.out.println(Arrays.asList(ntarr));
		
	if(Arrays.asList(ntarr).contains(3))
		{System.out.println("ElementPresent");}
		else
		{System.out.println("Element not present");}
	}
}
