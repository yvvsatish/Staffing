package com.staffing.editmanageemployee;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.staffing.utility.DatePicker;

public class Editmanagedependentpage 
{
	WebDriver driver=null;
	@FindBy(name="dtype_id")
	WebElement deptype;
	@FindBy(id="firstName")
	WebElement firstname;
	@FindBy(id="middleName")
	WebElement middlename;
	@FindBy(id="lastName")
	WebElement lastname;
	@FindBy(name="dob")
	WebElement dateofbirth;
	@FindBy(id="Country")
	WebElement placeofbirth;
	@FindBy(name="gender")
	WebElement gender;
	@FindBy(name="hedu_id")
	WebElement higheredu;
	@FindBy(id="country")
	WebElement country;
	@FindBy(id="state_dropdown")
	WebElement state;
	@FindBy(css="button.btn.blue")
	WebElement save;
	@FindBy(xpath="//*[@id='btnload']/div/div/div[1]/div[1]")
	WebElement title;
	public String editDependentDetails(Row r) throws InterruptedException
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
		String msg=title.getText();
		try{
			save.click();
		}catch(Exception e)
		{
		}
		return msg;
	}
}