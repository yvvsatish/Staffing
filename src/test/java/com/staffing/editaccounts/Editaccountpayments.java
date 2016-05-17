package com.staffing.editaccounts;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.staffing.utility.DatePicker;

public class Editaccountpayments {
	@FindBy(name="emp_id")
	WebElement empname;
	@FindBy(id="paymentdate")
	WebElement paymentdate;
	@FindBy(name="payment_type_id")
	WebElement paymentid;
	@FindBy(id="amount")
	WebElement amount;
	@FindBy(id="refnum")
	WebElement refnum;
	@FindBy(id="desc")
	WebElement desc;
	@FindBy(name="submit")
	WebElement submit;
	@FindBy(xpath="//*[@id='pageload']/div/div/div[1]/div[1]")
	WebElement title;
	public String employeepayments(WebDriver driver,Row row) throws InterruptedException
	{
		try{
			empname.sendKeys(row.getCell(0).getStringCellValue());
		}catch(Exception e){
		}
		try{
			paymentdate.click();
			DatePicker dp=PageFactory.initElements(driver, DatePicker.class);
			dp.datePicker(row.getCell(1).getStringCellValue()).click();
		}catch(Exception e){
		}
		try{
			paymentid.sendKeys(row.getCell(2).getStringCellValue());
		}catch(Exception e){
		}
		try{
			amount.click();
			amount.sendKeys(Keys.CONTROL+"a");
			amount.sendKeys(Keys.DELETE);
			amount.sendKeys(row.getCell(3).getStringCellValue());
		}catch(Exception e){
		}
		try{
			refnum.clear();	
			refnum.sendKeys(row.getCell(4).getStringCellValue());
		}catch(Exception e){
		}
		try{
			desc.clear();
			desc.sendKeys(row.getCell(5).getStringCellValue());
		}catch(Exception e){
		}
		String msg=title.getText();
		try{
			submit.click();
		}catch(Exception e)
		{
		}
		return msg;
	}
}