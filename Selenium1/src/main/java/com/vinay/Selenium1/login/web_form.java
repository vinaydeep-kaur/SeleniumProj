package com.vinay.Selenium1.login;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class web_form {
	public static void fillWebForm(WebDriver driver){
		System.out.println("fill form");
		driver.switchTo().defaultContent();
		
		System.out.println(driver.getPageSource());
		
		String title = driver.getTitle();
		System.out.println(title);

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		String text = "text";
		String password = "password";
		String textarea = "This is string text area. there can be more than 200 words here";
		
		Boolean disabledInput = false;
		Boolean readonlyInput = null;
		String dropdownSelect = "Two";
		String dropdownDataList = "Seattle";
		
		String fileInput = "D:\\myfiles\\Lakehead Studies\\my\\Resume\\Data scientist\\Vinaydeep_Kaur_ML Engineer.pdf";
		Boolean checkedCheckBox = false;
		Boolean defaultCheckedBox = true;
		
		String radioButton = "Default radio";
		
		int colourPickR = 45;
		int colourPickG = 34;
		int colourPickB = 46;
		
		String date = "13/04/2017";
		int range = 7;
		
		
	}
}
