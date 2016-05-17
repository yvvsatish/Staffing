package com.staffing.accounts;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.staffing.utility.DatePicker;

public class Employeepayments {
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
	@FindBy(css="input.btn.blue")
	WebElement submit;
	@FindBy(xpath="//div[@id='addModal' and @role='dialog' and @tabindex='-1']")
	WebElement title;
	public String employeepayments(WebDriver driver,Row row) throws InterruptedException
	{
		if(row.getCell(0).getCellType()!= Cell.CELL_TYPE_BLANK ){
			empname.sendKeys(row.getCell(0).getStringCellValue());
		}
		if(row.getCell(1).getCellType()!= Cell.CELL_TYPE_BLANK ){
			paymentdate.click();
			DatePicker dp=PageFactory.initElements(driver, DatePicker.class);
			dp.datePicker(row.getCell(1).getStringCellValue()).click();
		}
		try{
			if(row.getCell(2).getCellType()!= Cell.CELL_TYPE_BLANK ){
				paymentid.sendKeys(row.getCell(2).getStringCellValue());
			}
		}catch(Exception e)
		{
		}
		try{
			if(row.getCell(3).getCellType()!= Cell.CELL_TYPE_BLANK ){
				amount.sendKeys(row.getCell(3).getStringCellValue());
			}
		}catch(Exception e)
		{
		}
		if(row.getCell(4).getCellType()!= Cell.CELL_TYPE_BLANK ){
			refnum.clear();	
			refnum.sendKeys(row.getCell(4).getStringCellValue());
		}
		if(row.getCell(5).getCellType()!= Cell.CELL_TYPE_BLANK ){
			desc.clear();
			desc.sendKeys(row.getCell(5).getStringCellValue());
		}
		String msg=title.getAttribute("style");
		try{
			submit.click();
		}catch(Exception e)
		{
		}
		return msg;
	}
}