package com.staffing.employee;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.staffing.utility.DatePicker;

public class addemployeedocuments {
	@FindBy(xpath="//div[@id='addModal' and @aria-labelledby='myModalLabel1']")
	WebElement title;
	@FindBy(xpath="//div[@id='addModal' and @aria-labelledby='myModalLabel1']//*[@name='doctype']")
	WebElement doctype;
	@FindBy(xpath="//div[@id='addModal' and @aria-labelledby='myModalLabel1']//*[@id='expdate']")
	WebElement expdate;
	@FindBy(xpath="//div[@id='addModal' and @aria-labelledby='myModalLabel1']//*[@id='description']")
	WebElement description;
	@FindBy(xpath="//div[@id='addModal' and @aria-labelledby='myModalLabel1']//*[@name='docfile']")
	WebElement docfile;
	@FindBy(xpath="//div[@id='addModal' and @aria-labelledby='myModalLabel1']//*[@class='btn blue']")
	WebElement save;
	public String addDocumentDetails(WebDriver driver,Row r) throws InterruptedException, IOException
	{
		try{
			doctype.sendKeys(r.getCell(0).getStringCellValue());
		}catch(Exception e){
		}
		expdate.click();
		DatePicker dt=PageFactory.initElements(driver,DatePicker.class);
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
		String msg=title.getAttribute("style");
		try{
			save.click();
		}catch(Exception e){
		}
		return msg;
	}
}