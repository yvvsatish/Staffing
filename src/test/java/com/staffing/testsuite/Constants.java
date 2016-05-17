package com.staffing.testsuite;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.staffing.utility.ExcelOperation;

public class Constants 
{
	ExcelOperation eo=new ExcelOperation();
	public String url="http://www.staffing.com/";
	public String user="testsathish";
	public String pwd="testsathish";
	public String address="D:\\StaffingXpert_Selenium_Automation\\StaffingXpert\\src\\com\\staffing\\excelfiles\\address.xlsx";
	public String addressres="D:\\StaffingXpert_Selenium_Automation\\StaffingXpert\\src\\com\\staffing\\resultexcelfiles\\addressresults.xlsx";
	public String contact="D:\\StaffingXpert_Selenium_Automation\\StaffingXpert\\src\\com\\staffing\\excelfiles\\contacts.xlsx";
	public String contactres="D:\\StaffingXpert_Selenium_Automation\\StaffingXpert\\src\\com\\staffing\\resultexcelfiles\\contactsresults.xlsx";
	public String dependents="D:\\StaffingXpert_Selenium_Automation\\StaffingXpert\\src\\com\\staffing\\excelfiles\\dependents.xlsx";
	public String dependentsres="D:\\StaffingXpert_Selenium_Automation\\StaffingXpert\\src\\com\\staffing\\resultexcelfiles\\dependentsresults.xlsx";
	public String documents="D:\\StaffingXpert_Selenium_Automation\\StaffingXpert\\src\\com\\staffing\\excelfiles\\documents.xlsx";
	public String documentsres="D:\\StaffingXpert_Selenium_Automation\\StaffingXpert\\src\\com\\staffing\\resultexcelfiles\\documentsresults.xlsx";
	public String education="D:\\StaffingXpert_Selenium_Automation\\StaffingXpert\\src\\com\\staffing\\excelfiles\\Education.xlsx";
	public String educationres="D:\\StaffingXpert_Selenium_Automation\\StaffingXpert\\src\\com\\staffing\\resultexcelfiles\\Educationresults.xlsx";
	public String experience="D:\\StaffingXpert_Selenium_Automation\\StaffingXpert\\src\\com\\staffing\\excelfiles\\Experience.xlsx";
	public String experienceres="D:\\StaffingXpert_Selenium_Automation\\StaffingXpert\\src\\com\\staffing\\resultexcelfiles\\Experienceresults.xlsx";
	public String emergency="D:\\StaffingXpert_Selenium_Automation\\StaffingXpert\\src\\com\\staffing\\excelfiles\\Emergencycontacts.xlsx";
	public String emergencyres="D:\\StaffingXpert_Selenium_Automation\\StaffingXpert\\src\\com\\staffing\\resultexcelfiles\\Emergencycontactsresults.xlsx";
	public String jobdetails="D:\\StaffingXpert_Selenium_Automation\\StaffingXpert\\src\\com\\staffing\\excelfiles\\JobDetails.xlsx";
	public String jobdetailsres="D:\\StaffingXpert_Selenium_Automation\\StaffingXpert\\src\\com\\staffing\\resultexcelfiles\\JobDetailsresresults.xlsx";
	public String accountsemppay="D:\\StaffingXpert_Selenium_Automation\\StaffingXpert\\src\\com\\staffing\\excelfiles\\accountemppayments.xlsx";
	public String accountsemppayres="D:\\StaffingXpert_Selenium_Automation\\StaffingXpert\\src\\com\\staffing\\resultexcelfiles\\accountemppaymentsresults.xlsx";
	public String accountsinvoice="D:\\StaffingXpert_Selenium_Automation\\StaffingXpert\\src\\com\\staffing\\excelfiles\\accountinvoice.xlsx";
	public String accountsinvoiceres="D:\\StaffingXpert_Selenium_Automation\\StaffingXpert\\src\\com\\staffing\\resultexcelfiles\\accountinvoiceresults.xlsx";
	public String accountsrecpayments="D:\\StaffingXpert_Selenium_Automation\\StaffingXpert\\src\\com\\staffing\\excelfiles\\accountrecpayments.xlsx";
	public String accountsrecpaymentsres="D:\\StaffingXpert_Selenium_Automation\\StaffingXpert\\src\\com\\staffing\\resultexcelfiles\\accountrecpaymentsresults.xlsx";
	public String profileresume="D:\\StaffingXpert_Selenium_Automation\\StaffingXpert\\src\\com\\staffing\\excelfiles\\profilesresume.xlsx";
	public String profileresumeres="D:\\StaffingXpert_Selenium_Automation\\StaffingXpert\\src\\com\\staffing\\resultexcelfiles\\profilesresumeresults.xlsx";
	public String dailytransaction="D:\\StaffingXpert_Selenium_Automation\\StaffingXpert\\src\\com\\staffing\\excelfiles\\dailytransactions.xlsx";
	public String dailytransactionres="D:\\StaffingXpert_Selenium_Automation\\StaffingXpert\\src\\com\\staffing\\resultexcelfiles\\dailytransactionsresults.xlsx";
	public String vendordetails="D:\\StaffingXpert_Selenium_Automation\\StaffingXpert\\src\\com\\staffing\\excelfiles\\vendordetails.xlsx";
	public String vendordetailsres="D:\\StaffingXpert_Selenium_Automation\\StaffingXpert\\src\\com\\staffing\\resultexcelfiles\\vendordetailsresults.xlsx";
	public String manageaddress="D:\\StaffingXpert_Selenium_Automation\\StaffingXpert\\src\\com\\staffing\\excelfiles\\manageaddress.xlsx";
	public String manageaddressres="D:\\StaffingXpert_Selenium_Automation\\StaffingXpert\\src\\com\\staffing\\resultexcelfiles\\manageaddressresults.xlsx";
	public String managecontact="D:\\StaffingXpert_Selenium_Automation\\StaffingXpert\\src\\com\\staffing\\excelfiles\\managecontact.xlsx";
	public String managecontactres="D:\\StaffingXpert_Selenium_Automation\\StaffingXpert\\src\\com\\staffing\\resultexcelfiles\\managecontactresults.xlsx";
	public String managedependents="D:\\StaffingXpert_Selenium_Automation\\StaffingXpert\\src\\com\\staffing\\excelfiles\\managedependents.xlsx";
	public String managedependentsres="D:\\StaffingXpert_Selenium_Automation\\StaffingXpert\\src\\com\\staffing\\resultexcelfiles\\managedependentsres.xlsx";
	public String managedocuments="D:\\StaffingXpert_Selenium_Automation\\StaffingXpert\\src\\com\\staffing\\excelfiles\\managedocuments.xlsx";
	public String managedocumentsres="D:\\StaffingXpert_Selenium_Automation\\StaffingXpert\\src\\com\\staffing\\resultexcelfiles\\managedocumentsresults.xlsx";
	public String manageeducation="D:\\StaffingXpert_Selenium_Automation\\StaffingXpert\\src\\com\\staffing\\excelfiles\\manageeducation.xlsx";
	public String manageeducationres="D:\\StaffingXpert_Selenium_Automation\\StaffingXpert\\src\\com\\staffing\\resultexcelfiles\\manageeducationresesults.xlsx";
	public String manageemergencycontacts="D:\\StaffingXpert_Selenium_Automation\\StaffingXpert\\src\\com\\staffing\\excelfiles\\manageemergencycontacts.xlsx";
	public String manageemergencycontactsres="D:\\StaffingXpert_Selenium_Automation\\StaffingXpert\\src\\com\\staffing\\resultexcelfiles\\manageemergencycontactsresults.xlsx";
	public String manageexperience="D:\\StaffingXpert_Selenium_Automation\\StaffingXpert\\src\\com\\staffing\\excelfiles\\manageexperience.xlsx";
	public String manageexperienceres="D:\\StaffingXpert_Selenium_Automation\\StaffingXpert\\src\\com\\staffing\\resultexcelfiles\\manageexperienceresults.xlsx";
	public String managejobdetails="D:\\StaffingXpert_Selenium_Automation\\StaffingXpert\\src\\com\\staffing\\excelfiles\\managejobdetails.xlsx";
	public String managejobdetailsres="D:\\StaffingXpert_Selenium_Automation\\StaffingXpert\\src\\com\\staffing\\resultexcelfiles\\managejobdetailsresults.xlsx";
	
	static RemoteWebDriver driver=null;
}