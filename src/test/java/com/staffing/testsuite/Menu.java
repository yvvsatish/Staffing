package com.staffing.testsuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Menu {
	//*****************Employee*****************
	@FindBy(linkText="Employee")
	WebElement Employee;
	public void Employee()
	{
		Employee.click();
	}
	//*****************Vendor*******************
	@FindBy(linkText="Vendor")
	WebElement Vendor;
	public void Vendor()
	{
		Vendor.click();
	}
	//*****************Admin********************
	@FindBy(linkText="Admin")
	WebElement Admin;
	public void Admin()
	{
		Admin.click();
	}
	//*****************Time Sheet****************
	@FindBy(linkText="Time Sheet")
	WebElement TimeSheet;
	public void TimeSheet()
	{
		TimeSheet.click();
	}
	//*****************Accounts******************
	@FindBy(linkText="Accounts")
	WebElement Accounts;
	public void Accounts()
	{
		Accounts.click();
	}
	//*****************Employee Job***************
	@FindBy(linkText="Employee Job")
	WebElement EmployeeJob;
	public void EmployeeJob()
	{
		EmployeeJob.click();
	}
	//*****************Sales / Recruitment********
	@FindBy(linkText="Sales / Recruitment")
	WebElement SalesRecruitment;
	public void SalesRecruitment()
	{
		SalesRecruitment.click();
	}
	//*****************Data Management************
	@FindBy(linkText="Data Management")
	WebElement DataManagement;
	public void DataManagement()
	{
		DataManagement.click();
	}
	//*****************HR Employee***************
	@FindBy(linkText="HR Employee")
	WebElement HREmployee;
	public void  HREmployee()
	{
		HREmployee.click();
	}
	//*****************PAF************************
	@FindBy(linkText="PAF")
	WebElement PAF;
	public void PAF()
	{
		PAF.click();
	}
	//*****************Support********************
	@FindBy(linkText="Support")
	WebElement Support;
	public void Support()
	{
		Support.click();
	}
	//*****************My Reports*****************
	@FindBy(linkText="My Reports")
	WebElement MyReports;
	public void MyReports()
	{
		MyReports.click();
	}
	//*****************Reports*********************
	@FindBy(linkText="Reports")
	WebElement Reports;
	public void Reports()
	{
		Reports.click();
	}
	//*****************Call sub menu class*********
	public SubMenu sm=null;
	public Menu(WebDriver driver)
	{
		sm=PageFactory.initElements(driver, SubMenu.class);
	}
}