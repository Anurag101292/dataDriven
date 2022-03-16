package com.CN.rough;
import java.util.Scanner;

public class Palindrome {

	public static boolean ispalindrome(String str)

	{
		char[] ch = str.toCharArray();
		int i = 0; int j=ch.length-1;
		while(i<j)
             
             if(ch[i]==ch[j]) 
             {
            	 return true;
             }
             i++;
             j--;
		return false;
	}

	public static void isPalindromeInt(int a){
	    int temp;
	    int reminder;
	    int sum=0;
	    temp=a;
	    while(a>0){
	        reminder=a%10;
	        sum=(sum*10)+reminder;
	        a=a/10;
        }
	    if (temp==sum){
	        System.out.print("is palindrome");
        }else
            {System.out.print("is not palindrome");
            }
    }
	public static void main(String[] args) {
		String str = "abba";
		isPalindromeInt(4554);

		if (ispalindrome(str))
			System.out.print("Yes");
		else
			System.out.print("No");


		Boolean b =   createString();
		System.out.println(b);
	}


		public static boolean createString(){

			Scanner sc = new Scanner(System.in);
			int w=sc.nextInt();

			int x=sc.nextInt();
			int y=sc.nextInt();
			int z=sc.nextInt();
			System.out.println("length"+w+"string"+x+"no.of digit"+y+"special character"+z);

			if((w>0)&&(w<20)){
				if(w==x+y+z){
					if (x % 2 == 0 && y % 2 == 0 && z % 2 == 0) {
						String s= create(x,y,z);
						System.out.println(s);
						Boolean b =  isPalindrome(s);
						return b;
					} else if (x % 2 == 0 && y % 2 == 0 && z % 2 == 1 || x % 2 == 1 && y % 2 == 0 && z % 2 == 0 || x % 2 == 0 && y % 2 == 1 && z % 2 == 0) {
						return false;
					}
				}return false ;
			}


			return false;
		}
		public static String create(int x, int y , int z){
			String alphabetSet = "abcdefghijklmnopqrstuvwxyz";
			String numberSet = "1234567890";
			String specialSet = "~!@#$%^&*()";
			//Input- W-10, X-6, Y-2, Z-2
			//Output- abc12~~21cba
			String s = "";

			for(int i =0 ; i<x/2; i++){
				s=s+alphabetSet.charAt(i);
			}

			for(int j=0; j<y/2;j++) {
				s = s + numberSet.charAt(j);
			}

			for(int k =0;k<z/2;k++){
				s=s+specialSet.charAt(k);
			}
			StringBuilder sb = new StringBuilder(s);
			String  revString=   sb.reverse().toString();
			s=s+revString;
			return s;

		}


		public static boolean isPalindrome(String str){

			char[] ch =str.toCharArray();
			int i =0;int j =ch.length-1;
			while(i<j)
				if(ch[i]==ch[j]){
					return true;
				}
			i++;
			j--;
			return false;
		}



       /* w in the range 0 < w <= 20
        x in the range 0 < x <= w
        y in the range 0 < y <= w
        z in the range 0 < z <= w*/
	}

