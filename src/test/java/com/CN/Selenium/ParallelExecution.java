import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTest {

    private WebDriver driver;

    @BeforeMethod
    @Parameters("browser")
    public void setup(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        }
    }

    @Test
    @Parameters("url")
    public void openWebsite(String url) {
        driver.get(url);
        System.out.println("Page Title: " + driver.getTitle());
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}







<?xml version="1.0" encoding="UTF-8"?>
<suite name="Parallel Execution Suite" parallel="tests" thread-count="3">
    <test name="Chrome Test">
        <parameter name="browser" value="chrome" />
        <parameter name="url" value="https://www.google.com" />
        <classes>
            <class name="ParallelTest" />
        </classes>
    </test>
    <test name="Firefox Test">
        <parameter name="browser" value="firefox" />
        <parameter name="url" value="https://www.selenium.dev" />
        <classes>
            <class name="ParallelTest" />
        </classes>
    </test>
    <test name="Edge Test">
        <parameter name="browser" value="edge" />
        <parameter name="url" value="https://www.wikipedia.org" />
        <classes>
            <class name="ParallelTest" />
        </classes>
    </test>
</suite>
