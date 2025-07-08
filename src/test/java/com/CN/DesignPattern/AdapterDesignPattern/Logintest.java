public class LoginTest {
    public static void main(String[] args) {
        WebUIClient client;

        // Choose based on config or environment
        if (System.getenv("driver").equals("playwright")) {
            client = new PlaywrightClient();
        } else {
            client = new SeleniumClient();
        }

        client.open("https://example.com/login");
        client.type("#username", "admin");
        client.type("#password", "secret");
        client.click("#login-button");

        System.out.println("Page Title: " + client.getTitle());

        client.close();
    }
}
