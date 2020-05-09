package com.CN.rough;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {

	public static  String destpath="";
	Screenshot(WebDriver driver,String testcasename) throws IOException
	{
		
		String imgpath =System.getProperty("user.dir").concat("\\screenshot\\"+testcasename);
		
		File f =new File(imgpath);
		if(!f.exists()) 
		{
			f.mkdir();
		}
		
		Date d = new Date();
		SimpleDateFormat sd=new SimpleDateFormat("dd_MM_yy_HH_mm_ss_a");
		String timestamp =sd.format(d);
		 destpath=imgpath+"\\"+timestamp+".png";
		File dest =new File(destpath);
		TakesScreenshot t =  (TakesScreenshot)driver;
	File srcfile=	t.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(srcfile, dest);
	
	}
}
