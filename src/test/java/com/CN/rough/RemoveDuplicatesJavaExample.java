package com.CN.rough;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
			 
public class RemoveDuplicatesJavaExample 
		{   
		    static void removeDuplicates(int[] arrayWithDuplicates)
		    
		    
		    {Integer[] boxedArray =new Integer[arrayWithDuplicates.length];
		    
		    for(int i=0;i<arrayWithDuplicates.length;i++) 
		    {
		    	
		     boxedArray[i] = Integer.valueOf(arrayWithDuplicates[i]);
		    }
		    	
		    	ArrayList<Integer> lst = new ArrayList<Integer>(Arrays.asList(boxedArray));
		    	
		    	LinkedHashSet<Integer> baseset = new LinkedHashSet<Integer>(lst); 
		        
		         
		     
		         
		       for(Integer x:baseset) {
		    	   System.out.print(x+" ");
		       }
		         
		        System.out.println();
		         
		        System.out.println("==============================");
		    }
		     
		    public static void main(String[] args) 
		    {       
		        removeDuplicates(new int[] {4, 3, 2, 4, 9, 2});
		         
		        removeDuplicates(new int[] {1, 2, 1, 2, 1, 2});
		         
		        removeDuplicates(new int[] {15, 21, 11, 21, 51, 21, 11});
		         
		        removeDuplicates(new int[] {7, 3, 21, 7, 34, 18, 3, 21});
		    }   
		}
		

