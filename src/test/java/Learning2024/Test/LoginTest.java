package Learning2024.Test;

import Learning2024.PageObject.LoginPage;
import Learning2024.Utility.ConfigManager;
import Learning2024.Utility.Logger;
import Learning2024.Utility.ThreadPool;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
    private WebDriver driver;
    private LoginPage loginPage;
    private Logger logger;
    private ThreadPool threadPool;
    private ConfigManager config;

    @BeforeClass
    public void setUp() {
        // Initialize the WebDriver
        driver = new ChromeDriver();
        driver.get(config.getProperty("URL"));

        // Get the Singleton Logger instance
        logger = Logger.getInstance();
        logger.log("Test started");
        threadPool = ThreadPool.getInstance();
    }

    @Test
    public void testLogin() {
        threadPool.submit(()-> loginPage = new LoginPage(driver));
        loginPage.enterUsername();
        loginPage.enterPassword();
        loginPage.clickLogin();

        logger.log("Login test executed");
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
        threadPool.shutdown();
        // Log the end of the test
        logger.log("Test ended");

        // Close the logger
        logger.close();
    }
}
