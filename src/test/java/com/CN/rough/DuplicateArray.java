package com.CN.rough;

import java.util.HashSet;

public class DuplicateArray {

	    public static void main(String[] args) 
	    {
	        String[] strArray = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC"};
	  
	        HashSet<String> set = new HashSet<String>();
	  
	        for (String arrayElement : strArray)
	        {
	            if(!set.add(arrayElement))
	            {
	                System.out.println("Duplicate Element is : "+arrayElement);
	            }
	        }
	    }    
	}

