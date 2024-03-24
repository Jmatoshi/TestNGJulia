package com.neotech.review03;

import java.util.Set;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class HandlingWindows extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		setUp();

		String window1 = driver.getWindowHandle();
		System.out.println(window1);
		// chrome -> 2A312D931D007CDCFC94240DBC0E6640
		// chrome -> D81779B68FAA5FB5A7B3D7A8ABF203DE
		// firefox -> 2002bd4a-dcc8-431b-b915-2c3db0092a1b
		// firefox -> 274c560b-fb4d-40f2-9495-53c241e4bd69

		driver.findElement(By.id("tabButton")).click();

		Thread.sleep(2000);

		System.out.println("--------------------------------");

		// I am NOT able to Locate elements. The focus is still on the first page
		// driver.findElement(By.name("q")).sendKeys("Gena is the best student!");

		Set<String> allWindows = driver.getWindowHandles();

		for (String windowId : allWindows) {
			System.out.println(windowId);

			if (!windowId.equals(window1)) {
				// If the windowId is NOT equal to the first Windowd ID
				driver.switchTo().window(windowId);
				break;
			}
		}

		// Now I am able to Locate elements. The focus is on the second page
		driver.findElement(By.name("q")).sendKeys("Gena is the best student!");
		Thread.sleep(3000);

		// HW for Moe
		// Switch the window using iterator

		tearDown();
	}

	}


