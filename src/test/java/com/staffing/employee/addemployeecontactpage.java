package com.staffing.employee;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

public class addemployeecontactpage {
	FirefoxDriver driver;
	@FindBy(xpath="//*[@id='add_contacts']/div/div/div[1]/div[3]/input")
	WebElement name;
	@FindBy(xpath="//*[@id='add_contacts']/div/div/div[2]/div[1]/input")
	WebElement email;
	@FindBy(xpath="//*[@id='add_contacts']/div/div/div[1]/div[4]/select")
	WebElement phonetype;
	@FindBy(xpath="//*[@id='add_contacts']/div/div/div[2]/div[2]/input")
	WebElement workemail;
	@FindBy(id="add_phone")
	WebElement phonenum;
	@FindBy(id="add_enumber")
	WebElement emergencynum;
	@FindBy(xpath="//*[@id='addModal']/div/div/div[2]/div/div/div[2]/input[1]")
	WebElement save;
	@FindBy(xpath="//div[@id='addModal' and @aria-labelledby='myModalLabel1' and @role='dialog' and @tabindex='-1']")
	WebElement titlemsg;
	public String AddEmployeeContactdetails(Row r) throws InterruptedException 
	{
		if(r.getCell(0).getCellType()!= Cell.CELL_TYPE_BLANK ){
			name.clear();
			name.sendKeys(r.getCell(0).getStringCellValue());
		}
		if(r.getCell(1).getCellType()!= Cell.CELL_TYPE_BLANK ){
			email.clear();
			email.sendKeys(r.getCell(1).getStringCellValue());
		}
		if(r.getCell(2).getCellType()!= Cell.CELL_TYPE_BLANK ){
			phonetype.sendKeys(r.getCell(2).getStringCellValue());
		}
		if(r.getCell(3).getCellType()!= Cell.CELL_TYPE_BLANK ){
			workemail.clear();
			workemail.sendKeys(r.getCell(3).getStringCellValue());
		}
		if(r.getCell(4).getCellType()!= Cell.CELL_TYPE_BLANK ){
			phonenum.click();
			phonenum.sendKeys(Keys.CONTROL+"a");
			phonenum.sendKeys(Keys.DELETE);
			phonenum.sendKeys(r.getCell(4).getStringCellValue());
		}
		if(r.getCell(5).getCellType()!= Cell.CELL_TYPE_BLANK ){
			emergencynum.click();
			emergencynum.sendKeys(Keys.CONTROL+"a");
			emergencynum.sendKeys(Keys.DELETE);
			emergencynum.sendKeys(r.getCell(5).getStringCellValue());
		}
		Thread.sleep(1000);
		String msg=titlemsg.getAttribute("style");
		try{
			save.click();
		}catch(Exception e)
		{
		}
		return msg;
	}
}