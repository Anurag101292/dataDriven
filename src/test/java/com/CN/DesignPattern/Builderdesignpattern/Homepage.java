package com.CN.DesignPattern.Builderdesignpattern;

public class Homepage {
   public Homepage checktitle(){
       System.out.print("checktitle");
       return this;

   }
   public Loginpage logout(){
       System.out.print("Logout button");
       return new Loginpage();
   }
}
