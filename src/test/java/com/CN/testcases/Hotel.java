package com.CN.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;


import com.CN.Base.TestBase;

public class Hotel extends TestBase {

	@Test
	public void userLogin() throws Exception

	{
		log.debug("Inside Login Test !!!");
		getWebElement("hotel").click();

		log.debug("Hotel clicked");
		Assert.assertTrue(isElementPresent("searchotel"),"Succesfully Not Navigate On Hotel Page");
			
		log.debug("Succesfully Navigate On Hotel Page");
	}
}
