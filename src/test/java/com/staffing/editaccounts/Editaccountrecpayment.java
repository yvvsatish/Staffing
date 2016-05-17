package com.staffing.editaccounts;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.staffing.utility.DatePicker;

public class Editaccountrecpayment {
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
	@FindBy(name="submit")
	WebElement submit;
	@FindBy(xpath="//*[@id='pageload']/div/div/div[1]/div[1]")
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
		try {
			amount.click();
			amount.sendKeys(Keys.CONTROL+"a");
			amount.sendKeys(Keys.DELETE);
			amount.sendKeys(row.getCell(3).getStringCellValue());
		} catch (Exception e) {
		}
		try{
			refnum.clear();
			refnum.sendKeys(row.getCell(4).getStringCellValue());
		}catch (Exception e) {
		}
		try{
			desc.clear();
			desc.sendKeys(row.getCell(5).getStringCellValue());
		}catch(Exception e){
		}
		try{	
			invoiceid.clear();
			invoiceid.sendKeys(row.getCell(6).getStringCellValue());
		}catch(Exception e){
		}
		String msg=title.getText();
		try{
			submit.click();
		}catch(Exception e){
		}
		return msg;
	}
}