package com.CN.rough;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DockerImage {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap =  DesiredCapabilities.chrome();
		
		URL u = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver rwd = new RemoteWebDriver(u,cap);
		rwd.get("https://www.google.com/webhp?authuser=1");
		System.out.println(rwd.getTitle());
	}
}
