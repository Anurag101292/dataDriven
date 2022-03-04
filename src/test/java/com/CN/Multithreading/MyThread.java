package com.CN.Multithreading;

public class MyThread extends Thread {

        public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Child thread");
        }
    }
        public void run(int i){
        System.out.println("int arg");
    }

}
