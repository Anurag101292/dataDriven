package com.CN.Multithreading;

public class MyThread1 extends Thread{

    public void run(){
        System.out.println("child class");
    }
    public void start(){
        super.start();
        System.out.println("override start");
    }
}
