package com.CN.Selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryTest {

        static WebDriver driver;

        public static void main(String[] args) {

            driver = new ChromeDriver();

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://demoqa.com/login");

            //Instantiating Login & Profile page using initElements()
            PageFactory profilePg = PageFactory.initElements(driver, PageFactory.class);

            //Using the methods created in pages class to perform actions
            driver.quit();
        }

    }

