package com.staffing.testsuite;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.staffing.employee.addemployeeemergencycontactpage;
import com.staffing.employee.employeepage;
import com.staffing.utility.ScreenShot;

public class Addemployeeemergencycontact extends Constants{
	FileInputStream f;
	XSSFWorkbook wb;
	XSSFSheet ws;
	FileOutputStream f1;
	@Test
	public  void enterEmergencyContactDetails() throws IOException, InterruptedException
	{
		f=new FileInputStream(emergency);
		wb=new XSSFWorkbook(f);
		ws=wb.getSheetAt(0);
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("staffprofile");
		driver=new FirefoxDriver(fp);		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		Menu m=PageFactory.initElements(driver, Menu.class);
		employeepage ep=PageFactory.initElements(driver, employeepage.class);
		Login l=PageFactory.initElements(driver, Login.class);
		Logout lo=PageFactory.initElements(driver, Logout.class);
		addemployeeemergencycontactpage aec=PageFactory.initElements(driver, addemployeeemergencycontactpage.class);
		l.button();
		Thread.sleep(2000);
		l.loginstaff(user,pwd);
		Thread.sleep(2000);
		m.Employee();
		Thread.sleep(2000);
		m.sm.EmergencyContacts();
		Thread.sleep(2000);
		int lastrownum=0;
		lastrownum=eo.getRowCount(emergency, 0);
		System.out.println(lastrownum);
		for (int i = 1; i <= lastrownum; i++) 
		{
			Thread.sleep(2000);
			ep.AddNew();
			Row r=ws.getRow(i);
			String msgtitle=aec.addEmployeeContactdetails(r);
			WebElement title=driver.findElement(By.id("addModal"));
			String heading=title.getCssValue("display");
			if(!msgtitle.contains(heading))
			{
				String result=eo.actresultpass(r, 7, 8, 9);
				System.out.println(result);
				Thread.sleep(2000);
			}
			else
			{
				String result=eo.actresultfail(r, 7, 8, 9);
				System.out.println(result);
				ScreenShot s=PageFactory.initElements(driver, ScreenShot.class);
				String fail="emergencyfail"+Integer.toString(i);
				s.getScreenshot(driver, fail);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id='emg_contacts']/div[2]/input[2]")).click();
			}
		}
		f1=new FileOutputStream(emergencyres);
		wb.write(f1);
		f1.close();
		Thread.sleep(500);
		lo.logoutstaffing(driver);
		driver.close();
	}	
}