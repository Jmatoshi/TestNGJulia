package com.neotech.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		String url = "https://www.amazon.com/";
		driver.get(url);

		Thread.sleep(2000);

		// There are 8 locators to find elements in the DOM
		// id, name, className, linkText, partialLinkText, tagName, xPath, cssSelector

		WebElement searchText = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchText.sendKeys("Dominos");
		
		Thread.sleep(3000);
		
		WebElement searchButton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		searchButton.click();
		

		Thread.sleep(3000);
		driver.quit();

	}

}
