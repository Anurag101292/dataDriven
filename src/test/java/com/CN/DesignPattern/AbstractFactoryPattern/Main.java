package com.CN.DesignPattern.AbstractFactoryPattern;

public class Main {
    public static void main(String[] args) {
        getCountry("Indonesia");
    }


    public static void getCountry(String country){
        if(country.equalsIgnoreCase("India")){

            GetCarInIndia ginc = new GetCarInIndia();
            ginc.hitCarButton();
        }
        else if(country.equalsIgnoreCase("Indonesia")){
            GetCarinINdonesia gon = new GetCarinINdonesia();
            gon.hitCarButton();
        }

    }
}
