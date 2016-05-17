package com.staffing.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Slider 
{
	public void slider(WebDriver driver)
	{
	Actions action=new Actions(driver);
	WebElement slider=driver.findElement(By.className("slimScrollBar"));
	int y=slider.getLocation().y;
	action.dragAndDropBy(slider, 250, y).build().perform();
	}
}
