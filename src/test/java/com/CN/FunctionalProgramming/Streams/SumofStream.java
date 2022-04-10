package com.CN.FunctionalProgramming.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class SumofStream {

    public static void main(String[] args) {
        int arr[]={1,2,4,5,6,6,6,6,6,6,6};
        OptionalInt op =Arrays.stream(arr).reduce((a, b)->a+b);
        System.out.println(op.getAsInt());
    }
}
