package com.CN.Multithreading;

public class ThreadDemo1 {
    public static void main(String[] args) {
        MyThread1 mt1 = new MyThread1();
        mt1.start();
        System.out.println("main method");
    }
}
