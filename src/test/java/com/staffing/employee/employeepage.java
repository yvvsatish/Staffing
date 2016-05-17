package com.staffing.employee;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class employeepage {
	@FindBy(css="a.btn.green")
	WebElement AddNew;
	public void AddNew()
	{
		AddNew.click();
	}
	@FindBy(css="a.btn.yellow-gold.pull-right")
	WebElement Dashboard;
	public void Dashboard()
	{
		Dashboard.click();
	}
	@FindBy(css="a.btn.green")
	WebElement Edit;
	public void Edit()
	{
		Edit.click();
	}
	@FindBy(css="a.btn.red")
	WebElement Delete;
	public void Delete()
	{
		Delete.click();
	}
	@FindBy(css="a.btn.blue")
	WebElement View;
	public void View()
	{
		View.click();
	}
/*	public addemployeeaddresspage aeap;
	public void Employeeaddresspage(WebDriver driver)
	{
		aeap=PageFactory.initElements(driver, addemployeeaddresspage.class);
	}
	public addemployeecontactpage aecp;
	public void EmployeecontactPage(WebDriver driver)
	{
		aecp=PageFactory.initElements(driver, addemployeecontactpage.class);
	}
	public addemployeedependentspage aedp;
	public void EmployeedependentPage(WebDriver driver)
	{
		aedp=PageFactory.initElements(driver, addemployeedependentspage.class);
	}
	public addemployeejobdetailspage aejp;
	public void EmployeejobdetailsPage(WebDriver driver)
	{
		aejp=PageFactory.initElements(driver, addemployeejobdetailspage.class);
	}*/
}
