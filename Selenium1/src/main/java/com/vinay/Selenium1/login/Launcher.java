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
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		driver.findElement(By.linkText("web-form.html")).click();
		
		title = driver.getTitle();
		System.out.println(title);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
//		String text = "text";
//		String password = "password";
//		String textarea = "This is string text area. there can be more than 200 words here";
//		
//		Boolean disabledInput = false;
//		Boolean readonlyInput = null;
//		
		
		
		
		driver.close();
	}
}
