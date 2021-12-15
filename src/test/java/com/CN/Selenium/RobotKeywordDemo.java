package com.CN.Selenium;

//    Launch the web browser and launch our practice page https://demoqa.com/keyboard-events/
//    Click on ‘Click here to browse’ button
//    Press Shift Key
//    Enter d to type it as D as the modifier Shift key press
//    Release Shift Key
//    Enter remaining part of the file name, i.e., 1.txt to display it as D1.txt
//    Press Enter key
//    Click on the Upload button and close the alert
//    Close the browser to end the program
//    Prerequisite: Create a file C:\demo\D1.txt
//
//    Following is the sample code:

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

    public class RobotKeywordDemo {

        public static void main(String[] args) throws InterruptedException, AWTException, IOException {

            WebDriverManager.chromedriver().setup();

            // Create a new instance of the chrome driver
            WebDriver driver = new ChromeDriver();
            String URL = "https://demoqa.com/keyboard-events/";

            //Start Browser
            driver.get(URL);

            //maximize browser
            driver.manage().window().maximize();
            Thread.sleep(2000);

            // This will click on Browse button
            WebElement webElement = driver.findElement(By.id("browseFile"));
            //click  Browse button
            webElement.sendKeys(Keys.ENTER);

            //Create object of Robot class
            Robot robot = new Robot();
            //Code to Enter D1.txt
            //Press Shift key
            robot.keyPress(KeyEvent.VK_SHIFT);
            //Press d , it gets typed as upper case D as Shift key is pressed
            robot.keyPress(KeyEvent.VK_D);
            //Release SHIFT key to release upper case effect
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_1);
            robot.keyPress(KeyEvent.VK_PERIOD);
            robot.keyPress(KeyEvent.VK_T);
            robot.keyPress(KeyEvent.VK_X);
            robot.keyPress(KeyEvent.VK_T);

            //Press ENTER to close the popup
            robot.keyPress(KeyEvent.VK_ENTER);

            //Wait for 1 sec
            Thread.sleep(1000);

            //This is just a verification part, accept alert
            webElement = driver.findElement(By.id("uploadButton"));

            webElement.click();
            WebDriverWait wait = new WebDriverWait(driver, 10);
            Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
            //Accept the Alert
            myAlert.accept();

            //Close the main window
            driver.close();
        }

    }

