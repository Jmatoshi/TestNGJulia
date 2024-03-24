package com.neotech.review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		String url = "https://www.instagram.com/";
		
		driver.get(url);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.mlssoccer.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.fifa.com/");
		Thread.sleep(2000);
		
		driver.switchTo().newWindow(WindowType.TAB);

		driver.get("https://www.uefa.com");
		Thread.sleep(2000);
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
