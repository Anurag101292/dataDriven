package com.CN.rough;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TESTNG {

	
	
	@Test(priority=1)
	public static void goCorona() throws AWTException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[contains(text(),'File Upload')]")).click();
		
		System.out.println("URL CLICK");
		driver.findElement(By.id("file-upload")).click();
		System.out.println("Button_click");
		Robot robo = new Robot();
		StringSelection sS= new StringSelection("/home/anurag/Desktop/anurag.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sS, null);
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_V);
		
		robo.keyPress(KeyEvent.VK_ENTER);
	}
	
	
}
