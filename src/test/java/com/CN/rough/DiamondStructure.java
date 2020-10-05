package com.CN.rough;

public class DiamondStructure {

	
	 
	    public static void pyramidPattern(int n) 
	    {  
	        for (int i=0; i<n; i++)//outer loop for number of rows(n)
	       
	        { 
	        	for (int j=n-i; j>0; j--) //inner loop for spaces
	            { 
	                System.out.print(" "); //print space
	            }  
	            for (int j=0; j<=i; j++ ) //inner loop for number of columns
	            { 
	                System.out.print("* "); //print star
	            } 
	  
	            System.out.println(); //ending line after each row
	        } 
	    } 
	    
	    public static void rightTriangle(int n) 
	    { 
	        int i, j;  
	        for(i=0; i<n; i++) //outer loop for number of rows(n) 
	        	{ for(j=2*(n-i); j>=0; j--) // inner loop for spaces 
	            {           
	                System.out.print(" "); // printing space
	            } 
	            for(j=0; j<=i; j++) //  inner loop for columns
	            {       
	                System.out.print("* "); // print star
	            }           
	            System.out.println();} // ending line after each row
	        } 
	    
	    public static void printStars(int n) 
	    { 
	        int i, j;  
	        for(i=0; i<n; i++) //outer loop for number of rows(n)
	        	{ for(j=2*(n-i); j>=0; j--) // inner loop for spaces 
	            {           
	                System.out.print(" "); // printing space
	            } 
	            for(j=0; j<=i; j++) //  inner loop for columns
	            {       
	                System.out.print("* "); // print star
	            }           
	            System.out.println(); // ending line after each row
	        } 
	    } 
	   
	    public static void diamond(int n)
	    {
	    int  i, j, space = 1;
	   
	   
	    space = n - 1;
	    for (j = 1; j<= n; j++)
	    {
	    for (i = 1; i<= space; i++)
	    {
	    System.out.print(" ");
	    }
	    space--;
	    for (i = 1; i <= 2 * j - 1; i++)
	    {
	    System.out.print("*");
	    }
	    System.out.println("");
	    }
	    space = 1;
	    for (j = 1; j<= n - 1; j++)
	    {
	    for (i = 1; i<= space; i++)
	    {
	    System.out.print(" ");
	    }
	    space++;
	    for (i = 1; i<= 2 * (n - j) - 1; i++)
	    {
	    System.out.print("*");
	    }
	    System.out.println("");
	    }
	    }
	    
	  
	   public static void main(String[] args) 
	    { 
	        int n = 5; 
	        pyramidPattern(n); 
	        rightTriangle(n);
	        printStars(n);
	        diamond(n);
	    } 
	}
