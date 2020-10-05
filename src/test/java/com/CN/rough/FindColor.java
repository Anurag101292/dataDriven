package com.CN.rough;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindColor {
int count;
	public static void main(String[] args) throws AWTException {
		
	
//	System.setProperty("webdriver.chrome.driver",
//			System.getProperty("user.dir") + "/src/test/resources/executables/chromedriver");
		WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.healthkart.com/");
	driver.manage().window().maximize();
/**	String color = driver.findElement(By.xpath("//span[@class='icn icn-search']")).getCssValue("color");
	System.out.println(color);
	String hex = Color.fromString(color).asHex();
	System.out.println(hex);
	List<WebElement> links = driver.findElements(By.tagName("a"));
	int count=links.size();
	System.out.println(count);
	for(WebElement link:links) {
		count++;
		
	}
	System.out.println(count);
	//Actions//
WebElement ele=	driver.findElement(By.xpath("//span[contains(text(),'Consult')]"));
	Actions action = new Actions(driver);
	action.moveToElement(ele).perform();**/
	driver.findElement(By.id("searchInput")).click();;
	Robot robot = new Robot();
	java.awt.Color color=robot.getPixelColor(200, 300);
	robot.keyPress(KeyEvent.VK_0);
	robot.keyRelease(KeyEvent.VK_0);


	
}
}