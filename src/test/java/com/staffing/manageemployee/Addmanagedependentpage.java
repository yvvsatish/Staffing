package com.staffing.manageemployee;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.staffing.utility.DatePicker;

public class Addmanagedependentpage 
{
	WebDriver driver=null;
	@FindBy(xpath="//*[@class='modal fade in']//*[@name='dtype_id']")
	WebElement deptype;
	@FindBy(xpath="//*[@class='modal fade in']//*[@id='firstName']")
	WebElement firstname;
	@FindBy(xpath="//*[@class='modal fade in']//*[@id='middleName']")
	WebElement middlename;
	@FindBy(xpath="//*[@class='modal fade in']//*[@id='lastName']")
	WebElement lastname;
	@FindBy(xpath="//*[@class='modal fade in']//*[@id='dob']")
	WebElement dateofbirth;
	@FindBy(xpath="//*[@class='modal fade in']//*[@id='pob']")
	WebElement placeofbirth;
	@FindBy(xpath="//*[@class='modal fade in']//*[@name='gender']")
	WebElement gender;
	@FindBy(xpath="//*[@class='modal fade in']//*[@name='hedu_id']")
	WebElement higheredu;
	@FindBy(xpath="//*[@class='modal fade in']//*[@id='country']")
	WebElement country;
	@FindBy(xpath="//*[@class='modal fade in']//*[@id='state_dropdown']")
	WebElement state;
	@FindBy(xpath="//*[@class='modal fade in']//*[@class='btn blue']")
	WebElement save;
	@FindBy(xpath="//div[@class='modal fade in' and @aria-labelledby='myModalLabel1']")
	WebElement title;
	public String addDependentDetails(Row r) throws InterruptedException
	{
		try{
			deptype.sendKeys(r.getCell(0).getStringCellValue());
		}catch(Exception e){
		}
		try{
			firstname.clear();
			firstname.sendKeys(r.getCell(1).getStringCellValue());
		}catch(Exception e){
		}
		try{
			middlename.clear();
			middlename.sendKeys(r.getCell(2).getStringCellValue());
		}catch(Exception e){
		}
		try{
			lastname.clear();
			lastname.sendKeys(r.getCell(3).getStringCellValue());
		}catch(Exception e){
		}
		try{
			dateofbirth.click();
			DatePicker dt=PageFactory.initElements(driver, DatePicker.class);
			dt.datePicker(r.getCell(4).getStringCellValue()).click();
		}catch(Exception e){
		}
		try{
			placeofbirth.clear();
			placeofbirth.sendKeys(r.getCell(5).getStringCellValue());
		}catch(Exception e){
		}
		try{
			gender.sendKeys(r.getCell(6).getStringCellValue());
		}catch(Exception e){
		}
		try{
			higheredu.sendKeys(r.getCell(7).getStringCellValue());
		}catch(Exception e){
		}
		try{
			country.sendKeys(r.getCell(8).getStringCellValue());
			Thread.sleep(2000);
		}catch(Exception e){
		}
		try{
			state.click();
			Thread.sleep(2000);
			state.sendKeys(r.getCell(9).getStringCellValue());
		}catch(Exception e){
		}
		String msg=title.getAttribute("style");
		try{
			save.click();
		}catch(Exception e)
		{
		}
		return msg;
	}
}