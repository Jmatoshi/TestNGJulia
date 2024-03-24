package com.neotech.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {
		//
		
			
			WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://demoqa.com/text-box";
		driver.get(url);
		
		driver.findElement(By.cssSelector("input#userName")).sendKeys("hello niha");
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("d.trump@maga.com");
		
		driver.findElement(By.cssSelector("textarea.form-control")).sendKeys("PA");
		
		driver.findElement(By.id("permanentAddress")).sendKeys("New York");
		
		driver.findElement(By.id("submit")).click();
		
		//textarea[@class='form-control' and @id='permanentAdress']
		

	}

}
