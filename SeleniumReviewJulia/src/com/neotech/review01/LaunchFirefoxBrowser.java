package com.neotech.review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {
		// This code will open a Mozilla Firefox Browser
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		String url = "https://www.nytimes.com/games/wordle/index.html";
		

		// It will navigate to a specific website
		driver.get(url);

		// Wait for 2 seconds
		Thread.sleep(2000); // 2 seconds
		
		String currentURL = driver.getCurrentUrl();
		if (url.equals(currentURL))
		{
			System.out.println("URL are the same!!");
		}
		else 
		{
			System.out.println("URL are different!!");
		}
		//get website title
		
		String title = driver.getTitle();
		System.out.println(title);

		// Quit (close) the browser
		driver.quit();


	}

}
