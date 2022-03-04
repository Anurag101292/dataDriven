package com.CN.Multithreading;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        //when we hit t.start
//        1. Register this thread with thread scheduler
//        2. Perform all other mandatory activities
//        3. Invoke run method
        t.start();                                               //starting using child thread
        for (int i = 0; i < 10; i++) {                           //worked with main class
            System.out.println("Run Thread");
        }
    }
}
