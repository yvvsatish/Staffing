package com.staffing.employee;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.staffing.utility.DatePickerDual;

public class addemployeeeducationpage {
	@FindBy(name="hedu_id")
	WebElement highereducation;
	@FindBy(name="branch")
	WebElement branch;
	@FindBy(name="startdate")
	WebElement startdate;
	@FindBy(name="enddate")
	WebElement enddate;
	@FindBy(name="college")
	WebElement college;
	@FindBy(id="country")
	WebElement country;
	@FindBy(id="state_dropdown")
	WebElement state;
	@FindBy(name="address")
	WebElement address;
	@FindBy(name="contact")
	WebElement contact;
	@FindBy(name="website")
	WebElement website;
	@FindBy(css="input.btn.blue")
	WebElement save;
	@FindBy(xpath="//div[@id='addModal' and @aria-labelledby='myModalLabel1']")
	WebElement title;
	public String addEducationDetails(WebDriver driver,Row r) throws InterruptedException 
	{
		DatePickerDual dpd=PageFactory.initElements(driver, DatePickerDual.class);
		try{
			highereducation.sendKeys(r.getCell(0).getStringCellValue());
		}catch(Exception e){
		}
		branch.clear();
		try{
			branch.sendKeys(r.getCell(1).getStringCellValue());
		}catch(Exception e){
		}
		try{
			startdate.click();
			dpd.datePickerdual(r.getCell(2).getStringCellValue()).click();
		}catch(Exception e){
		}
		try{
			enddate.click();
			dpd.datePickerdual(r.getCell(3).getStringCellValue()).click();
		}catch(Exception e){
		}
		college.clear();
		try{
			college.sendKeys(r.getCell(4).getStringCellValue());
		}catch(Exception e){
		}
		try{
			country.sendKeys(r.getCell(5).getStringCellValue());
			Thread.sleep(2000);
		}catch(Exception e){
		}
		state.click();
		Thread.sleep(2000);
		try{
			state.sendKeys(r.getCell(6).getStringCellValue());
		}catch(Exception e){
		}
		address.clear();
		try{
			address.sendKeys(r.getCell(7).getStringCellValue());
		}catch(Exception e){
		}
		contact.click();
		contact.sendKeys(Keys.CONTROL+"a");
		contact.sendKeys(Keys.DELETE);
		try{
			contact.sendKeys(r.getCell(8).getStringCellValue());
		}catch(Exception e){
		}
		website.clear();
		try{
			website.sendKeys(r.getCell(9).getStringCellValue());
		}catch(Exception e){
		}
		String msg=title.getAttribute("style");
		try {
			save.click();
		} catch (Exception e) {
		}
		return msg;
	}
}