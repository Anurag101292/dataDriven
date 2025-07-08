import com.microsoft.playwright.*;

public class PlaywrightClient implements WebUIClient {
    private Playwright playwright;
    private Browser browser;
    private Page page;

    public PlaywrightClient() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch();
        page = browser.newPage();
    }

    public void open(String url) {
        page.navigate(url);
    }

    public void click(String selector) {
        page.click(selector);
    }

    public void type(String selector, String text) {
        page.fill(selector, text);
    }

    public String getTitle() {
        return page.title();
    }

    public void close() {
        browser.close();
        playwright.close();
    }
}
