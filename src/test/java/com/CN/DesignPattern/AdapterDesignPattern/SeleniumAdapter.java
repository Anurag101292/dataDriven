public class SeleniumClient implements WebUIClient {
    private WebDriver driver;

    public SeleniumClient() {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
    }

    public void open(String url) {
        driver.get(url);
    }

    public void click(String selector) {
        driver.findElement(By.cssSelector(selector)).click();
    }

    public void type(String selector, String text) {
        driver.findElement(By.cssSelector(selector)).sendKeys(text);
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void close() {
        driver.quit();
    }
}
