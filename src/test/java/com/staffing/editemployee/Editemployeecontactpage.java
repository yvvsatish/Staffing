package com.staffing.editemployee;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class Editemployeecontactpage {
	@FindBy(xpath="//*[@class='modal fade in' and @aria-labelledby='myModalLabel1']//*[@name='ename']")
	WebElement name;
	@FindBy(xpath="//*[@class='modal fade in' and @aria-labelledby='myModalLabel1']//*[@name='pemail']")
	WebElement pemail;
	@FindBy(xpath="//*[@class='modal fade in' and @aria-labelledby='myModalLabel1']//*[@name='phone_type_id']")
	WebElement phoneid;
	@FindBy(xpath="//*[@class='modal fade in' and @aria-labelledby='myModalLabel1']//*[@name='workemail']")
	WebElement workemail;
	@FindBy(xpath="//*[@class='modal fade in' and @aria-labelledby='myModalLabel1']//*[@name='phone']")
	WebElement phone;
	@FindBy(xpath="//*[@class='modal fade in' and @aria-labelledby='myModalLabel1']//*[@name='enumber']")
	WebElement emergency;
	@FindBy(xpath="//*[@class='modal fade in' and @aria-labelledby='myModalLabel1']")
	WebElement title;
	@FindBy(xpath="//*[@class='modal fade in' and @aria-labelledby='myModalLabel1']//*[@class='btn blue']")
	WebElement save;
	@Test
	public String editContactDetails(Row r){
		name.clear();
		try{
			name.sendKeys(r.getCell(0).getStringCellValue());
		}catch(Exception e){
		}
		pemail.clear();
		try{
			pemail.sendKeys(r.getCell(1).getStringCellValue());
		}catch(Exception e){
		}
		try{
			phoneid.sendKeys(r.getCell(2).getStringCellValue());
		}catch(Exception e){
		}
		workemail.clear();
		try{
			workemail.sendKeys(r.getCell(3).getStringCellValue());
		}catch(Exception e){
		}
		phone.clear();
		try{
			phone.sendKeys(r.getCell(4).getStringCellValue());
		}catch(Exception e){
		}
		emergency.clear();
		try{
			emergency.sendKeys(r.getCell(5).getStringCellValue());
		}catch(Exception e){
		}
		String msgtitle=title.getAttribute("style");
		return msgtitle;
	}
}