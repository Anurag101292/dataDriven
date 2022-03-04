package com.CN.utilities.ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.reporter.configuration.ViewName;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ETReportTest {
    @Test
    public void report() throws IOException {
        ExtentReports extent_reports = new ExtentReports();
        //Make a customize view
        ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter("Anurag.html").
                viewConfigurer().viewOrder().as(new ViewName[]{ViewName.DASHBOARD,ViewName.LOG}).apply();//html file will be generated

        extentSparkReporter.config().setTheme(Theme.DARK);
        extentSparkReporter.config().setReportName("MyReport");
        extentSparkReporter.config().setDocumentTitle("Attachmentreport");
        //you can also set these 3 lines from .xmlfiles  and set below lines.
      //  final File f = new File("test-output/config.xml");
       /// extentSparkReporter.loadXMLConfig(f);

        extent_reports.attachReporter(extentSparkReporter);

        ExtentTest extentTest = extent_reports.createTest("Login test").assignAuthor("Anurag").assignCategory("Smoke");
        extentTest.log(Status.valueOf("Teststarted"),"login url");
        extentTest.pass("");
        extentTest.fail(MarkupHelper.createLabel("Login test Failed", ExtentColor.RED));//mark this as red

        extent_reports.flush();
    }
}
