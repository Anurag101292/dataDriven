package com.CN.rough;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Countcharacter {
	
	public static void countCharacter(String s1){

		char[] c1= s1.toCharArray();
		HashMap<Character,Integer> hm = new HashMap<Character, Integer>();
		for(int i =0 ;i< c1.length;i++){
			if(!hm.containsKey(c1[i])){
				hm.put(c1[i],1);
			}else{
				hm.put(c1[i],hm.get(c1[i])+1);
			}
		}
		Set<Character> keydata=hm.keySet();
		for(Character a:keydata){
			System.out.println(a +" Comes "+ hm.get(a)+" times ");
		}
	}



	public static void main(String[] args) {
		
		countCharacter("anurag");
	}
}
