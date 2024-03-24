package com.neotech.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearchCSS {

	public static void main(String[] args) throws InterruptedException  {
		// 
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://www.amazon.com";
		driver.get(url);
	
		
		Thread.sleep(3000);
		
		WebElement searchTex = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		searchTex.sendKeys("Backgamon");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("span#nav-search-submit-text > input")).click();
		Thread.sleep(1000);
		
		driver.quit();
		

	}

}
