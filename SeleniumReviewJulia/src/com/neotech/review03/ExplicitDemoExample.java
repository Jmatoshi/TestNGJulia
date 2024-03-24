package com.neotech.review03;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.neotech.utils.BaseClass;

public class ExplicitDemoExample extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		setUp();

		/*
		 * //Implicid way //valid throughtout driver lifetime
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		 * 
		 * driver.findElement(By.id("downloadButton")).click();
		 * 
		 * driver.findElement(By.xpath("//div[text()='Complete!']"));
		 */

		/*
		 * //WebDriver Way Explicit wait
		 * 
		 * driver.findElement(By.id("downloadButton")).click();
		 * 
		 * WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(30));
		 * wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(
		 * "//div[text()='Complete!']"))); WebElement label =
		 * driver.findElement(By.xpath("//div[text()='Complete!']"));
		 * 
		 * System.out.println("the label text is: " + label.getText());
		 */

		// fluent wait

////////////////////////////////////////////////////////////////
//// Implicit Wait
//// Always done RIGHT AFTER driver creation
//// Valid throughout the driver lifetime
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
//
//driver.findElement(By.id("downloadButton")).click();
//
//driver.findElement(By.xpath("//div[text()='Complete!']"));
////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////
//// WebDriverWait
//driver.findElement(By.id("downloadButton")).click();
//
//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[text()='Complete!']")));
//
//// Wait until the element is visible
//// Wait for a maximum of 30 seconds
//
//WebElement label = driver.findElement(By.xpath("//div[text()='Complete!']"));
//System.out.println("The label text is -> " + label.getText());
////////////////////////////////////////////////////////////////

// FluentWait
		driver.findElement(By.id("downloadButton")).click();

		FluentWait<WebDriver> fluentWait = new FluentWait<>(driver);
		fluentWait.withTimeout(Duration.ofMinutes(1));
	

		Thread.sleep(2000);

		tearDown();

	}

}
