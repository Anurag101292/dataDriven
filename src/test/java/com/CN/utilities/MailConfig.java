package com.CN.utilities;

public class MailConfig {

	public static String server = "smtp.gmail.com";
	public static String from = "upanu1012@gmail.com";
	public static String password = "$H0pp1ng1";
	public static String[] to = { "anuup2010@gmail.com", "anurag10upadhyay@gmail.com" };
	public static String subject = "Test Report";

	public static String messageBody = "TestMessage";
	public static String attachmentPath = System.getProperty("user.dir") + "//Reports.zip";
	public static String attachmentName = "reports.zip";

}
