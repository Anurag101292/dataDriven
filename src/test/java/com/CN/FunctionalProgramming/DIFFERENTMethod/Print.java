package com.CN.FunctionalProgramming.DIFFERENTMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Print {


    public static void main(String[] args) {
        List<Integer> values= Arrays.asList(1,2,3,4,5,6,7);
//        for(int i =0 ; i<values.size();i++){
//            System.out.println(values.get(i));
//        }
//        for(Integer i :values){
//            System.out.println(i);
//        }
//        Iterator<Integer> i = values.iterator();
//        while(i.hasNext()){
//            System.out.println(i.next());
//        }
//        Consumer<Integer> c = new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        };
        values.forEach(c-> System.out.println(c));
    }


}
