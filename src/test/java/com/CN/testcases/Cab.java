package com.CN.testcases;


import org.testng.annotations.Test;

import com.CN.Base.TestBase;
import com.CN.utilities.DataProvide;

public class Cab extends TestBase {

	@Test(dataProviderClass = DataProvide.class,dataProvider="dp")
	public void cab(String from) throws Exception {
		
		log.debug("Inside cab  !!!");
		getWebElement("cabs").click();
	
	
		getWebElement("from").sendKeys(from);
		log.debug("source location  entering");
	}
	

}
