package com.CN.utilities.LOG4J;

import org.apache.log4j.*;

public class SampleEntry {

//    Log4j
//    Log4j consists of four main components
//
// 1.   LogManager
// 2.   Loggers
// 3.   Appenders
// 4.   Layouts

//    This is the static class that helps us get loggers with different names and hierarchy.
//    You can consider LogManager as a factory producing logger objects.

    static Logger mainLogger = LogManager.getLogger(SampleEntry.class.getName());

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        BasicConfigurator.configure();
        ConsoleAppender appender = new ConsoleAppender();
        appender.activateOptions();
        PatternLayout layoutHelper = new PatternLayout();
        layoutHelper.setConversionPattern("%-5p [%t]: %m%n");
        layoutHelper.activateOptions();
        //mainLogger.getAppender("ConsoleAppender").setLayout(layoutHelper);
        appender.setLayout(layoutHelper);
        mainLogger.addAppender(appender);
        //Create a console appender and attach it to our mainLogger
        mainLogger.info("Pattern 1 is displayed like this");
        layoutHelper.setConversionPattern("%C %m%n");
        mainLogger.info("Pattern 2 is displayed like this");
    }
}

