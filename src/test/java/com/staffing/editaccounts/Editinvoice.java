package com.staffing.editaccounts;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.staffing.utility.DatePicker;

public class Editinvoice {
	@FindBy(id="invoicedate")
	WebElement invoicedate;
	@FindBy(id="slt")
	WebElement vendorid;
	@FindBy(id="terms")
	WebElement terms;
	@FindBy(id="service1")
	WebElement service1;
	@FindBy(id="service2")
	WebElement service2;
	@FindBy(id="service3")
	WebElement service3;
	@FindBy(id="service4")
	WebElement service4;
	@FindBy(id="service5")
	WebElement service5;
	@FindBy(name="desc1")
	WebElement desc1;
	@FindBy(name="desc2")
	WebElement desc2;
	@FindBy(name="desc3")
	WebElement desc3;
	@FindBy(name="desc4")
	WebElement desc4;
	@FindBy(name="desc5")
	WebElement desc5;
	@FindBy(id="quantity1")
	WebElement quantity1;
	@FindBy(id="quantity2")
	WebElement quantity2;
	@FindBy(id="quantity3")
	WebElement quantity3;
	@FindBy(id="quantity4")
	WebElement quantity4;
	@FindBy(id="quantity5")
	WebElement quantity5;
	@FindBy(id="price1")
	WebElement price1;
	@FindBy(id="price2")
	WebElement price2;
	@FindBy(id="price3")
	WebElement price3;
	@FindBy(id="price4")
	WebElement price4;
	@FindBy(id="price5")
	WebElement price5;
	@FindBy(name="attachment")
	WebElement attachment;
	@FindBy(name="message")
	WebElement message;
	@FindBy(css="input.btn.green")
	WebElement submit;
	@FindBy(xpath="//*[@id='pageload']/div/div/div[1]/div[1]")
	WebElement title;
	public String editinvoice(WebDriver driver,Row row) throws InterruptedException, IOException
	{
		try{
			invoicedate.click();
			DatePicker dp=PageFactory.initElements(driver, DatePicker.class);
			dp.datePicker(row.getCell(0).getStringCellValue()).click();
		}catch(Exception e){
		}
		try{
			vendorid.sendKeys(row.getCell(1).getStringCellValue());
		}catch(Exception e){
		}
		try{
			terms.sendKeys(row.getCell(2).getStringCellValue());
		}catch(Exception e){
		}
		try{
			service1.sendKeys(row.getCell(3).getStringCellValue());
		}catch(Exception e){
		}
		try{
			desc1.clear();
			desc1.sendKeys(row.getCell(4).getStringCellValue());
		}catch(Exception e){
		}
		try{
			quantity1.clear();
			quantity1.sendKeys(row.getCell(5).getStringCellValue());
		}catch(Exception e){
		}
		try{
			price1.clear();
			price1.sendKeys(row.getCell(6).getStringCellValue());
		}catch(Exception e){
		}
		try{
			service2.sendKeys(row.getCell(7).getStringCellValue());
		}catch(Exception e){
		}
		try{
			desc2.clear();
			desc2.sendKeys(row.getCell(8).getStringCellValue());
		}catch(Exception e){
		}
		try{
			quantity2.clear();
			quantity2.sendKeys(row.getCell(9).getStringCellValue());
		}catch(Exception e){
		}
		try{
			price2.clear();
			price2.sendKeys(row.getCell(10).getStringCellValue());
		}catch(Exception e){
		}
		try{
			service3.sendKeys(row.getCell(11).getStringCellValue());
		}catch(Exception e){
		}
		try{
			desc3.clear();
			desc3.sendKeys(row.getCell(12).getStringCellValue());
		}catch(Exception e){
		}
		try{
			quantity3.clear();
			quantity3.sendKeys(row.getCell(13).getStringCellValue());
		}catch(Exception e){
		}
		try{
			price3.clear();
			price3.sendKeys(row.getCell(14).getStringCellValue());
		}catch(Exception e){
		}
		try{
			service4.sendKeys(row.getCell(15).getStringCellValue());
		}catch(Exception e){
		}
		try{
			desc4.clear();
			desc4.sendKeys(row.getCell(16).getStringCellValue());
		}catch(Exception e){
		}
		try{
			quantity4.clear();
			quantity4.sendKeys(row.getCell(17).getStringCellValue());
		}catch(Exception e){
		}
		try{
			price4.clear();
			price4.sendKeys(row.getCell(18).getStringCellValue());
		}catch(Exception e){
		}
		try{
			service5.sendKeys(row.getCell(19).getStringCellValue());
		}catch(Exception e){
		}
		try{
			desc5.clear();
			desc5.sendKeys(row.getCell(20).getStringCellValue());
		}catch(Exception e){
		}
		try{
			quantity5.clear();
			quantity5.sendKeys(row.getCell(21).getStringCellValue());
		}catch(Exception e){
		}
		try{
			price5.clear();
			price5.sendKeys(row.getCell(22).getStringCellValue());
		}catch(Exception e){
		}
		attachment.click();
		java.lang.Runtime.getRuntime().exec("D:\\docupload.exe");
		try{
			message.sendKeys(row.getCell(23).getStringCellValue());
		}catch(Exception e){
		}
		String msg=title.getText();
		try{
			submit.click();
		}catch(Exception e)
		{
		}
		return msg;
	}
}