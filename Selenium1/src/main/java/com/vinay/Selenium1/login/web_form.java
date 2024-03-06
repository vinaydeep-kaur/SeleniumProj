package com.vinay.Selenium1.login;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class web_form {
	public static void fillWebForm(WebDriver driver) {
		System.out.println("fill form");
		driver.switchTo().defaultContent();

		System.out.println(driver.getPageSource());

		String title = driver.getTitle();
		System.out.println(title);

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		String textProperty = "text";
		String passwordProperty = "password";
		String textAreaProperty = "This is string text area. there can be more than 200 words here";

		Boolean disabledInputProperty = false;
		// String readonlyInputProperty = "";
		String dropdownSelectProperty = "Two";
		String dropdownDataListProperty = "Seattle";

		String fileInputProperty = "D:\\myfiles\\Lakehead Studies\\my\\Resume\\Data scientist\\Vinaydeep_Kaur_Data Scientist.pdf";
		Boolean checkedCheckBoxProperty = false;
		Boolean defaultCheckedBoxProperty = true;

		String radioButtonProperty = "Default radio";

		int colourPickRProperty = 45;
		int colourPickGProperty = 34;
		int colourPickBProperty = 46;

		String dateProperty = "05/13/2017";
		int rangeProperty = 7;

		if (textProperty != null) {
			WebElement text = driver.findElement(By.id("my-text-id"));
			text.sendKeys(textProperty);
		}
		if (passwordProperty != null) {
			WebElement password = driver.findElement(By.name("my-password"));
			password.sendKeys(passwordProperty);
		}
		if (textAreaProperty != null) {
			WebElement textArea = driver.findElement(By.name("my-textarea"));
			textArea.sendKeys(textAreaProperty);
		}

		if (disabledInputProperty != null) {
			WebElement disableInput = driver.findElement(By.name("my-disabled"));
			if (!disableInput.isEnabled()) {
				System.out.println("The disabled element is disabled");
			}
		}
		WebElement readOnlyInputProperty = driver.findElement(By.name("my-readonly"));
		System.out.println(readOnlyInputProperty.getText());
		System.out.println(readOnlyInputProperty.getAttribute("value"));

		WebElement selectElement = driver.findElement(By.name("my-select"));
		Select selectList = new Select(selectElement);
		List<WebElement> options = selectList.getOptions();

		for (WebElement e : options) {
			if (e.getText().equals(dropdownSelectProperty)) {
				e.click();
				System.out.println("clicked on two");
			}
		}

		if (dropdownDataListProperty != null) {
			WebElement dataList = driver.findElement(By.name("my-datalist"));
			dataList.sendKeys(dropdownDataListProperty);
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

		if (fileInputProperty != null) {
			driver.findElement(By.name("my-file")).sendKeys(fileInputProperty);
		}

		if (checkedCheckBoxProperty == false) {
			if (driver.findElement(By.id("my-check-1")).isSelected()) {
				driver.findElement(By.id("my-check-1")).click();
			}
		}
		
		if (defaultCheckedBoxProperty == true) {
			if (!driver.findElement(By.id("my-check-2")).isSelected()) {
				driver.findElement(By.id("my-check-2")).click();
			}
		}
		
		if(radioButtonProperty != null) {
			if(radioButtonProperty == "Default radio") {
				driver.findElement(By.id("my-radio-2")).click();
			}
			else {
				driver.findElement(By.id("my-radio-1")).click();
			}
		}
		
		if(dateProperty !=null) {
			driver.findElement(By.name("my-date")).sendKeys(dateProperty);
		}
	
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//button")).click();
	}
}
