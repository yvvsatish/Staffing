package com.staffing.editemployee;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.staffing.utility.DatePicker;

public class Editemployeejobdetailspage {
	@FindBy(xpath="//*[@class='modal fade in']//*[@name='project_id']")
	WebElement projectid;
	@FindBy(xpath="//*[@class='modal fade in']//*[@name='edate']")
	WebElement sdate;
	@FindBy(xpath="//*[@class='modal fade in']//*[@name='eedate']")
	WebElement edate;
	@FindBy(xpath="//*[@class='modal fade in']//*[@name='job_type_id']")
	WebElement jobid;
	@FindBy(xpath="//*[@class='modal fade in']//*[@name='client_id']")
	WebElement clientid;
	@FindBy(xpath="//*[@class='modal fade in']//*[@name='client_address']")
	WebElement address;
	@FindBy(xpath="//*[@class='modal fade in']//*[@name='location_id']")
	WebElement locationid;
	@FindBy(xpath="//*[@class='modal fade in']//*[@name='designation']")
	WebElement designation;
	@FindBy(xpath="//*[@class='modal fade in']//*[@name='report']")
	WebElement report;
	@FindBy(xpath="//*[@class='modal fade in']//*[@name='frequency']")
	WebElement frequency;
	@FindBy(xpath="//*[@class='modal fade in']//*[@name='pvendor']")
	WebElement pvendor;
	@FindBy(xpath="//*[@class='modal fade in']//*[@name='compensation']")
	WebElement compansation;
	@FindBy(xpath="//*[@class='modal fade in']//*[@name='svendor']")
	WebElement svendor;
	@FindBy(xpath="//*[@class='modal fade in']//*[@name='rate']")
	WebElement rate;
	@FindBy(xpath="//*[@class='modal fade in']")
	WebElement title;
	public String editEmployeeEmergencyContactDetails(WebDriver driver,Row r) throws InterruptedException 
	{
		try{
			projectid.sendKeys(r.getCell(0).getStringCellValue());
		}catch(Exception e){
		}
		sdate.click();
		DatePicker dp=PageFactory.initElements(driver, DatePicker.class);
		try{
			dp.datePicker(r.getCell(1).getStringCellValue()).click();
		}catch(Exception e){
		}
		edate.click();
		try{
			dp.datePicker(r.getCell(2).getStringCellValue()).click();
		}catch(Exception e){
		}
		try{
			jobid.sendKeys(r.getCell(3).getStringCellValue());
		}catch(Exception e){
		}
		try{
			clientid.sendKeys(r.getCell(4).getStringCellValue());
		}catch(Exception e){
		}
		address.clear();
		try{
			address.sendKeys(r.getCell(5).getStringCellValue());
		}catch(Exception e){
		}
		try{
			locationid.sendKeys(r.getCell(6).getStringCellValue());
		}catch(Exception e){
		}
		try{
			designation.clear();
			designation.sendKeys(r.getCell(7).getStringCellValue());
		}catch(Exception e){
		}
		report.clear();
		try{
			report.sendKeys(r.getCell(8).getStringCellValue());
		}catch(Exception e){
		}
		try{
			frequency.sendKeys(r.getCell(9).getStringCellValue());
		}catch(Exception e){
		}
		try{
			pvendor.sendKeys(r.getCell(10).getStringCellValue());
		}catch(Exception e){
		}
		compansation.clear();
		try{
			compansation.sendKeys(r.getCell(11).getStringCellValue());
		}catch(Exception e){
		}
		try{
			svendor.sendKeys(r.getCell(12).getStringCellValue());
		}catch(Exception e){
		}
		rate.click();
		rate.sendKeys(Keys.CONTROL+"a");
		rate.sendKeys(Keys.DELETE);
		try{
			rate.sendKeys(r.getCell(13).getStringCellValue());
		}catch(Exception e){
		}
		String msg=title.getAttribute("style");
		return msg;
	}
}