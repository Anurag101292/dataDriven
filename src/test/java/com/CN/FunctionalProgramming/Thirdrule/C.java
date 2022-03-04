package com.CN.FunctionalProgramming.Thirdrule;

public class C  implements A,B {
//Here I need to increase the access modifiew from default to public
    @Override
    public void show() {
        System.out.println("Print C");
    }
}
