package com.staffing.utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DatePickerDual {
	@FindBy(className="ui-datepicker-year")
	WebElement cntyear;
	@FindBy(className="ui-datepicker-month")
	WebElement cntmonth;
	@FindBy(xpath="//*[@class='ui-icon ui-icon-circle-triangle-e']")
	WebElement fwdbtn;
	@FindBy(xpath="//*[@class='ui-icon ui-icon-circle-triangle-w']")
	WebElement bwdbtn;
	@FindBy(xpath="//*[@class='ui-datepicker-group ui-datepicker-group-first']")
	WebElement firstgroup;
	public WebElement datePickerdual(String s) throws InterruptedException 
	{
		WebElement date=null;	
		int cntmnno=0;
		String effdate=s;
		String a[]=effdate.split("/");
		String months[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
		String dd=a[0];
		String mm=a[1];
		String yy=a[2];
		int monthno=Integer.parseInt(mm);
		String currentmonth=cntmonth.getText();
		String currentyear=cntyear.getText();
		if(Integer.parseInt(currentyear) == Integer.parseInt(yy))
		{
			for (int k = 0; k < months.length; k++) 
			{
				if(currentmonth.equals(months[k]))
				{
					cntmnno=k+1;
				}
			}
			if(cntmnno==monthno)
			{

			}
			else if(cntmnno > monthno)
			{
				while (cntmnno!=monthno)
				{
					bwdbtn.click();
					currentmonth=cntmonth.getText();
					for (int k = 0; k < months.length; k++) 
					{
						if(currentmonth.equals(months[k]))
						{
							cntmnno=k+1;
						}
					}
				}
			}
			else
			{
				while (cntmnno!=monthno)
				{
					fwdbtn.click();
					currentmonth=cntmonth.getText();
					for (int k = 0; k < months.length; k++) 
					{
						if(currentmonth.equals(months[k]))
						{
							cntmnno=k+1;
						}
					}
				}
			}
		}
		else if (Integer.parseInt(currentyear) < Integer.parseInt(yy))
		{
			while (!currentyear.equals(yy))
			{
				fwdbtn.click();
				currentyear=cntyear.getText();
			}
			currentmonth=cntmonth.getText();
			for (int k = 0; k < months.length; k++) 
			{
				if(currentmonth.equals(months[k]))
				{
					cntmnno=k+1;
				}
			}
			if(cntmnno==monthno)
			{

			}
			else if(cntmnno > monthno)
			{
				while (cntmnno!=monthno)
				{
					bwdbtn.click();
					currentmonth=cntmonth.getText();
					for (int k = 0; k < months.length; k++) 
					{
						if(currentmonth.equals(months[k]))
						{
							cntmnno=k+1;
						}
					}
				}
			}
			else
			{
				while (cntmnno!=monthno)
				{
					fwdbtn.click();
					currentmonth=cntmonth.getText();
					for (int k = 0; k < months.length; k++) 
					{
						if(currentmonth.equals(months[k]))
						{
							cntmnno=k+1;
						}
					}
				}
			}
		}
		else 
		{
			while (!currentyear.equals(yy))
			{
				bwdbtn.click();
				currentyear=cntyear.getText();
			}
			currentmonth=cntmonth.getText();
			for (int k = 0; k < months.length; k++) 
			{
				if(currentmonth.equals(months[k]))
				{
					cntmnno=k+1;
				}
			}
			if(cntmnno==monthno)
			{

			}
			else if(cntmnno > monthno)
			{
				while (cntmnno!=monthno)
				{
					bwdbtn.click();
					currentmonth=cntmonth.getText();
					for (int k = 0; k < months.length; k++) 
					{
						if(currentmonth.equals(months[k]))
						{
							cntmnno=k+1;
						}
					}
				}
			}
			else
			{
				while (cntmnno!=monthno)
				{
					fwdbtn.click();
					currentmonth=cntmonth.getText();
					for (int k = 0; k < months.length; k++) 
					{
						if(currentmonth.equals(months[k]))
						{
							cntmnno=k+1;
						}
					}
				}
			}
		}
		WebElement calender=firstgroup;
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
					Thread.sleep(2000);
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