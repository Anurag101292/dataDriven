package com.CN.Multithreading;


public class Mainrunnable {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread t = new Thread(mr);
        t.start();
        t.getId();
        t.getName();
        t.getPriority();
        t.isAlive();
        t.isDaemon();
        
        for(int i =0 ; i<5;i++){
            System.out.println(String.valueOf(i));
        }
    }
}
