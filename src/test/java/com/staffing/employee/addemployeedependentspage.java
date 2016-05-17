package com.staffing.employee;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.staffing.utility.DatePicker;

public class addemployeedependentspage 
{
	WebDriver driver=null;
	@FindBy(xpath="//div[@id='addModal' and @aria-labelledby='myModalLabel1']//*[@name='firstName']")
	WebElement firstname;
	@FindBy(xpath="//div[@id='addModal' and @aria-labelledby='myModalLabel1']//*[@name='middleName']")
	WebElement middlename;
	@FindBy(xpath="//div[@id='addModal' and @aria-labelledby='myModalLabel1']//*[@name='lastName']")
	WebElement lastname;
	@FindBy(xpath="//div[@id='addModal' and @aria-labelledby='myModalLabel1']//*[@name='gender']")
	WebElement gender;
	@FindBy(xpath="//div[@id='addModal' and @aria-labelledby='myModalLabel1']//*[@id='dob']")
	WebElement dateofbirth;
	@FindBy(xpath="//div[@id='addModal' and @aria-labelledby='myModalLabel1']//*[@name='pob']")
	WebElement placeofbirth;
	@FindBy(xpath="//div[@id='addModal' and @aria-labelledby='myModalLabel1']//*[@name='hedu_id']")
	WebElement higheredu;
	@FindBy(xpath="//div[@id='addModal' and @aria-labelledby='myModalLabel1']//*[@name='country']")
	WebElement country;
	@FindBy(xpath="//div[@id='addModal' and @aria-labelledby='myModalLabel1']//*[@id='state_dropdown']")
	WebElement state;
	@FindBy(xpath="//div[@id='addModal' and @aria-labelledby='myModalLabel1']//*[@name='dtype_id']")
	WebElement deptype;
	@FindBy(xpath="//div[@id='addModal' and @aria-labelledby='myModalLabel1']//input[@class='btn blue']")
	WebElement save;
	@FindBy(xpath="//div[@id='addModal' and @aria-labelledby='myModalLabel1']")
	WebElement title;
	public String addDependentDetails(Row r) throws InterruptedException
	{
		if(r.getCell(0).getCellType()!= Cell.CELL_TYPE_BLANK ){
			deptype.sendKeys(r.getCell(0).getStringCellValue());
		}
		if(r.getCell(1).getCellType()!= Cell.CELL_TYPE_BLANK ){
			firstname.clear();
			firstname.sendKeys(r.getCell(1).getStringCellValue());
		}
		if(r.getCell(2).getCellType()!= Cell.CELL_TYPE_BLANK ){
			middlename.clear();
			middlename.sendKeys(r.getCell(2).getStringCellValue());
		}
		if(r.getCell(3).getCellType()!= Cell.CELL_TYPE_BLANK ){
			lastname.clear();
			lastname.sendKeys(r.getCell(3).getStringCellValue());
		}
		if(r.getCell(4).getCellType()!= Cell.CELL_TYPE_BLANK ){
			gender.sendKeys(r.getCell(4).getStringCellValue());
		}
		try{
		if(r.getCell(5).getCellType()!= Cell.CELL_TYPE_BLANK ){
			dateofbirth.click();
			DatePicker dt=PageFactory.initElements(driver, DatePicker.class);
			dt.datePicker(r.getCell(5).getStringCellValue()).click();
		}
		}catch(Exception e){			
		}
		if(r.getCell(6).getCellType()!= Cell.CELL_TYPE_BLANK ){
			placeofbirth.clear();
			placeofbirth.sendKeys(r.getCell(6).getStringCellValue());
		}
		if(r.getCell(7).getCellType()!= Cell.CELL_TYPE_BLANK ){
			higheredu.sendKeys(r.getCell(7).getStringCellValue());
		}
		if(r.getCell(8).getCellType()!= Cell.CELL_TYPE_BLANK ){
			country.sendKeys(r.getCell(8).getStringCellValue());
			Thread.sleep(2000);
		}
		if(r.getCell(9).getCellType()!= Cell.CELL_TYPE_BLANK ){
			state.click();
			Thread.sleep(2000);
			state.sendKeys(r.getCell(9).getStringCellValue());
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