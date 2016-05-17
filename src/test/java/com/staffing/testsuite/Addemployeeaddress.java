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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.staffing.employee.addemployeeaddresspage;
import com.staffing.employee.employeepage;
import com.staffing.utility.ScreenShot;

public class Addemployeeaddress extends Constants
{
	FileInputStream f;
	XSSFWorkbook wb;
	XSSFSheet ws;
	FileOutputStream f1;
	@BeforeMethod
	public void launch_and_login() throws IOException, InterruptedException
	{
		f=new FileInputStream(address);
		wb=new XSSFWorkbook(f);
		ws=wb.getSheetAt(0);
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("staffprofile");
		driver=new FirefoxDriver(fp);		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		Login l=PageFactory.initElements(driver, Login.class);
		l.button();
		Thread.sleep(2000);
		l.loginstaff(user,pwd);
	}
	@Test
	public void enter_Address_Details() throws InterruptedException, IOException 
	{
		Menu m=PageFactory.initElements(driver, Menu.class);
		employeepage ep=PageFactory.initElements(driver, employeepage.class);
		addemployeeaddresspage aeap=PageFactory.initElements(driver, addemployeeaddresspage.class);
		m.Employee();
		Thread.sleep(2000);
		m.sm.Address();
		Thread.sleep(2000);
		int lastrownum=0;
		lastrownum=eo.getRowCount(address, 0);
		for (int i = 1; i <= lastrownum; i++) 
		{
			Thread.sleep(2000);
			ep.AddNew();
			Row r=ws.getRow(i);
			String title=aeap.addAddressDetails(driver, r);
			WebElement maintitle=driver.findElement(By.id("addModal"));
			String heading=maintitle.getCssValue("display");
			if(!title.contains(heading))
			{
				String result=eo.actresultpass(r, 11, 12, 13);
				System.out.println(result);
				Thread.sleep(2000);
			}
			else
			{
				String result=eo.actresultfail(r, 11, 12, 13);
				System.out.println(result);
				ScreenShot s=PageFactory.initElements(driver, ScreenShot.class);
				String fail="addressfail"+Integer.toString(i);
				s.getScreenshot(driver, fail);
				Thread.sleep(2000);
				driver.findElement(By.linkText("Close")).click();
			}
		}
	}
	@AfterMethod
	public void logout() throws IOException, InterruptedException
	{
		Logout lo=PageFactory.initElements(driver, Logout.class);
		f1=new FileOutputStream(addressres);
		wb.write(f1);
		f1.close();
		Thread.sleep(500);
		lo.logoutstaffing(driver);
		driver.close();
	}
}