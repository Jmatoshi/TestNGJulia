package com.neotech.review03;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class DiscoTabSwitch extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		setUp();

		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(1000);

		Set<String> allWindows = driver.getWindowHandles();

		Iterator<String> it = allWindows.iterator();
		String handle1 = it.next();
		String handle2 = it.next();

		for (int i = 1; i <= 10; i++) {
			driver.switchTo().window(handle1);
			Thread.sleep(400);
			driver.switchTo().window(handle2);
			Thread.sleep(400);
		}

		driver.close(); // Will close ONLY the current tab/window
		Thread.sleep(3000);

		// driver.quit(); // Will close ALL the open tabs/windows

		tearDown(); // Here we are using --> driver.quit();

		// HW only for good students
		// Click on all the buttons
		// Then close them, one by one
	}

}
