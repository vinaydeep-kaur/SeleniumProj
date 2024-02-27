package com.vinay.Selenium1.login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launcher {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.selenium.dev/selenium/web/index.html");

		String title = driver.getTitle();
		System.out.println(title);

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

		String page = "web-form.html";

		switch (page) {
		case "web-form.html":
			System.out.println("In switch");
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
			driver.findElement(By.linkText("web-form.html")).click();

			web_form.fillWebForm(driver);
			driver.close();
			break;

		default:
			System.out.println("invalid page");
		}
	}
}
