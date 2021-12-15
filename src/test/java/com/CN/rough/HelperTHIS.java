package com.CN.rough;

import org.apache.poi.util.SystemOutLogger;

public class HelperTHIS {
    int rollno;
    String name,course;
    float fee;
    HelperTHIS(int rollno,String name,String course){
        //usage of this is to distinguish instant variable and local
        this.rollno=rollno;
        this.name=name;
        this.course=course;
    }
    HelperTHIS(int rollno,String name,String course,float fee){
        //firstly we have to do constructur chaing before any other verb otherwise it will give compiletime error
        this(rollno,name,course);
        this.fee=fee;
    }
    void display(){
        System.out.println("rollno "+rollno+" name "+name+" course "+course+" fee "+fee);
    }

    public static void main(String[] args) {
        HelperTHIS ht = new HelperTHIS(10,"Anurag","Science",50f);
        ht.display();

    }

}
