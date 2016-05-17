package com.staffing.editemployee;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Editemployeeemergencycontactpage{
	@FindBy(xpath="//*[@class='modal fade in']//*[@name='contact_name']")
	WebElement name;
	@FindBy(xpath="//*[@class='modal fade in']//*[@name='email']")
	WebElement email;
	@FindBy(xpath="//*[@class='modal fade in']//*[@name='home_phone']")
	WebElement homephone;
	@FindBy(xpath="//*[@class='modal fade in']//*[@name='mobile']")
	WebElement mobilenumber;
	@FindBy(xpath="//*[@class='modal fade in']//*[@name='work_phone']")
	WebElement workphone;
	@FindBy(xpath="//*[@class='modal fade in']//*[@name='relation']")
	WebElement relation;
	@FindBy(xpath="//*[@class='modal fade in']//*[@name='permanent_address']")
	WebElement address;
	@FindBy(xpath="//*[@class='modal fade in']")
	WebElement title;
	public String editEmployeeEmergencyContactDetails(Row r) 
	{
		name.clear();
		try{
			name.sendKeys(r.getCell(0).getStringCellValue());
		}catch(Exception e){
		}
		email.clear();
		try{
			email.sendKeys(r.getCell(1).getStringCellValue());
		}catch(Exception e){
		}
		homephone.click();
		homephone.sendKeys(Keys.CONTROL+"a");
		homephone.sendKeys(Keys.DELETE);
		try{
			homephone.sendKeys(r.getCell(2).getStringCellValue());
		}catch(Exception e){
		}
		mobilenumber.click();
		mobilenumber.sendKeys(Keys.CONTROL+"a");
		mobilenumber.sendKeys(Keys.DELETE);
		try{
			mobilenumber.sendKeys(r.getCell(3).getStringCellValue());
		}catch(Exception e){
		}
		workphone.click();
		workphone.sendKeys(Keys.CONTROL+"a");
		workphone.sendKeys(Keys.DELETE);
		try{
			workphone.sendKeys(r.getCell(4).getStringCellValue());
		}catch(Exception e){
		}
		relation.clear();
		try{
			relation.sendKeys(r.getCell(5).getStringCellValue());
		}catch(Exception e){
		}
		address.clear();
		try{
			address.sendKeys(r.getCell(6).getStringCellValue());
		}catch(Exception e){
		}
		String msg=title.getAttribute("style");
		return msg;
	}
}