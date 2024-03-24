package com.neotech.review04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.neotech.utils.CommonMethods;

public class ActionsExample extends CommonMethods {

	public static void main(String[] args) {
		// http://webdriveruniversity.com/Actions/index.html

		setUp();
		
		Actions act = new Actions(driver);
//////////////////////////////////////////////////////////////////////////////////		
//		//drag and drop
//		
//		WebElement draggable = driver.findElement(By.id("draggable"));
//		WebElement droppable = driver.findElement(By.id("droppable"));
//	    //ONE WAY	
//	    //	act.dragAndDrop(draggable, droppable).perform();
//		//dont forget the perform() AT THE END
//		
//		
//		//another way
//		act.clickAndHold(draggable).moveToElement(droppable).pause(1000).release().perform();
//		
//	//////////////////////////////////////////////////////////////////////////////////	
	
		WebElement dblClickButton = driver.findElement(By.id("double-click"));
		
		//does clicking two times work? no
	//	dblClickButton.click();
	//	dblClickButton.click();
		
	//	act.doubleClick(dblClickButton).perform();
		
		//////////////////////////////////////////////////////////////////////////////////		
		
	//	Mouse Hover
		
		List<WebElement> hoverButtons = driver.findElements(By.cssSelector("button.dropbtn"));



		for (WebElement btn : hoverButtons) {

			act.moveToElement(btn).pause(300).perform();

		}
		
		
//////////////////////////////////////////////////////////////////////////////////
		
		
		WebElement div = driver.findElement(By.id("click-box"));



		act.clickAndHold(div).pause(3000).release().pause(1000).clickAndHold(div).pause(1000).release().perform();



		wait(2);



		tearDown();

		
		
		
		
		
		wait(1);

		tearDown();

	}

}
