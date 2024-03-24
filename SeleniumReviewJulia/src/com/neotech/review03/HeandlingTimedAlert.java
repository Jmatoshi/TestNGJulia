package com.neotech.review03;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;

public class HeandlingTimedAlert extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		setUp();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("btnAlert")).click();
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println("The tes of the alert is: " + alert.getText());
		alert.accept();
		Thread.sleep(2000);
		
		driver.findElement(By.id("btnDelayedAlert")).click();
		
		
		//Handling the delayed alert
		//explic wait
		// wait of max 20 seconds
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(2000);
		
		alert = driver.switchTo().alert();
		alert.accept();
		
		
		Thread.sleep(2000);
		
		
		tearDown();

	}

}
