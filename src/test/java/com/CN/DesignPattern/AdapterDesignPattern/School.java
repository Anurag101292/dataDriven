package com.CN.DesignPattern.AdapterDesignPattern;

public class School {

    public static void main(String[] args) {
        Pen p= new PenAdapter();
        Assignment a = new Assignment();
        a.setP(p);
        a.writeAssignment("I am bit tired to write an assignment");
    }
}
