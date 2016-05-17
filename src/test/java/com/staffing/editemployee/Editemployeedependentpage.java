package com.staffing.editemployee;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.staffing.utility.DatePicker;

public class Editemployeedependentpage {
	@FindBy(name="dtype_id")
	WebElement deptype;
	@FindBy(id="firstName")
	WebElement firstName;
	@FindBy(id="middleName")
	WebElement middleName;
	@FindBy(id="lastName")
	WebElement lastName;
	@FindBy(name="gender")
	WebElement gender;
	@FindBy(id="dob")
	WebElement dob;
	@FindBy(name="pob")
	WebElement pob;
	@FindBy(name="hedu_id")
	WebElement heduid;
	@FindBy(name="country")
	WebElement country;
	@FindBy(id="state_dropdown")
	WebElement state;
	@FindBy(xpath="//*[@id='pageload']/div/div/div[1]/div[1]")
	WebElement title;
	@FindBy(css="input.btn.blue")
	WebElement save;
	@Test
	public String editDependent(WebDriver driver,Row r) throws InterruptedException {
		try{
			deptype.sendKeys(r.getCell(0).getStringCellValue());
		}catch(Exception e){
		}
		try{
			firstName.clear();
			firstName.sendKeys(r.getCell(1).getStringCellValue());
		}catch(Exception e){
		}
		try{
			middleName.clear();
			middleName.sendKeys(r.getCell(2).getStringCellValue());
		}catch(Exception e){
		}
		try{
			lastName.clear();
			lastName.sendKeys(r.getCell(3).getStringCellValue());
		}catch(Exception e){
		}
		try{
			gender.sendKeys(r.getCell(4).getStringCellValue());
		}catch(Exception e){
		}
		DatePicker dt=PageFactory.initElements(driver, DatePicker.class);
		try{
			dob.click();
			dt.datePicker(r.getCell(5).getStringCellValue()).click();
		}catch(Exception e){
		}
		try{
			pob.clear();
			pob.sendKeys(r.getCell(6).getStringCellValue());
		}catch(Exception e){
		}
		try{
			heduid.sendKeys(r.getCell(7).getStringCellValue());

		}catch(Exception e){
		}
		try{
			country.sendKeys(r.getCell(8).getStringCellValue());
		}catch(Exception e){
		}
		Thread.sleep(2000);
		try{	
			state.click();
			Thread.sleep(2000);	

			state.sendKeys(r.getCell(9).getStringCellValue());
		}catch(Exception e){
		}
		String msgtitle=title.getText();
		save.click();
		return msgtitle;
	}
}