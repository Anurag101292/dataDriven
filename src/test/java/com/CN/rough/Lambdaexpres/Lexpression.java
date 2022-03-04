package com.CN.rough.Lambdaexpres;

import java.util.Arrays;
import java.util.List;
interface A{
    public void show();
}
interface B{
    public void shows(String name);
}

public class Lexpression {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(4,5,6,9,7);
        A obj;
        B obj1;
//Firstway to use interface with annonymous inner class
        obj =new A() {
            @Override
            public void show() {
                System.out.println("Bdepapa");
            }
        };

        obj=()->System.out.println("Anurag");
        obj.show();
        obj1=(name)->System.out.println(name);
        obj1.shows("Abra ka dabra");

    }

}
