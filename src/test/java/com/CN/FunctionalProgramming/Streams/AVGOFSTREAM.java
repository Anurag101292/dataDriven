package com.CN.FunctionalProgramming.Streams;

import java.util.Arrays;

public class AVGOFSTREAM {
    public static void main(String[] args) {
        int arr[] ={8,7,6,3,8,7,6,3,6,3,8,6,8,7,3,6,9,8,3};
     double avg=   Arrays.stream(arr).average().getAsDouble();
        System.out.println(avg);
    }
}
