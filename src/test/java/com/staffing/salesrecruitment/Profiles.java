package com.staffing.salesrecruitment;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.staffing.utility.DatePicker;

public class Profiles {
	@FindBy(id="pname")
	WebElement name;
	@FindBy(id="phone")
	WebElement phone;
	@FindBy(id="pemail")
	WebElement email;
	@FindBy(id="topdate")
	WebElement date;
	@FindBy(id="peducation")
	WebElement education;
	@FindBy(id="pskill")
	WebElement skill;
	@FindBy(id="paction")
	WebElement followupdate;
	@FindBy(id="pstatus")
	WebElement status;
	@FindBy(id="preason")
	WebElement reason;
	@FindBy(id="pexp")
	WebElement experience;
	@FindBy(id="plocation")
	WebElement location;
	@FindBy(id="prate")
	WebElement rate;
	@FindBy(id="psocial")
	WebElement socialid;
	@FindBy(id="ptype")
	WebElement emptype;
	@FindBy(id="presume")
	WebElement attachment;
	@FindBy(id="pr1name")
	WebElement preferencename;
	@FindBy(xpath="//div[@id='addModal' and @aria-labelledby='myModalLabel1' and @role='dialog' and @tabindex='-1']")
	WebElement title;
	@FindBy(css="input.btn.blue")
	WebElement save;
	public String profile(WebDriver driver,Row r) throws InterruptedException, IOException
	{
		DatePicker dp=PageFactory.initElements(driver, DatePicker.class);
		if(r.getCell(0).getCellType()!= Cell.CELL_TYPE_BLANK ){
			name.sendKeys(r.getCell(0).getStringCellValue());
		}
		if(r.getCell(1).getCellType()!= Cell.CELL_TYPE_BLANK ){
			phone.click();
			phone.sendKeys(Keys.CONTROL+"a");
			phone.sendKeys(Keys.DELETE);
			phone.sendKeys(r.getCell(1).getStringCellValue());
		}
		if(r.getCell(2).getCellType()!= Cell.CELL_TYPE_BLANK ){
			email.clear();	
			email.sendKeys(r.getCell(2).getStringCellValue());
		}
		if(r.getCell(3).getCellType()!= Cell.CELL_TYPE_BLANK ){
			date.click();
			dp.datePicker(r.getCell(3).getStringCellValue()).click();
		}
		if(r.getCell(4).getCellType()!= Cell.CELL_TYPE_BLANK ){
			education.clear();
			education.sendKeys(r.getCell(4).getStringCellValue());
		}
		if(r.getCell(5).getCellType()!= Cell.CELL_TYPE_BLANK ){
			skill.clear();
			skill.sendKeys(r.getCell(5).getStringCellValue());
		}
		if(r.getCell(6).getCellType()!= Cell.CELL_TYPE_BLANK ){
			followupdate.click();
			dp.datePicker(r.getCell(6).getStringCellValue()).click();
		}
		if(r.getCell(7).getCellType()!= Cell.CELL_TYPE_BLANK ){
			status.clear();
			status.sendKeys(r.getCell(7).getStringCellValue());
		}
		if(r.getCell(8).getCellType()!= Cell.CELL_TYPE_BLANK ){
			reason.clear();
			reason.sendKeys(r.getCell(8).getStringCellValue());
		}
		if(r.getCell(9).getCellType()!= Cell.CELL_TYPE_BLANK ){
			experience.sendKeys(r.getCell(9).getStringCellValue());
		}
		if(r.getCell(10).getCellType()!= Cell.CELL_TYPE_BLANK ){
			location.clear();
			location.sendKeys(r.getCell(10).getStringCellValue());
		}
		if(r.getCell(11).getCellType()!= Cell.CELL_TYPE_BLANK ){
			rate.clear();
			rate.sendKeys(r.getCell(11).getStringCellValue());
		}
		if(r.getCell(12).getCellType()!= Cell.CELL_TYPE_BLANK ){
			socialid.clear();
			socialid.sendKeys(r.getCell(12).getStringCellValue());
		}
		if(r.getCell(13).getCellType()!= Cell.CELL_TYPE_BLANK ){
			emptype.sendKeys(r.getCell(13).getStringCellValue());
		}
		attachment.click();
		java.lang.Runtime.getRuntime().exec("D:\\docupload.exe");
		Thread.sleep(1000);
		if(r.getCell(14).getCellType()!= Cell.CELL_TYPE_BLANK ){
			preferencename.clear();
			preferencename.sendKeys(r.getCell(14).getStringCellValue());
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