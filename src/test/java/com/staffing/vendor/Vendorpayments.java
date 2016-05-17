package com.staffing.vendor;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.staffing.utility.DatePicker;

public class Vendorpayments {
	@FindBy(name="vendor_id")
	WebElement vendor;
	@FindBy(id="paymentdate")
	WebElement paymentdate;
	@FindBy(id="paymentid")
	WebElement paymentid;
	@FindBy(id="amount")
	WebElement amount;
	@FindBy(id="refnum")
	WebElement refnum;
	@FindBy(id="details")
	WebElement desc;
	@FindBy(id="invoice_id")
	WebElement invoiceid;
	@FindBy(css="input.btn.blue")
	WebElement submit;
	@FindBy(xpath="//div[@id='addModal' and @role='dialog' and @tabindex='-1']")
	WebElement title;
	public String receivedPayments(WebDriver driver,Row row) throws InterruptedException
	{
		try{
			vendor.sendKeys(row.getCell(0).getStringCellValue());
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
			amount.sendKeys(row.getCell(3).getStringCellValue());
		}catch(Exception e){
		}
		try{
			refnum.sendKeys(row.getCell(4).getStringCellValue());
		}catch(Exception e){
		}
		try{
			desc.sendKeys(row.getCell(5).getStringCellValue());
		}catch(Exception e){
		}
		try{
			invoiceid.sendKeys(row.getCell(6).getStringCellValue());
		}catch(Exception e)
		{
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