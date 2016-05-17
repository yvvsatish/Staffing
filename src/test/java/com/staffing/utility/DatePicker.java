package com.staffing.utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DatePicker {
	@FindBy(className="ui-datepicker-year")
	WebElement cntyear;
	@FindBy(className="ui-datepicker-month")
	WebElement cntmonth;
	@FindBy(xpath="//*[@class='ui-icon ui-icon-circle-triangle-e']")
	WebElement rightbtn;
	@FindBy(xpath="//*[@class='ui-icon ui-icon-circle-triangle-w']")
	WebElement leftbtn;
	@FindBy(className="ui-datepicker-calendar")
	WebElement calender;
	public WebElement datePicker(String s) throws InterruptedException
	{
		WebElement date=null;
		String effdate=s;
		String a[]=effdate.split("/");
		String months[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
		String dd=a[0];
		String yy=a[2];
		int month=Integer.parseInt(a[1]);
		String mm=months[month-1];
		String currentyear=cntyear.getText();
		if(Integer.parseInt(currentyear) < Integer.parseInt(yy))
		{
			while (!currentyear.equals(yy))
			{
				rightbtn.click();
				currentyear=cntyear.getText();
			}
			String currentmonth=cntmonth.getText();
			while (!currentmonth.equals(mm))
			{
				rightbtn.click();
				currentmonth=cntmonth.getText();
			}
		}
		else
		{
			while (!currentyear.equals(yy))
			{
				leftbtn.click();
				currentyear=cntyear.getText();
			}
			String currentmonth=cntmonth.getText();
			while (!currentmonth.equals(mm))
			{
				leftbtn.click();
				currentmonth=cntmonth.getText();
			}
		}
		boolean flag=false;
		List<WebElement> rows=calender.findElements(By.tagName("tr"));
		for (int i = 1; i < rows.size(); i++)
		{
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < cols.size(); j++) 
			{
				if(cols.get(j).getText().equals(dd))
				{
					date=cols.get(j);
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