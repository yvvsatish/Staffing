package com.staffing.editemployee;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.staffing.utility.DatePicker;

public class Editemployeeeducationpage {
	@FindBy(name="hedu_id")
	WebElement eduid;
	@FindBy(name="branch")
	WebElement branch;
	@FindBy(name="startdate")
	WebElement startdate;
	@FindBy(name="eenddate")
	WebElement enddate;
	@FindBy(name="college")
	WebElement college;
	@FindBy(name="country")
	WebElement country;
	@FindBy(id="state_dropdown")
	WebElement state;
	@FindBy(name="address")
	WebElement address;
	@FindBy(name="contact")
	WebElement contact;
	@FindBy(name="website")
	WebElement website;
	@FindBy(xpath="//*[@id='pageload']/div/div/div[1]/div[1]")
	WebElement title;
	@FindBy(css="input.btn.blue")
	WebElement save;
	@Test
	public String editEducationPage(WebDriver driver,Row r) throws InterruptedException {
		try{
			eduid.sendKeys(r.getCell(0).getStringCellValue());
		}catch(Exception e){
		}
		branch.clear();
		try{
			branch.sendKeys(r.getCell(1).getStringCellValue());
		}catch(Exception e){
		}
		DatePicker dp=PageFactory.initElements(driver, DatePicker.class);
		startdate.click();
		try{
			dp.datePicker(r.getCell(2).getStringCellValue()).click();
		}catch(Exception e){
		}
		enddate.click();
		try{
			dp.datePicker(r.getCell(3).getStringCellValue()).click();
		}catch(Exception e){
		}
		college.clear();
		try{
			college.sendKeys(r.getCell(4).getStringCellValue());
		}catch(Exception e){
		}
		try{
			country.sendKeys(r.getCell(5).getStringCellValue());
		}catch(Exception e){
		}
		Thread.sleep(2000);
		try{
			state.sendKeys(r.getCell(6).getStringCellValue());
		}catch(Exception e){
		}
		Thread.sleep(2000);
		address.clear();
		try{
			address.sendKeys(r.getCell(7).getStringCellValue());

		}catch(Exception e){
		}
		contact.clear();
		try{
			contact.sendKeys(r.getCell(8).getStringCellValue());
		}catch(Exception e){
		}
		website.clear();
		try{
			website.sendKeys(r.getCell(9).getStringCellValue());
		}catch(Exception e){
		}
		String msgtitle=title.getText();
		try{
			save.click(); 
		}catch(Exception e){
		}
		return msgtitle;
	}
}
