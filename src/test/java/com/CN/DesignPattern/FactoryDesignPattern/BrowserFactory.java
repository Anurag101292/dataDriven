package com.CN.DesignPattern.FactoryDesignPattern;

import org.openqa.selenium.WebDriver;

public class BrowserFactory {
    public static WebDriver getBrowserInstance(String str){
    WebDriver driver =null;
    if(str.equalsIgnoreCase("chrome")){
        new Chromeclass();
    }
        if(str.equalsIgnoreCase("firefox")){
            new Firefoxclass();
        }
    return driver;}
}
