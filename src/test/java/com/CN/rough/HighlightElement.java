package com.CN.rough;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HighlightElement {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.devlabsalliance.com");
	WebElement ele =driver.findElement(By.xpath("//*[@id=’devLabs’]"));

	

	

	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].setAttribute('style','background: yellow;border: 3px solid red;');", ele);
	

	//Passing values based on css style. Yellow background color with solid red color border.
	


	}
}
