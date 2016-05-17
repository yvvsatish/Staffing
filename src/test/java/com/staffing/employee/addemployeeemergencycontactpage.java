package com.staffing.employee;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class addemployeeemergencycontactpage{
	@FindBy(xpath="//*[@id='emg_contacts']/div[1]/div/div[1]/div[3]/input")
	WebElement name;
	@FindBy(xpath="//*[@id='emg_contacts']/div[1]/div/div[2]/div[1]/input")
	WebElement email;
	@FindBy(xpath="//*[@id='add_home_phone']")
	WebElement homephone;
	@FindBy(xpath="//*[@id='add_mobile']")
	WebElement mobilenumber;
	@FindBy(xpath="//*[@id='add_work_phone']")
	WebElement workphone;
	@FindBy(xpath="//*[@id='emg_contacts']/div[1]/div/div[2]/div[3]/input")
	WebElement relation;
	@FindBy(xpath="//*[@id='emg_contacts']/div[1]/div/div[1]/div[6]/input")
	WebElement address;
	@FindBy(xpath="//*[@id='emg_contacts']/div[2]/input[1]")
	WebElement save;
	@FindBy(xpath="//div[@id='addModal' and @aria-labelledby='myModalLabel1' and @role='dialog' and @tabindex='-1']")
	WebElement title;
	public String addEmployeeContactdetails(Row r) 
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
		try{
			save.click();
		}catch(Exception e)
		{
		}
		return msg;
	}
}