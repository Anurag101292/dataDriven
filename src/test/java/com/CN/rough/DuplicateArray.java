package com.CN.rough;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateArray {

	    public static void main(String[] args) 
	    {

	        String[] strArray = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC"};
			List<String> s = Arrays.asList(strArray);
			findDuplicate(strArray);
	        HashSet<String> set = new HashSet<String>();

	        Set<String> i=s.stream().filter(e-> !set.add(e)).collect(Collectors.toSet());
			System.out.println(i);
	  
//	        for (String arrayElement : strArray)
//	        {
//	            if(!set.add(arrayElement))
//	            {
//	                System.out.println("Duplicate Element is : "+arrayElement);
//	            }
//	        }
	    }

	    public static void findDuplicate(String[] str){
	    	List<String> s = Arrays.asList(str);
	    Set<String> setstr=	s.stream().filter(e-> Collections.frequency(s,e)>1).collect(Collectors.toSet());
			System.out.println(setstr);
		}
	}

