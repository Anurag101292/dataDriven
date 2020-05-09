package com.CN.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.CN.utilities.ExcelReader;

import org.apache.log4j.Logger;

public class TestBase {

	public static WebDriver driver;
	public static Properties config = new Properties();
	public static Properties OR = new Properties();
	public static FileInputStream fis;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static ExcelReader excelreader = new ExcelReader(
			System.getProperty("user.dir") + "/src/test/resources/excel/TestData.xlsx");

	@BeforeSuite
	public void setup() {

		if (driver == null) {

			try {

				fis = new FileInputStream(
						System.getProperty("user.dir") + "/src/test/resources/properties/config.properties");

			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				config.load(fis);
				log.debug("Config file loaded !!!");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {

				fis = new FileInputStream(
						System.getProperty("user.dir") + "/src/test/resources/properties/OR.properties");

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				OR.load(fis);
				log.debug("OR file loaded !!!");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (config.getProperty("browser").equalsIgnoreCase("chrome")) {
				ChromeOptions ops = new ChromeOptions();

				ops.addArguments("--disable-notifications");
				ops.addArguments("disable-infobars");
				ops.addArguments("start-maximized");
				ops.addArguments("--disable-geolocation");
				ops.addArguments("--enable-strict-powerful-feature-restrictions");
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "/src/test/resources/executables/chromedriver");
				driver = new ChromeDriver(ops);
				log.debug("Chrome Launched !!!");

			} else if (config.getProperty("browser").equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "/src/test/resources/executables/firefoxdriver");
				driver = new FirefoxDriver();
				log.debug("Firefox Launched !!!");

			}
			driver.get(config.getProperty("URL"));
			log.debug("Navigated to ==>" + config.getProperty("URL"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		}

	}

	public boolean isElementPresent(By by) {

		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException t) {
			return false;
		}

	}

	@AfterSuite
	public void tearup() {
		if (driver != null) {
			driver.quit();
			log.debug("Test Execution completed  !!!");
		}
	}
}
