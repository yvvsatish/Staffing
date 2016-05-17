package com.staffing.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Logout {
	@Test
	public void logoutstaffing(WebDriver driver)
	{
		Actions action = new Actions(driver);
		WebElement event1 = driver.findElement(By.className("dropdown-toggle"));
		WebElement event2 = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/ul/li/ul/li[3]/a"));
		action.moveToElement(event1).moveToElement(event2).click().build().perform();
	}
}
