package com.CN.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ParallelExecution {
    public WebDriver driver;
    @Test
    public void FirefoxTest() {
        //Initializing the firefox driver (Gecko)
        driver = new FirefoxDriver();
        driver.get("https://www.demoqa.com");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
        driver.quit();
    }

    @Test
    public void ChromeTest()
    {
        //Initialize the chrome driver
        driver = new ChromeDriver();
        driver.get("https://www.demoqa.com");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
        driver.quit();
    }
}
