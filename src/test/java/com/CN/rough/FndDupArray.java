package com.CN.rough;

import org.checkerframework.checker.units.qual.K;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FndDupArray extends EqualTo {

    public static void dupliArray(int[] arr){
        HashSet<Integer> h = new HashSet<>();

        for(int i =0 ; i<arr.length;i++){
            if(!h.add(arr[i])){
                System.out.println(arr[i]);
            }
        }
    }

    public static void countCharacter(String s){
        char[] ch = s.toCharArray();
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i =0;i<ch.length;i++){
            if(!hm.containsKey(ch[i])){
                hm.put(ch[i],1);
            }else{
                hm.put(ch[i],hm.get(ch[i])+1);
            }
        }
        Set<Character> set=hm.keySet();
        for(Character ch1:set){
            if(hm.get(ch1)>1){
                System.out.println(ch1+" have "+hm.get(ch1)+ " count.");
            }
        }
    }

    public static void main(String[] args) {
        int [] i ={1,2,3,4,2,3};
        dupliArray(i);
        countCharacter("anurag");
        EqualTo t = new EqualTo();
        EqualTo tl = new FndDupArray();
        t.run();
        tl.run();
    }

    @Override
    public void run() {
        System.out.println("Akhil run");
    }
}
