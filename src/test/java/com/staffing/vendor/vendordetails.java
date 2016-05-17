package com.staffing.vendor;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.staffing.utility.DatePicker;

public class vendordetails {
	@FindBy(name="vendor_type_id")
	WebElement vendortype;
	@FindBy(name="vendorstatus")
	WebElement vendorstatus;
	@FindBy(id="startdate")
	WebElement startdate;
	@FindBy(name="vendor_name")
	WebElement vendorname;
	@FindBy(id="country")
	WebElement country;
	@FindBy(id="state_dropdown")
	WebElement state;
	@FindBy(name="city")
	WebElement city;
	@FindBy(name="address1")
	WebElement address1;
	@FindBy(name="address2")
	WebElement address2;
	@FindBy(id="zip")
	WebElement zip;
	@FindBy(id="phone")
	WebElement phone;
	@FindBy(name="email")
	WebElement email;
	@FindBy(id="fax")
	WebElement fax;
	@FindBy(name="website")
	WebElement website;
	@FindBy(id="taxid")
	WebElement taxid;
	@FindBy(name="location_code")
	WebElement locationcode;
	@FindBy(name="pname")
	WebElement pname;
	@FindBy(id="pphone")
	WebElement pphone;
	@FindBy(id="pemail")
	WebElement pemail;
	@FindBy(name="pdesignation")
	WebElement pdesignation;
	@FindBy(name="sname")
	WebElement sname;
	@FindBy(id="sphone")
	WebElement sphone;
	@FindBy(id="semail")
	WebElement semail;
	@FindBy(name="sdesignation")
	WebElement sdesignation;
	@FindBy(css="input.btn.blue")
	WebElement save;
	@FindBy(xpath="//div[@id='addModal' and @role='dialog' and @tabindex='-1']")
	WebElement title;
	public String vendorDetails(WebDriver driver,Row r) throws InterruptedException {
		DatePicker dp=PageFactory.initElements(driver, DatePicker.class);
		try{
			vendortype.sendKeys(r.getCell(0).getStringCellValue());
		}catch(Exception e){
		}
		try{
			vendorstatus.sendKeys(r.getCell(1).getStringCellValue());
		}catch(Exception e){
		}
		try{
			startdate.click();
			dp.datePicker(r.getCell(2).getStringCellValue()).click();
		}catch(Exception e){
		}
		try{
			vendorname.clear();
			vendorname.sendKeys(r.getCell(3).getStringCellValue());
		}catch(Exception e){
		}
		try{
			country.sendKeys(r.getCell(4).getStringCellValue());
			Thread.sleep(2000);
		}catch(Exception e){
		}
		try{
			state.click();
			Thread.sleep(2000);
			state.sendKeys(r.getCell(5).getStringCellValue());
		}catch(Exception e){
		}
		try{
			city.clear();
			city.sendKeys(r.getCell(6).getStringCellValue());
		}catch(Exception e){
		}
		try{
			address1.clear();
			address1.sendKeys(r.getCell(7).getStringCellValue());
		}catch(Exception e){
		}
		try{
			address2.clear();
			address2.sendKeys(r.getCell(8).getStringCellValue());
		}catch(Exception e){
		}
		try{
			zip.click();
			zip.sendKeys(Keys.CONTROL+"a");
			zip.sendKeys(Keys.DELETE);
			zip.sendKeys(r.getCell(9).getStringCellValue());
		}catch(Exception e){
		}
		try{
			phone.click();
			phone.sendKeys(Keys.CONTROL+"a");
			phone.sendKeys(Keys.DELETE);
			phone.sendKeys(r.getCell(10).getStringCellValue());
		}catch(Exception e){
		}
		try{
			email.clear();
			email.sendKeys(r.getCell(11).getStringCellValue());
		}catch(Exception e){
		}
		try{
			fax.click();
			fax.sendKeys(Keys.CONTROL+"a");
			fax.sendKeys(Keys.DELETE);
			fax.sendKeys(r.getCell(12).getStringCellValue());
		}catch(Exception e){
		}
		try{
			website.clear();
			website.sendKeys(r.getCell(13).getStringCellValue());
		}catch(Exception e){
		}
		try{
			taxid.click();
			taxid.sendKeys(Keys.CONTROL+"a");
			taxid.sendKeys(Keys.DELETE);
			taxid.sendKeys(r.getCell(14).getStringCellValue());
		}catch(Exception e){
		}
		try{
			locationcode.clear();
			locationcode.sendKeys(r.getCell(15).getStringCellValue());
		}catch(Exception e){
		}
		try{
			pname.clear();
			pname.sendKeys(r.getCell(16).getStringCellValue());
		}catch(Exception e){
		}
		try{
			pphone.click();
			pphone.sendKeys(Keys.CONTROL+"a");
			pphone.sendKeys(Keys.DELETE);
			pphone.sendKeys(r.getCell(17).getStringCellValue());
		}catch(Exception e){
		}
		try{
			pemail.clear();
			pemail.sendKeys(r.getCell(18).getStringCellValue());
		}catch(Exception e){
		}
		try{
			pdesignation.clear();
			pdesignation.sendKeys(r.getCell(19).getStringCellValue());
		}catch(Exception e){
		}
		try{
			sname.clear();
			sname.sendKeys(r.getCell(20).getStringCellValue());
		}catch(Exception e){
		}
		try{
			sphone.click();
			sphone.sendKeys(Keys.CONTROL+"a");
			sphone.sendKeys(Keys.DELETE);
			sphone.sendKeys(r.getCell(21).getStringCellValue());
		}catch(Exception e){
		}
		try{
			semail.clear();
			semail.sendKeys(r.getCell(22).getStringCellValue());
		}catch(Exception e){
		}
		try{
			sdesignation.clear();
			sdesignation.sendKeys(r.getCell(23).getStringCellValue());
		}catch(Exception e){
		}
		String msg=title.getAttribute("style");
		try {
			save.click();
		} catch (Exception e) {
		}
		return msg;
	}
}