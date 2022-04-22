package com.CN.rough;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Countcharacter {

    public static void countCharacter(String s1) {

        char[] c1 = s1.toCharArray();
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        for (int i = 0; i < c1.length; i++) {
            if (!hm.containsKey(c1[i])) {
                hm.put(c1[i], 1);
            } else {
                hm.put(c1[i], hm.get(c1[i]) + 1);
            }
        }

       Set<Character> s = hm.keySet();
        for(Character c :s){
            if(hm.get(c)==2){
                System.out.println(c);

            }
        }
    }


    public static void main(String[] args) {

        countCharacter("anurag");
    }
}
