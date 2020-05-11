package com.CN.utilities;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

import com.CN.Base.TestBase;

public class DataProvide extends TestBase {

	
	@DataProvider(name="dp")
	public Object[][] getData(Method M) {
		String sheetname = M.getName();
		System.out.println(sheetname);
		int row = excelreader.getRowCount(sheetname);
		int col = excelreader.getColumnCount(sheetname);

		log.debug(row);
		log.debug(col);

		Object[][] data = new Object[row - 1][col];

		for (int rownum = 2; rownum <= row; rownum++) {

			for (int colnum = 0; colnum < col; colnum++) {

				data[rownum - 2][colnum] = excelreader.getCellData(sheetname, colnum, rownum);
				System.out.println(data[rownum - 2][colnum]);
			}
		}
		return data;
	}
}
 