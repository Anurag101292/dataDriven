package com.CN.rough;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class SubarraySum
{
  public static void printAllSubarrays(int [] arr , int sum){
      HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
      int current_sum=0;
      int start =0;
      int end=-1;
      for (int i=0;i<arr.length;i++) {
          current_sum = current_sum + arr[i];
         if((current_sum-sum)==0){
             start=0;
             end=i;
             break;
         }

          if (hm.containsKey(current_sum - sum)) {
              start = hm.get(current_sum - sum) + 1;
              end = i;
              break;
          }
          hm.put(current_sum, i);
      }
      if(end==-1){System.out.println("not found "); }
      else{System.out.print("data found "+start+" "+end);}
  }
    public static void main (String[] args)
    {
        int[] nums = { 3, 4, -7, 1, 3, 3, 1, -4 };
        int target = 7;

        printAllSubarrays(nums, target);
    }
}