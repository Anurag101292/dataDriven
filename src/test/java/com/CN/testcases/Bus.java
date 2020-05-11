package com.CN.testcases;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.CN.Base.TestBase;
import com.CN.utilities.DataProvide;

public class Bus extends TestBase {

	@Test(dataProviderClass = DataProvide.class,dataProvider="dp")
	public void bus(String from) throws Exception {
		log.debug("Inside Bus Test !!!");
		getWebElement("bus").click();

		log.debug("Bus clicked");
		Assert.assertTrue(isElementPresent("searchbus"),
				"Succesfully Navigate On Bus Page");
		log.debug("Succesfully Navigate On Bus Page");

		getWebElement("Frombus").sendKeys(from);
		log.debug("source location filled");

	}
    

}
