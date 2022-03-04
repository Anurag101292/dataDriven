package com.CN.DesignPattern.Builderdesignpattern;

public class Loginpage {
    public Loginpage setusername(){
        System.out.println("sendingtext");
        return this;
    }
    public Loginpage setpassword(){
        System.out.println("sendingpassword");
        return this;
    }
    public Homepage clickLoginbutton(){
        System.out.println("clickbutton");
        return new Homepage();

    }
}
