package com.staffing.editemployee;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.staffing.utility.DatePicker;

public class Editemployeedocumentpage {
	@FindBy(xpath="//*[@class='modal fade in' and @aria-labelledby='imgModalLabel1']//*[@name='doctype']")
	WebElement doctype;
	@FindBy(xpath="//*[@class='modal fade in' and @aria-labelledby='imgModalLabel1']//*[@name='docExpireDate']")
	WebElement docexpdate;
	@FindBy(xpath="//*[@class='modal fade in' and @aria-labelledby='imgModalLabel1']//*[@name='description']")
	WebElement description;
	@FindBy(xpath="//*[@class='modal fade in' and @aria-labelledby='imgModalLabel1']//*[@name='docfile']")
	WebElement docfile;
	@FindBy(xpath="//*[@class='modal fade in' and @aria-labelledby='imgModalLabel1']")
	WebElement title;
	@Test
	public String editDocumentDetails(WebDriver driver,Row r) throws InterruptedException, IOException{
		try{
			doctype.sendKeys(r.getCell(0).getStringCellValue());
		}catch(Exception e){
		}
		docexpdate.click();
		DatePicker dt=PageFactory.initElements(driver, DatePicker.class);
		try{
			dt.datePicker(r.getCell(1).getStringCellValue()).click();
		}catch(Exception e){
		}
		description.clear();
		try{
			description.sendKeys(r.getCell(2).getStringCellValue());
		}catch(Exception e){
		}
		docfile.click();
		Thread.sleep(2000);
		java.lang.Runtime.getRuntime().exec("D:\\docupload.exe");
		Thread.sleep(2000);
		String msgtitle=title.getCssValue("style");
		return msgtitle;
	}
}