package com.CN.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebAlert {
    public static void main(String[] args) {
         WebDriver driver = new ChromeDriver();
         Alert al = driver.switchTo().alert();
         al.accept();
         al.dismiss();
         al.getText();
         al.sendKeys("Anurag");
    }
}
