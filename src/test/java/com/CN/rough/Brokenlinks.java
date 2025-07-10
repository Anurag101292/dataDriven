package com.CN.rough;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks {

	public static void isbrokenlink(String URI)

	{
		int respCode = 200;
		HttpURLConnection huc = null;
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(URI);
		List<WebElement> links = driver.findElements(By.tagName("a"));

		for (WebElement link : links) {
			String uri = link.getAttribute("href");

			System.out.println(uri);

			if (uri == null || uri.isEmpty()) {
				System.out.println("URL is either not configured for anchor tag or it is empty");
				continue;
			}

			if (!uri.startsWith(URI)) {
				System.out.println("URL belongs to another domain, skipping it.");
				continue;

			}
			try {
				huc = (HttpURLConnection)(new URL(uri).openConnection());

				huc.setRequestMethod("HEAD");

				huc.connect();

				respCode = huc.getResponseCode();

				if (respCode >= 400) {
					System.out.println(uri + " is a broken link");
				} else {
					System.out.println(uri + " is a valid link");
				}

			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		driver.quit();

	}

	public static void main(String[] args) {
		Brokenlinks.isbrokenlink("https://www.healthkart.com/");
	}

}
-----------------------------------------------------------------------------------------------------
	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Optional;

public class BrokenLinkCheckerWithStreams {

    public static void main(String[] args) {

        // Set path to your chromedriver binary
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://example.com");

            List<WebElement> allLinks = driver.findElements(By.tagName("a"));

            System.out.println("🔗 Total links found: " + allLinks.size());

            allLinks.stream()
                    .map(link -> Optional.ofNullable(link.getAttribute("href")).orElse("")) // handle nulls
                    .filter(href -> !href.trim().isEmpty()) // filter out empty hrefs
                    .distinct() // avoid checking same URL multiple times
                    .forEach(url -> {
                        if (isLinkBroken(url)) {
                            System.out.println("❌ Broken link: " + url);
                        } else {
                            System.out.println("✅ Valid link: " + url);
                        }
                    });

        } finally {
            driver.quit();
        }
    }

    private static boolean isLinkBroken(String urlString) {
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(urlString).openConnection();
            connection.setRequestMethod("HEAD");
            connection.setConnectTimeout(3000);
            connection.connect();
            int responseCode = connection.getResponseCode();
            return responseCode >= 400;
        } catch (Exception e) {
            System.out.println("⚠️ Exception while checking " + urlString + ": " + e.getMessage());
            return true;
        }
    }
}
