package Learning2024.PageObject;

import Learning2024.Utility.ConfigManager;
import Learning2024.Utility.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class LoginPage {
    private WebDriver driver;
    private Logger logger;
    private ConfigManager config;

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.logger = Logger.getInstance();
        this.config = ConfigManager.getInstance(); // Get the Singleton Logger instance
    }

    // Locate elements
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.id("loginButton");

    // Methods to interact with elements
    public void enterUsername() {
        String username = config.getProperty("username");
        driver.findElement(usernameField).sendKeys(username);
        logger.log("Entered username: " + username);
    }

    public void enterPassword() {
        String password = config.getProperty("password");
        driver.findElement(passwordField).sendKeys(password);
        logger.log("Entered password: " + password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
        logger.log("Clicked login button");
    }
}
