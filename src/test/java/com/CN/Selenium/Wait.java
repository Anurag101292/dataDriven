package com.CN.Selenium;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
//import managers.FileReaderManager;


public class Wait {

    public static void untilJqueryIsDone(WebDriver driver){
    //    untilJqueryIsDone(driver, FileReaderManager.getInstance().getConfigReader().getImplicitlyWait());
    }

    public static void untilJqueryIsDone(WebDriver driver, Long timeoutInSeconds){
        until(driver, (d) ->
        {
            Boolean isJqueryCallDone = (Boolean)((JavascriptExecutor) driver).executeScript("return jQuery.active==0");
            if (!isJqueryCallDone) System.out.println("JQuery call is in Progress");
            return isJqueryCallDone;
        }, timeoutInSeconds);
    }

    public static void untilPageLoadComplete(WebDriver driver) {
    //    untilPageLoadComplete(driver, FileReaderManager.getInstance().getConfigReader().getImplicitlyWait());
    }

    public static void untilPageLoadComplete(WebDriver driver, Long timeoutInSeconds){
        until(driver, (d) ->
        {
            Boolean isPageLoaded = (Boolean)((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            if (!isPageLoaded) System.out.println("Document is loading");
            return isPageLoaded;
        }, timeoutInSeconds);
    }

    public static void until(WebDriver driver, Function<WebDriver, Boolean> waitCondition){
   //     until(driver, waitCondition, FileReaderManager.getInstance().getConfigReader().getImplicitlyWait());
    }


    private static void until(WebDriver driver, Function<WebDriver, Boolean> waitCondition, Long timeoutInSeconds){
        WebDriverWait webDriverWait = new WebDriverWait(driver, timeoutInSeconds);
        webDriverWait.withTimeout(timeoutInSeconds, TimeUnit.SECONDS);
        try{
            webDriverWait.until(waitCondition);
        }catch (Exception e){
            System.out.println(e.getMessage());









            ✅ Prerequisites
java
Copy
Edit
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

✅ 1. Wait for Element to be Visible

WebDriver driver = new ChromeDriver();
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

WebElement loginBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login")));
loginBtn.click();

Waits until the element is visible on screen, not just in DOM.

✅ 2. Wait for Element to be Clickable

WebElement submitBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("submit")));
submitBtn.click();

Useful when buttons take time to become interactive (e.g., after form validation).

✅ 3. Wait for Element to be Invisible
java
Copy
Edit
boolean isGone = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loadingSpinner")));
🔍 Use Case:
Wait for a loader/spinner to disappear before proceeding.

✅ 4. Wait for Presence in DOM (but not necessarily visible)

WebElement hiddenField = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("hidden-input")));
🔍 Use Case:
Waits for element to be present in the DOM — even if it's hidden.

✅ 5. Wait for Text to Be Present in an Element

wait.until(ExpectedConditions.textToBePresentInElementLocated(
    By.id("welcomeMessage"), "Welcome Anurag"));

Useful when element text is updated via AJAX or after login.

✅ 6. Wait for Title Contains Text

wait.until(ExpectedConditions.titleContains("Dashboard"));
🔍 Use Case:
After login, wait until title confirms user is on correct page.

✅ 7. Wait for URL to Change or Match

wait.until(ExpectedConditions.urlContains("/dashboard"));
or
wait.until(ExpectedConditions.urlToBe("https://example.com/dashboard"));
🔍 Use Case:
Ensure page navigation has occurred (post-login, redirects, etc.)

✅ 8. Wait for Alert to Be Present

wait.until(ExpectedConditions.alertIsPresent());
Alert alert = driver.switchTo().alert();
alert.accept();  // or alert.dismiss();
🔍 Use Case:
Confirm alert appears before switching and accepting.

✅ 9. Wait for Attribute to Contain Specific Value

wait.until(ExpectedConditions.attributeContains(
    By.id("submitBtn"), "class", "btn-active"));
🔍 Use Case:
Wait for CSS class or attribute to dynamically change before clicking.

✅ 10. Wait for Number of Elements to Be More Than N

wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(
    By.className("product-tile"), 5));
🔍 Use Case:
Useful when waiting for list to populate from API.

✅ 11. Wait for Frame and Switch to It

wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("loginFrame")));
🔍 Use Case:
Before accessing elements inside an iframe.

✅ 12. Wait for Custom Condition (Using FluentWait)

FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
        .withTimeout(Duration.ofSeconds(15))
        .pollingEvery(Duration.ofMillis(500))
        .ignoring(NoSuchElementException.class);

WebElement logoutBtn = fluentWait.until(driver1 -> {
    WebElement element = driver1.findElement(By.id("logout"));
    return element.isDisplayed() && element.isEnabled() ? element : null;
});
        }
    }


}
