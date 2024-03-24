package com.neotech.review04;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;
import com.neotech.utils.CommonMethods;

public class ScreenshotExample extends CommonMethods{

	public static void main(String[] args) {
		// https://www.facebook.com/
		
		
		setUp();
		
		wait(1);
		
		
		//taking screenshot
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File ("screenshots/FacebookLogin.png");
		
		try {
			Files.copy (source,destination);
		} catch (IOException e) {
			System.out.println("Could nopt save the screenshot");
			e.printStackTrace();
		}
		
		System.out.println("--------------------");
		
		
		//taking screenshot of a web element
		
		WebElement form = driver.findElement(By.xpath("//form[@data-testid='royal_login_form']"));
		
		TakesScreenshot ts2 = (TakesScreenshot) driver;
		
		File source2 = ts.getScreenshotAs(OutputType.FILE);
		File destination2 = new File ("screenshots/Form.png");
		
		try {
			Files.copy (source2,destination2);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		wait(1);
		
		tearDown();
		
	}

}
