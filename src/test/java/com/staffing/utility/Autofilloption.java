package com.staffing.utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Autofilloption {
	@FindBy(id="DropdownCountry")
	WebElement dropdown;
	public void selectoptionautofill(String selectone)
	{
		WebElement option=dropdown;
		List<WebElement> select=option.findElements(By.tagName("li"));
		for (int i = 0; i < select.size(); i++) 
		{
			String x=select.get(i).getText();
			if(x.equals(selectone))
			{
				select.get(i).findElement(By.tagName("a")).click();
				break;
			}
		}
	}
}