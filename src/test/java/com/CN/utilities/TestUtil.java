package com.CN.utilities;

public class TestUtil {

	public static boolean isTestRunable(String testName,ExcelReader excel) {
		String sheetname="Test_suite";
		
	int row =	excel.getRowCount(sheetname);
	
	for (int rownum = 2; rownum <= row; rownum++) {
		
		
		String testcase=excel.getCellData(sheetname, "TC_ID", rownum);
	

		
		if (testcase.equalsIgnoreCase(testName)) {
			
			
			String runmode=excel.getCellData(sheetname, "RUNMODE", rownum);
			
			if (runmode.equalsIgnoreCase("Y"))
				
				return true;
			else return false;
					
					
		}
		
		
		}return false;
		
	}
	}
	
