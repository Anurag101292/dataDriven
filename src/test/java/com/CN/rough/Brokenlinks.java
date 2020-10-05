package com.CN.rough;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks {

	public static void isbrokenlink(String URI)

	{
		int respCode = 200;
		HttpURLConnection huc = null;
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/test/resources/executables/chromedriver");
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
				huc = (HttpURLConnection) (new URL(uri).openConnection());

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
