package com.CN.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.CN.Base.TestBase;

public class Bus extends TestBase {

	@Test(dataProvider = "getData")
	public void testBus(String from) {
		log.debug("Inside Bus Test !!!");
		driver.findElement(By.xpath(OR.getProperty("bus"))).click();

		log.debug("Bus clicked");
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("searchbus"))),
				"Succesfully Navigate On Bus Page");
		log.debug("Succesfully Navigate On Bus Page");

		driver.findElement(By.id(OR.getProperty("from"))).sendKeys(from);
		log.debug("source location filled");

	}

	@DataProvider
	public Object[][] getData() {
		String sheetname = "Bus";
		int row = excelreader.getRowCount(sheetname);
		int col = excelreader.getColumnCount(sheetname);

		log.debug(row);
		log.debug(col);

		Object[][] data = new Object[row - 1][col];

		for (int rownum = 2; rownum <= row; rownum++) {

			for (int colnum = 0; colnum < col; colnum++) {

				data[rownum - 2][colnum] = excelreader.getCellData("Bus", colnum, rownum);
				System.out.println(data[rownum - 2][colnum]);
			}
		}
		return data;
	}
}
