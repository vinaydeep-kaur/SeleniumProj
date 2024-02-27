package com.vinay.Selenium1.login;

import org.openqa.selenium.WebDriver;

public class web_form {
	public static void fillWebForm(WebDriver driver){
		System.out.println("fill form");
		driver.switchTo().defaultContent();
		
		System.out.println(driver.getPageSource());
	}
}
