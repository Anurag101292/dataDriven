package com.CN.DesignPattern;

import org.openqa.selenium.WebDriver;

public class LoadURL {

    public static void main(String[] args) {

        SingletonDesignPattern sbc1= SingletonDesignPattern.getInstanceofSingletonclass();
        WebDriver driver1 = sbc1.getDriver();


        SingletonDesignPattern sbc2= SingletonDesignPattern.getInstanceofSingletonclass();
        WebDriver driver2 = sbc2.getDriver();
        driver2.get("https://www.google.com");
    }
}
