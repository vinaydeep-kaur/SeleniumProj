package com.vinay.Selenium1.login;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launcher {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.selenium.dev/selenium/web/web-form.html");

		String title = driver.getTitle();
		System.out.println(title);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		driver.close();
	}
}
