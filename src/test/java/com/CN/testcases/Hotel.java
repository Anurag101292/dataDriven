package com.CN.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.CN.Base.TestBase;

public class Hotel extends TestBase {

	@Test
	public void userLogin()

	{
		log.debug("Inside Login Test !!!");
		driver.findElement(By.xpath(OR.getProperty("hotel"))).click();

		log.debug("Hotel clicked");
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("searchotel"))),
				"Succesfully Not Navigate On Hotel Page");
		log.debug("Succesfully Navigate On Hotel Page");
	}
}
