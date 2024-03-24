package com.neotech.review04;

import java.util.List;



import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;



import com.neotech.utils.CommonMethods;



public class CalendarHandling extends CommonMethods {

	// Go to this link: https://jqueryui.com/

	// Click on Datepicker from the left menu

	// Show the Calendar

	// Select 09/25/2024 from the Calendar

	// Verify that you have selected 09/25/2024



	public static void main(String[] args) {

		setUp();



		WebElement link = driver.findElement(By.linkText("Datepicker"));



		// 1st way, using Selenium click() method

		// link.click();



		// 2nd way, using CommonMethods click() method

		click(link);



		// Switching to the FRAME



		// 1st way, using Selenium.switchTo().frame() method

		// driver.switchTo().frame(0);



		// 2nd way, using CommonMethods switchToFrame() method (using index)

		// switchToFrame(0);



		// 3rd way, using CommonMethods switchToFrame() method (using WebElement)

		switchToFrame(driver.findElement(By.tagName("iframe")));



		WebElement dateTextBox = driver.findElement(By.id("datepicker"));

		dateTextBox.click();

		wait(1);



		String expectedMonthYear = "September 2026";



		while (true) {

			WebElement monthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title"));

			String monthYearText = monthYear.getText();



			if (monthYearText.equals(expectedMonthYear)) {

				break;

			}



			driver.findElement(By.xpath("//span[text()='Next']")).click();

		}

		wait(1);



		// Now we need to click on the correct date

		String expectedDay = "25";

		List<WebElement> days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));



		// Iterate all the days until I find 25th and then click on it.

		for (WebElement day : days) {

			if (day.getText().equals(expectedDay)) {

				// I have found the correct day

				day.click();

				break;

			}

		}

		wait(2);



		// Let's verify that we selected the correct date -> 09/25/2026

		String expectedDate = "09/25/2026";



		if (dateTextBox.getAttribute("value").equals(expectedDate)) {

			System.out.println("Test Passed");

		} else {

			System.out.println("Test Failed");

		}



		tearDown();



		// Extra practice

		// Go to this link:

		// https://demo.seleniumeasy.com/bootstrap-date-picker-demo.html



		// Select 21/01/2023 in the first Calendar



		// Select a range of dates in the -> Date Range Example :

	}
}
