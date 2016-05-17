package com.staffing.testsuite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubMenu {
	//*****************Employee Submenu**************
	@FindBy(linkText="Address")
	WebElement Address;
	public void Address()
	{
		Address.click();
	}
	@FindBy(linkText="Contacts")
	WebElement Contacts;
	public void Contacts()
	{
		Contacts.click();
	}
	@FindBy(linkText="Dependents")
	WebElement Dependents;
	public void Dependents()
	{
		Dependents.click();
	}
	@FindBy(linkText="Documents")
	WebElement Documents;
	public void Documents()
	{
		Documents.click();
	}
	@FindBy(linkText="Education")
	WebElement Education;
	public void Education()
	{
		Education.click();
	}
	@FindBy(linkText="Emergency Contacts")
	WebElement EmergencyContacts;
	public void EmergencyContacts()
	{
		EmergencyContacts.click();
	}
	@FindBy(linkText="Experience")
	WebElement Experience;
	public void Experience()
	{
		Experience.click();
	}
	@FindBy(linkText="I9 Form")
	WebElement i9form;
	public void i9form()
	{
		i9form.click();
	}
	@FindBy(linkText="Job Details")
	WebElement JobDetails;
	public void JobDetails()
	{
		JobDetails.click();
	}
	@FindBy(linkText="Personal")
	WebElement Personal;
	public void Personal()
	{
		Personal.click();
	}
	//*****************Vendor******************
	@FindBy(linkText="Vendor Details")
	WebElement VendorDetails;
	public void VendorDetails()
	{
		VendorDetails.click();
	}
	@FindBy(linkText="Vendor Payments")
	WebElement VendorPayments;
	public void VendorPayments()
	{
		VendorPayments.click();
	}
	//*****************Admin******************
	@FindBy(linkText="Create Employee")
	WebElement CreateEmployee;
	public void CreateEmployee()
	{
		CreateEmployee.click();
	}
	@FindBy(linkText="Creating Roles")
	WebElement CreatingRoles;
	public void CreatingRoles()
	{
		CreatingRoles.click();
	}
	@FindBy(linkText="Documents Setup")
	WebElement DocumentsSetup ;
	public void DocumentsSetup ()
	{
		DocumentsSetup.click();
	}
	@FindBy(linkText="Daily Transactional Data")
	WebElement DailyTransactionalData;
	public void DailyTransactionalData()
	{
		DailyTransactionalData.click();
	}
	@FindBy(linkText="Job Details")
	WebElement AdminJobDetails;
	public void AdminJobDetails()
	{
		AdminJobDetails.click();
	}
	@FindBy(linkText="Paystub")
	WebElement Paystub;
	public void Paystub()
	{
		Paystub.click();
	}
	@FindBy(linkText="Profiles/Resumes")
	WebElement ProfilesResumes;
	public void ProfilesResumes()
	{
		ProfilesResumes.click();
	}
	@FindBy(linkText="Projects")
	WebElement Projects;
	public void Projects()
	{
		Projects.click();
	}
	@FindBy(linkText="Rate Calculators")
	WebElement RateCalculators;
	public void RateCalculators()
	{
		RateCalculators.click();
	}
	//*****************PAF***********************
	@FindBy(linkText="Upload PAF")
	WebElement UploadPAF;
	public void UploadPAF()
	{
		UploadPAF.click();
	}
	//*****************TimeSheet******************
	@FindBy(linkText="Employee Timesheet")
	WebElement EmployeeTimesheet;
	public void EmployeeTimesheet()
	{
		EmployeeTimesheet.click();
	}
	@FindBy(linkText="Monthly Report")
	WebElement MonthlyReport;
	public void MonthlyReport()
	{
		MonthlyReport.click();
	}
	@FindBy(linkText="Monthly Summary Report")
	WebElement MonthlySummaryReport;
	public void MonthlySummaryReport()
	{
		MonthlySummaryReport.click();
	}
	@FindBy(linkText="Report By Dates")
	WebElement ReportByDates;
	public void ReportByDates()
	{
		ReportByDates.click();
	}
	//*****************Accounts****************
	@FindBy(linkText="Employee Payments")
	WebElement EmployeePayments;
	public void EmployeePayments()
	{
		EmployeePayments.click();
	}
	@FindBy(linkText="Invoice")
	WebElement Invoice;
	public void Invoice()
	{
		Invoice.click();
	}
	@FindBy(linkText="Recieved Payments")
	WebElement RecievedPayments;
	public void RecievedPayments()
	{
		RecievedPayments.click();
	}
	//*****************Employee Job**************
	@FindBy(linkText="Job Details")
	WebElement EmployeejobJobDetails;
	public void EmployeejobJobDetails()
	{
		EmployeejobJobDetails.click();
	}
	//*****************Sales / Recruitment **************
	@FindBy(linkText="Daily Transactions")
	WebElement DailyTransactions;
	public void srDailyTransactions()
	{
		DailyTransactions.click();
	}
	@FindBy(linkText="Profiles")
	WebElement Profiles;
	public void Profiles()
	{
		Profiles.click();
	}
	//*****************HR Employee*****************
	@FindBy(linkText="Manage Employee")
	WebElement ManageEmployee;
	public void ManageEmployee()
	{
		ManageEmployee.click();
	}
	@FindBy(linkText="Manage Vendor Document")
	WebElement ManageVendorDocument;
	public void ManageVendorDocument()
	{
		ManageVendorDocument.click();
	}
	//*****************Support*******************
	@FindBy(linkText="Assigned Tickets")
	WebElement AssignedTickets;
	public void AssignedTickets()
	{
		AssignedTickets.click();
	}
	@FindBy(linkText="Check Status")
	WebElement CheckStatus;
	public void CheckStatus()
	{
		CheckStatus.click();
	}
	@FindBy(linkText="Create Ticket")
	WebElement CreateTicket;
	public void CreateTicket()
	{
		CreateTicket.click();
	}
	@FindBy(linkText="My Tickets")
	WebElement MyTickets;
	public void MyTickets()
	{
		MyTickets.click();
	}
	@FindBy(linkText="View All Tickets")
	WebElement ViewAllTickets;
	public void ViewAllTickets()
	{
		ViewAllTickets.click();
	}
	//*****************My Reports**************
	@FindBy(linkText="Payments Rcvd by Detail")
	WebElement PaymentsRcvdbyDetail;
	public void PaymentsRcvdbyDetail()
	{
		PaymentsRcvdbyDetail.click();
	}
	@FindBy(linkText="Payments Rcvd by Summary")
	WebElement PaymentsRcvdbySummary;
	public void PaymentsRcvdbySummary()
	{
		PaymentsRcvdbySummary.click();
	}
	//*****************Reports*****************
	@FindBy(linkText="Emp Payments by Detail")
	WebElement EmpPaymentsbyDetail;
	public void EmpPaymentsbyDetail()
	{
		EmpPaymentsbyDetail.click();
	}
	@FindBy(linkText="Emp Payments by Summary")
	WebElement EmpPaymentsbySummary;
	public void EmpPaymentsbySummary()
	{
		EmpPaymentsbySummary.click();
	}
	@FindBy(linkText="Timesheet By Employee")
	WebElement TimesheetByEmployee;
	public void TimesheetByEmployee()
	{
		TimesheetByEmployee.click();
	}
}