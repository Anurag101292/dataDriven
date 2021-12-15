package com.CN.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Iterator;
import java.util.Set;

public class WindowHandle {
   public static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        //handling SSL Handshake
        ChromeOptions cop = new ChromeOptions();
        cop.setAcceptInsecureCerts(true);
        driver = new ChromeDriver(cop);
        driver.get("https://demoqa.com/browser-windows");
        //open a new Window
        driver.findElement(By.xpath("//button[@id='windowButton']")).click();
        String mainwindow=driver.getWindowHandle();
        Set<String> windows=driver.getWindowHandles();
        switchToNewWindow(2);
        Iterator<String> iterator = windows.iterator();
        while(iterator.hasNext()){
           String childwindow = iterator.next();
           if(!mainwindow.equalsIgnoreCase(childwindow)){
               driver.switchTo().window(childwindow);
               WebElement text = driver.findElement(By.id("sampleHeading"));
               System.out.println("Heading of child window is " + text.getText());

           }
        }

        WebElement text = driver.findElement(By.id("sampleHeading"));

        // Fetching the text using method and printing it
        System.out.println("Element found using text: " + text.getText());
       // driver.quit();
       JavascriptExecutor js = (JavascriptExecutor)driver;
       js.executeScript("return jQuery.active==0");

    }

    public static void switchToNewWindow(int windowNumber) {
        Set < String > s = driver.getWindowHandles();
        Iterator < String > ite = s.iterator();
        int i = 1;
        while (ite.hasNext() && i < 10) {
            String popupHandle = ite.next().toString();
            driver.switchTo().window(popupHandle);
            System.out.println("Window title is : "+driver.getTitle());
            if (i == windowNumber) break;
            i++;
        }

    }
}
