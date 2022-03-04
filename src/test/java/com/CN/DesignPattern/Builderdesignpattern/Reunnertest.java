package com.CN.DesignPattern.Builderdesignpattern;

public class Reunnertest {

    public static void main(String[] args) {
       Loginpage lp =new Loginpage();
       lp.setusername().setpassword().clickLoginbutton().checktitle().logout();
    }
}
