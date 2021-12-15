package com.CN.DesignPattern.FactoryDesignPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromeclass implements FactoryClass{
WebDriver driver;
    @Override
    public void initDriver() {
        driver = new ChromeDriver();
        driver.get("https://google.co.in");
    }
}
