package com.CN.testcases;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;


import com.CN.Base.TestBase;
import com.CN.utilities.TestUtil;

public class Hotel extends TestBase {

	@Test
	public void hotel() throws Exception

	{
		if(!(TestUtil.isTestRunable("hotel", excelreader))) {throw new SkipException("Skippinng the test");}
		log.debug("Inside Login Test !!!");
		getWebElement("hotel").click();

		log.debug("Hotel clicked");
		Assert.assertTrue(isElementPresent("searchotel"),"Succesfully Not Navigate On Hotel Page");
			
		log.debug("Succesfully Navigate On Hotel Page");
	}
}
