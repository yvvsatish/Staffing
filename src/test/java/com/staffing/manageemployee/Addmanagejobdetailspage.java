package com.staffing.manageemployee;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.staffing.utility.DatePicker;

public class Addmanagejobdetailspage
{
	FirefoxDriver driver;
	@FindBy(name="project_id")
	WebElement projectid;
	@FindBy(name="edate")
	WebElement date;
	@FindBy(name="job_type_id")
	WebElement jobtype;
	@FindBy(name="client_id")
	WebElement clientid;
	@FindBy(name="client_address")
	WebElement address;
	@FindBy(name="location_id")
	WebElement locationcode;
	@FindBy(name="designation")
	WebElement designation;
	@FindBy(name="report")
	WebElement report;
	@FindBy(name="frequency")
	WebElement frequency;
	@FindBy(name="pvendor")
	WebElement pvendor;
	@FindBy(name="svendor")
	WebElement svendor;
	@FindBy(name="compensation")
	WebElement compensation;
	@FindBy(name="rate")
	WebElement rate;
	@FindBy(css="input.btn.blue")
	WebElement save;
	@FindBy(xpath="//div[@id='addModal' and @aria-labelledby='myModalLabel1']")
	WebElement title;
	@Test
	public String enterjobdetails(WebDriver driver,Row r) throws InterruptedException {
		try{
			projectid.sendKeys(r.getCell(0).getStringCellValue());
		}catch(Exception e){
		}
		date.click();
		DatePicker dp=PageFactory.initElements(driver, DatePicker.class);
		try{
			dp.datePicker(r.getCell(1).getStringCellValue()).click();
		}catch(Exception e){
		}
		try{
			jobtype.sendKeys(r.getCell(2).getStringCellValue());
		}catch(Exception e){
		}
		try{
			clientid.sendKeys(r.getCell(3).getStringCellValue());
		}catch(Exception e){
		}
		address.clear();
		try{
			address.sendKeys(r.getCell(4).getStringCellValue());
		}catch(Exception e){
		}
		try{
			locationcode.sendKeys(r.getCell(5).getStringCellValue());
		}catch(Exception e){
		}
		designation.clear();
		try{
			designation.sendKeys(r.getCell(6).getStringCellValue());
		}catch(Exception e){
		}
		report.clear();
		try{
			report.sendKeys(r.getCell(7).getStringCellValue());
		}catch(Exception e){
		}
		try{
			frequency.sendKeys(r.getCell(8).getStringCellValue());
		}catch(Exception e){
		}
		try{
			pvendor.sendKeys(r.getCell(9).getStringCellValue());
		}catch(Exception e){
		}
		compensation.clear();
		try{
			compensation.sendKeys(r.getCell(10).getStringCellValue());
		}catch(Exception e){
		}
		try{
			svendor.sendKeys(r.getCell(11).getStringCellValue());
		}catch(Exception e){
		}
		rate.clear();
		try{
			rate.sendKeys(r.getCell(12).getStringCellValue());
		}catch(Exception e){
		}
		String msgtitle=title.getAttribute("style");
		try {
			save.click();
		}catch(Exception e){
		}
		return msgtitle;
	}
}
