package com.staffing.manageemployee;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.staffing.utility.DatePicker;

public class Addmanageexperiencepage {
	@FindBy(name="stream_id")
	WebElement techstream;
	@FindBy(name="skill")
	WebElement skill;
	@FindBy(name="role")
	WebElement role;
	@FindBy(name="experience_years")
	WebElement expyears;
	@FindBy(name="experience_months")
	WebElement expmonths;
	@FindBy(name="employer")
	WebElement employer;
	@FindBy(id="sdate")
	WebElement sdate;
	@FindBy(id="edate")
	WebElement edate;
	@FindBy(name="endclient")
	WebElement endclient;
	@FindBy(name="line1")
	WebElement line1;
	@FindBy(name="line2")
	WebElement line2;
	@FindBy(id="country")
	WebElement country;
	@FindBy(id="state_dropdown")
	WebElement state_dropdown;
	@FindBy(name="city")
	WebElement city;
	@FindBy(name="zipcode")
	WebElement zipcode;
	@FindBy(xpath="//div[@id='addModal' and @aria-labelledby='myModalLabel1' and @role='dialog' and @tabindex='-1']")
	WebElement msg;
	@FindBy(css="input.btn.blue")
	WebElement save;
	public String employeeexperience(WebDriver driver,Row r) throws InterruptedException
	{
		try{
			techstream.sendKeys(r.getCell(0).getStringCellValue());
		}catch(Exception e){
		}
		skill.clear();
		try{
			skill.sendKeys(r.getCell(1).getStringCellValue());
		}catch(Exception e){
		}
		role.clear();
		try{
			role.sendKeys(r.getCell(2).getStringCellValue());
		}catch(Exception e){
		}
		try{
			expyears.sendKeys(r.getCell(3).getStringCellValue());
		}catch(Exception e){
		}
		try{
			expmonths.sendKeys(r.getCell(4).getStringCellValue());
		}catch(Exception e){
		}
		employer.clear();
		try{
			employer.sendKeys(r.getCell(5).getStringCellValue());
		}catch(Exception e){
		}
		DatePicker dp=PageFactory.initElements(driver, DatePicker.class);
		sdate.click();
		try{
			dp.datePicker(r.getCell(6).getStringCellValue()).click();
			Thread.sleep(1000);
		}catch(Exception e){
		}
		edate.click();
		try{
			dp.datePicker(r.getCell(7).getStringCellValue()).click();
		}catch(Exception e){
		}
		endclient.clear();
		try{
			endclient.sendKeys(r.getCell(8).getStringCellValue());
		}catch(Exception e){
		}
		line1.clear();
		try{
			line1.sendKeys(r.getCell(9).getStringCellValue());
		}catch(Exception e){
		}
		line2.clear();
		try{
			line2.sendKeys(r.getCell(10).getStringCellValue());
		}catch(Exception e){
		}
		country.click();
		try{
			Thread.sleep(1000);
			country.sendKeys(r.getCell(11).getStringCellValue());
			Thread.sleep(2000);
		}catch(Exception e){
		}
		state_dropdown.click();
		try{
			Thread.sleep(3000);
			state_dropdown.sendKeys(r.getCell(12).getStringCellValue());
		}catch(Exception e){
		}
		city.clear();
		try{
			city.sendKeys(r.getCell(13).getStringCellValue());
		}catch(Exception e){
		}
		zipcode.click();
		zipcode.sendKeys(Keys.CONTROL+"a");
		zipcode.sendKeys(Keys.DELETE);
		try{
			zipcode.sendKeys(r.getCell(14).getStringCellValue());
		}catch(Exception e){
		}
		String title=msg.getAttribute("style");
		try {
			save.click();
		} catch (Exception e) {

		}
		return title;
	}
}
