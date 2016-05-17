package com.staffing.editemployee;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.staffing.utility.DatePicker;
import com.staffing.utility.datepicker1;

public class Editemployeeaddresspage {
	@FindBy(name="addresstype")
	WebElement addresstype;
	@FindBy(name="housetype")
	WebElement housetype;
	@FindBy(name="Country")
	WebElement Country;
	@FindBy(xpath="//*[@id='state_dropdown']")
	WebElement state;
	@FindBy(id="emp_city")
	WebElement empcity;
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
	@FindBy(xpath="//*[@id='pageload']/div/div/div[1]/div[1]")
	WebElement title;
	@Test
	public String editAddressDetails(WebDriver driver,Row r) throws InterruptedException{
		try{
			addresstype.sendKeys(r.getCell(0).getStringCellValue());
		}catch(Exception e){
		}
		try{
			housetype.sendKeys(r.getCell(1).getStringCellValue());
		}catch(Exception e){
		}
		try{
			Country.sendKeys(r.getCell(2).getStringCellValue());
		}catch(Exception e){
		}
		Thread.sleep(3000);
		state.click();
		Thread.sleep(3000);
		try{
			state.sendKeys(r.getCell(3).getStringCellValue());
		}catch(Exception e){
		}
		Thread.sleep(2000);
		empcity.clear();
		try{
			empcity.sendKeys(r.getCell(4).getStringCellValue());
		}catch(Exception e){
		}
		postalCode.click();
		postalCode.sendKeys(Keys.CONTROL+"a");
		postalCode.sendKeys(Keys.DELETE);
		try{
			postalCode.sendKeys(r.getCell(5).getStringCellValue());
		}catch(Exception e){
		}
		addressLine1.clear();
		try{
			addressLine1.sendKeys(r.getCell(6).getStringCellValue());
		}catch(Exception e){
		}
		addressLine2.clear();
		try{
			addressLine2.sendKeys(r.getCell(7).getStringCellValue());
		}catch(Exception e){
		}
		pdate.click();
		datepicker1 dt=PageFactory.initElements(driver, datepicker1.class);
		try{
			dt.Datepicker(r.getCell(8).getStringCellValue()).click();
		}catch(Exception e){
		}
		emailID.clear();
		try{
			emailID.sendKeys(r.getCell(9).getStringCellValue());
		}catch(Exception e){
		}
		faceBook.clear();
		try{
			faceBook.sendKeys(r.getCell(10).getStringCellValue());
		}catch(Exception e){
		}
		String msgtitle=title.getText();
		return msgtitle;
	}
}
