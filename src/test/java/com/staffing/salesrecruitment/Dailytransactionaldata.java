package com.staffing.salesrecruitment;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.staffing.utility.DatePicker;

public class Dailytransactionaldata {
	@FindBy(id="psdate")
	WebElement date;
	@FindBy(id="location")
	WebElement location;
	@FindBy(id="cname")
	WebElement consultname;
	@FindBy(id="vname")
	WebElement vendorname;
	@FindBy(id="skills")
	WebElement skills;
	@FindBy(id="cemail")
	WebElement consultemail;
	@FindBy(id="email")
	WebElement vendormail;
	@FindBy(id="rate")
	WebElement rate;
	@FindBy(id="fstatus")
	WebElement followupstatus;
	@FindBy(id="phone")
	WebElement phone;
	@FindBy(id="submitted")
	WebElement submittedby;
	@FindBy(id="vcompany")
	WebElement vendorcompany;
	@FindBy(id="maxlength_textarea")
	WebElement desc;
	@FindBy(id="fdate")
	WebElement followupdate;
	@FindBy(xpath="//div[@id='addModal' and @aria-labelledby='myModalLabel1' and @role='dialog' and @tabindex='-1']")
	WebElement titlemsg;
	@FindBy(css="input.btn.blue")
	WebElement save;
	public String dailyTransactions(WebDriver driver,Row r) throws InterruptedException {
		DatePicker dp=PageFactory.initElements(driver, DatePicker.class);
		try{
			date.click();
			dp.datePicker(r.getCell(0).getStringCellValue()).click();
		}catch(Exception e){
		}
		try{
			location.clear();
			location.sendKeys(r.getCell(1).getStringCellValue());
		}catch(Exception e){
		}
		try{
			consultname.clear();
			consultname.sendKeys(r.getCell(2).getStringCellValue());
		}catch(Exception e){
		}
		try{
			vendorname.clear();
			vendorname.sendKeys(r.getCell(3).getStringCellValue());
		}catch(Exception e){
		}
		try{
			skills.clear();
			skills.sendKeys(r.getCell(4).getStringCellValue());
		}catch(Exception e){
		}
		try{
			consultemail.clear();
			consultemail.sendKeys(r.getCell(5).getStringCellValue());
		}catch(Exception e){
		}
		try{
			vendormail.clear();
			vendormail.sendKeys(r.getCell(6).getStringCellValue());
		}catch(Exception e){
		}
		try{
			rate.clear();
			rate.sendKeys(r.getCell(7).getStringCellValue());
		}catch(Exception e){
		}
		try{
			followupstatus.sendKeys(r.getCell(8).getStringCellValue());
		}catch(Exception e){
		}
		try{
			phone.click();
			phone.sendKeys(Keys.CONTROL+"a");
			phone.sendKeys(Keys.DELETE);
			phone.sendKeys(r.getCell(9).getStringCellValue());
		}catch(Exception e){
		}
		try{
			submittedby.sendKeys(r.getCell(10).getStringCellValue());
		}catch(Exception e){
		}
		try{
			vendorcompany.sendKeys(r.getCell(11).getStringCellValue());
		}catch(Exception e){
		}
		try{
			desc.sendKeys(r.getCell(12).getStringCellValue());
		}catch(Exception e){
		}
		try{
			followupdate.click();
			dp.datePicker(r.getCell(13).getStringCellValue()).click();
		}catch(Exception e){
		}
		String msg=titlemsg.getAttribute("style");
		try{
			save.click();
		}catch(Exception e){
		}
		return msg;
	}
}