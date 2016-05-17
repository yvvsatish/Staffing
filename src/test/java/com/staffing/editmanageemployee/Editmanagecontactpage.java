package com.staffing.editmanageemployee;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Editmanagecontactpage
{
	@FindBy(xpath="//*[@class='modal fade in']//*[@name='ename']")
	WebElement name;
	@FindBy(xpath="//*[@class='modal fade in']//*[@name='pemail']")
	WebElement email;
	@FindBy(xpath="//*[@class='modal fade in']//*[@name='phone_type_id']")
	WebElement phonetype;
	@FindBy(xpath="//*[@class='modal fade in']//*[@name='workemail']")
	WebElement workemail;
	@FindBy(xpath="//*[@class='modal fade in']//*[@name='phone']")
	WebElement phonenum;
	@FindBy(xpath="//*[@class='modal fade in']//*[@name='enumber']")
	WebElement emergencynum;
	@FindBy(xpath="//*[@class='modal fade in']//*[@name='submit']")
	WebElement save;
	@FindBy(xpath="//div[@class='modal fade in']")
	WebElement titlemsg;
	public String AddManageContactdetails(Row r) throws InterruptedException 
	{
		try{
			name.clear();
			name.sendKeys(r.getCell(0).getStringCellValue());
		}catch(Exception e){
		}
		try{
			email.clear();
			email.sendKeys(r.getCell(1).getStringCellValue());
		}catch(Exception e){
		}
		try{
			phonetype.sendKeys(r.getCell(2).getStringCellValue());
		}catch(Exception e){
		}
		try{
			workemail.clear();
			workemail.sendKeys(r.getCell(3).getStringCellValue());
		}catch(Exception e){
		}
		try{
			phonenum.click();
			phonenum.sendKeys(Keys.CONTROL+"a");
			phonenum.sendKeys(Keys.DELETE);
			phonenum.sendKeys(r.getCell(4).getStringCellValue());
		}catch(Exception e){
		}
		try{
			emergencynum.click();
			emergencynum.sendKeys(Keys.CONTROL+"a");
			emergencynum.sendKeys(Keys.DELETE);
			emergencynum.sendKeys(r.getCell(5).getStringCellValue());
		}catch(Exception e){
		}
		Thread.sleep(1000);
		String msg=titlemsg.getAttribute("aria-hidden");
		try{
			save.click();
		}catch(Exception e)
		{
		}
		return msg;
	}
}