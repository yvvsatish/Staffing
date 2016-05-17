package com.staffing.manageemployee;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.staffing.utility.DatePicker;

public class Addmanagedocumentspage {
	@FindBy(xpath="//div[@class='modal fade in']")
	WebElement title;
	@FindBy(xpath="//div[@class='modal fade in']//*[@name='doctype']")
	WebElement doctype;
	@FindBy(xpath="//div[@class='modal fade in']//*[@id='docExpireDate']")
	WebElement expdate;
	@FindBy(xpath="//div[@class='modal fade in']//*[@name='description']")
	WebElement description;
	@FindBy(xpath="//div[@class='modal fade in']//*[@name='docfile']")
	WebElement docfile;
	@FindBy(xpath="//div[@class='modal fade in']//*[@class='btn blue']")
	WebElement save;
	public String addDocumentDetails(WebDriver driver,Row r) throws InterruptedException, IOException
	{
		try{
			doctype.sendKeys(r.getCell(0).getStringCellValue());
		}catch(Exception e){
		}
		DatePicker dt=PageFactory.initElements(driver,DatePicker.class);
		try{
			expdate.click();
			dt.datePicker(r.getCell(1).getStringCellValue()).click();
		}catch(Exception e){
		}
		try{
			description.clear();
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