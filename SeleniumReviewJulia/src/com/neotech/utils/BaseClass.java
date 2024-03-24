package com.neotech.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public static WebDriver driver;

	public static void setUp() {
		
		/**

		 * This method will initialize the browser

		 */



			ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);



			switch (ConfigsReader.getProperty("browser").toLowerCase()) {

			case "chrome":

				driver = new ChromeDriver();

				break;

			case "firefox":

				driver = new FirefoxDriver();

				break;

			default:

				throw new RuntimeException("Other browsers are NOT supported!!!");

			}



			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.IMPLICIT_WAIT_TIME));

			driver.manage().window().maximize();

			driver.get(ConfigsReader.getProperty("url"));

		}



		/**

		 * This method will quit the browser

		 */

		public static void tearDown() {

			if (driver != null)

				driver.quit();


		}
	}


