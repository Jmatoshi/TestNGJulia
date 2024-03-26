package com.neotech.review04;

import java.io.File;

import java.io.IOException;



import org.openqa.selenium.By;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;



import com.google.common.io.Files;

import com.neotech.utils.CommonMethods;



public class UploadExample extends CommonMethods {



	public static void main(String[] args) {

		// https://neotech.vercel.app/fileUpload

		setUp();



		String filePath = System.getProperty("user.dir") + "/screenshots/Form.png";



		// File can be anywhere in my computer

		// filePath = "/Users/limanaj/Desktop/Me.jpg";



		driver.findElement(By.id("image_file")).sendKeys(filePath);

		wait(1);



		driver.findElement(By.id("btnUpload")).click();



		// Let's wait for the div with class "ContactUs" to be visible

		waitForVisibility(driver.findElement(By.cssSelector("div.ContactUs")));



		String expectedMessage = "File uploaded successfully!";

		String actualMessage = driver.findElement(By.id("upload_response")).getText();



		String destinationPath = "screenshots/";

		if (actualMessage.contains(expectedMessage)) {

			// Test passed

			destinationPath += "passed/upload.png";

		} else {

			// Test failed

			destinationPath += "failed/upload.png";

		}



		TakesScreenshot ts = (TakesScreenshot) driver.findElement(By.cssSelector("div.css-0"));

		File src = ts.getScreenshotAs(OutputType.FILE);

		File dest = new File(destinationPath);



		try {

			Files.copy(src, dest);

		} catch (IOException e) {

			e.printStackTrace();

		}



		wait(2);



		tearDown();


	}

}
