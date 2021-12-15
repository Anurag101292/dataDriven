package com.CN.DesignPattern.FactoryDesignPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxclass implements FactoryClass{
    WebDriver driver;
    @Override
    public void initDriver() {
        driver = new FirefoxDriver();
        driver.get("https://google.co.in");
    }
}
