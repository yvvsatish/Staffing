package com.staffing.employee;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.staffing.utility.DatePicker;
import com.staffing.utility.datepicker1;

public class addemployeeaddresspage
{
	WebDriver driver=null;
	@FindBy(name="addresstype")
	WebElement addresstype;
	@FindBy(name="housetype")
	WebElement housetype;
	@FindBy(id="Country")
	WebElement Country;
	@FindBy(xpath="//*[@id='state_dropdown']")
	WebElement state;
	@FindBy(id="emp_city")
	WebElement emp_city;
	@FindBy(name="postalCode")
	WebElement postalCode;
	@FindBy(id="addressLine1")
	WebElement addressLine1;
	@FindBy(id="addressLine2")
	WebElement addressLine2;
	@FindBy(id="pdate")
	WebElement pdate;
	@FindBy(name="emailID")
	WebElement emailID;
	@FindBy(name="faceBook")
	WebElement faceBook;
	@FindBy(xpath="//div[@id='addModal' and @aria-labelledby='myModalLabel1' and @role='dialog' and @tabindex='-1']")
	WebElement titlemsg;
	@FindBy(css="input.btn.blue")
	WebElement Save;
	public String addAddressDetails(WebDriver driver,Row r) throws InterruptedException
	{
		Thread.sleep(1500);
		try{
			addresstype.sendKeys(r.getCell(0).getStringCellValue());
		}catch(Exception e){
		}
		Thread.sleep(1000);
		try{
			housetype.sendKeys(r.getCell(1).getStringCellValue());
		}catch(Exception e){
		}
		Thread.sleep(1000);
		try{
			Country.sendKeys(r.getCell(2).getStringCellValue());
		}catch(Exception e){
		}
		Thread.sleep(3000);
		try{
			state.click();
			Thread.sleep(3000);
			state.sendKeys(r.getCell(3).getStringCellValue());
		}catch(Exception e){
		}
		try{
			emp_city.clear();
			emp_city.sendKeys(r.getCell(4).getStringCellValue());
		}catch(Exception e){
		}
		try{
			postalCode.click();
			postalCode.sendKeys(Keys.CONTROL+"a");
			postalCode.sendKeys(Keys.DELETE);
			postalCode.sendKeys(r.getCell(5).getStringCellValue());
		}catch(Exception e){
		}
		try{
			addressLine1.clear();
			addressLine1.sendKeys(r.getCell(6).getStringCellValue());
		}catch(Exception e){
		}
		try{
			addressLine2.clear();
			addressLine2.sendKeys(r.getCell(7).getStringCellValue());
		}catch(Exception e){
		}
		try{
			pdate.click();
			datepicker1 dt=PageFactory.initElements(driver, datepicker1.class);
			dt.Datepicker(r.getCell(8).getStringCellValue()).click();
		}catch(Exception e){
		}
		try{
			emailID.clear();
			emailID.sendKeys(r.getCell(9).getStringCellValue());
		}catch(Exception e){
		}
		try{
			faceBook.clear();
			faceBook.sendKeys(r.getCell(10).getStringCellValue());
		}catch(Exception e){
		}
		String msg=titlemsg.getAttribute("style");
		try{
			Save.click();
		}catch(Exception e){
		}
		return msg;
	}
}	