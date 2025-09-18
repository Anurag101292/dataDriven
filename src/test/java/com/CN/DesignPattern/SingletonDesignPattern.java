package com.CN.DesignPattern;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingletonDesignPattern {

    //create the instance of class as static so that no one can make the object with new keyword
    private static SingletonDesignPattern instanceofclass=null;
    private WebDriver driver;
    // create constructor as private
    private SingletonDesignPattern(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }
    // static function to acess the class only this function
    public static SingletonDesignPattern getInstanceofSingletonclass(){

        if (instanceofclass==null) {
            instanceofclass = new SingletonDesignPattern();
        }
        return instanceofclass;
    }
   // to access the driver for further processings
    public WebDriver getDriver()
    {
        return driver;
    }

}
----------------------------------------------------------------------------------------
public class ConfigManager {
    private static ConfigManager instance;
    private Properties configProperties;
    
    private ConfigManager() {
        // Load configuration only once
        configProperties = new Properties();
        // Load file logic here...
    }
    
    public static ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }
    
    public String getProperty(String key) {
        return configProperties.getProperty(key);
    }
}
