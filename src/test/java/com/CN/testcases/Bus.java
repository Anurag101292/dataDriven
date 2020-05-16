package com.CN.testcases;


import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.CN.Base.TestBase;
import com.CN.utilities.DataProvide;
import com.CN.utilities.TestUtil;

public class Bus extends TestBase {

	@Test(dataProviderClass = DataProvide.class,dataProvider="dp")
	public void bus(String from) throws Exception {
		
		
		if(!(TestUtil.isTestRunable("bus", excelreader))) {throw new SkipException("Skippinng the test");}
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
