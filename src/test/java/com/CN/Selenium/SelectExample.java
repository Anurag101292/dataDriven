package com.CN.Selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectExample {
    @Test
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Path_of_Chrome_Driver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.browserstack.com/");
        driver.manage().window().maximize();
        WebElement developers_dropdown = driver.findElement(By.id("developers-menu-toggle"));
        Select objSelect = new Select(developers_dropdown);
        objSelect.selectByIndex(2);
        Thread.sleep(3000);
        driver.navigate().to("https://www.browserstack.com/");
        WebElement solutions_dropdown = driver.findElement(By.id("solutions-menu-dropdown"));
        Select solutions = new Select(solutions_dropdown);
        solutions.selectByValue("4000");
        Thread.sleep(3000);
        WebElement solutions_d = driver.findElement(By.id("solutions-menu-dropdown"));
        Select s1 = new Select(solutions_d);
        s1.selectByVisibleText("Geolocation Testing");
    }
}