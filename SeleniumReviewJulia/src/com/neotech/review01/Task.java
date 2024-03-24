package com.neotech.review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) throws InterruptedException {
		// Task until 1:10
		// Open Chrome browser
		// Navigate to https://www.selenium.dev/
		// Navigate to https://www.google.com/
		// Go back and forth 10 times.
		// Use a for loop
		// Wait 1 second between each navigation

		WebDriver driver = new ChromeDriver();
		String url = "https://www.selenium.dev/";
		driver.get(url);

		driver.manage().window().maximize();
		Thread.sleep(1000);

		driver.navigate().to("https://www.google.com");
		Thread.sleep(1000);

		for (int i = 1; i <= 10; i++) {
			driver.navigate().back();
			Thread.sleep(1000);
			driver.navigate().forward();
			Thread.sleep(1000);
		}

		driver.quit();

	}

}
