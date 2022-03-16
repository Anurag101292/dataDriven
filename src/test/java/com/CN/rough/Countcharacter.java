package com.CN.rough;

import java.util.HashMap;
import java.util.Iterator;
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

		Set<Map.Entry<Character,Integer>> s= hm.entrySet();
		Iterator<Map.Entry<Character, Integer>> il =s.iterator();

		Set<Character> keydata=hm.keySet();

	Map.Entry<Character,Integer> ci = (Map.Entry<Character, Integer>) hm.entrySet();



		Iterator<Character> i=keydata.iterator();
		while(i.hasNext()){
			Character l = (Character)i.next();

		}
	     hm.keySet().forEach(a->System.out.println(a));

		for(Character a:keydata){

			System.out.println(a +" Comes "+ hm.get(a)+" times ");
		}
	}



	public static void main(String[] args) {
		
		countCharacter("anurag");
	}
}
