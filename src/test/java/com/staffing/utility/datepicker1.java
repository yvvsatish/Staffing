package com.staffing.utility;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;


public class datepicker1 {
	@FindBy(className="ui-datepicker-year")
	WebElement year;
	@FindBy(className="ui-datepicker-month")
	WebElement month;
	@FindBy(className="ui-datepicker-calendar")
	WebElement calendar;
	@Test
	public WebElement Datepicker(String s) throws InterruptedException, IOException{
		String date1=s;
		String a[]=date1.split("/");
		String dd=a[1];
		String mm=a[0];
		String yy=a[2];
		WebElement date=null;
		String months[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		int mnh=Integer.parseInt(mm);
		String cntmn=months[mnh-1];
		System.out.println(cntmn);
		System.out.println(yy);
		Thread.sleep(5000);
		year.sendKeys(yy);
		Thread.sleep(1000);
		month.click();
		month.sendKeys(cntmn);
		Thread.sleep(1000);
		WebElement cal=calendar;
		boolean flag=false;
		List<WebElement> rows=cal.findElements(By.tagName("tr"));
		for (int i = 1; i < rows.size(); i++)
		{
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < cols.size(); j++) 
			{
				if(cols.get(j).getText().equals(dd))
				{
					date=cols.get(j).findElement(By.tagName("a"));
					flag=true;
					break;
				}
			}
			if(flag==true)
			{
				break;
			}
		}
		return date;
	}
}