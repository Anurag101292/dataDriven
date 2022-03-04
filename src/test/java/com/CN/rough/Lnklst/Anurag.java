package com.CN.rough.Lnklst;

import java.util.HashMap;
import java.util.Map;

public class Anurag {
    public static void main(String[] args) {
        int arr[][]= {{1,2,3},{4,5},{5,6}};
       getArray(arr);


       String s ="My Name is Anurag";
       String[] a=s.split(" ");
       a[a.length-1].length();

    }
    public static int [] getArray(int arr[][]){

        Map<int[], Integer> hm = new HashMap<>();
        int a[]=new int[arr.length];
        for(int i =0;i< arr.length;i++){
            int sum=0;
            for(int j=0 ;j<a.length;j++){
                sum=sum+a[j];
                hm.put(arr[i],sum);
            }
        }
       int al[]= hm.entrySet().stream().max((E1,E2)->E1.getValue().compareTo(E2.getValue())).get().getKey();
        System.out.println(al);
        return al;

    }
}
