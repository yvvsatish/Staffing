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

import com.staffing.employee.addemployeedependentspage;
import com.staffing.employee.employeepage;
import com.staffing.utility.ScreenShot;

public class Addemployeedependents extends Constants{
	FileInputStream f;
	XSSFWorkbook wb;
	XSSFSheet ws;
	FileOutputStream f1;
	@BeforeMethod
	public void launch_and_login() throws IOException, InterruptedException
	{
		f=new FileInputStream(dependents);
		wb=new XSSFWorkbook(f);
		ws=wb.getSheetAt(0);
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("staffprofile");
		driver=new FirefoxDriver(fp);		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		Login l=PageFactory.initElements(driver, Login.class);
		l.button();
		Thread.sleep(2000);
		l.loginstaff(user, pwd);
	}
	@Test
	public void enter_Dependent_Details() throws InterruptedException, IOException 
	{
		Menu m=PageFactory.initElements(driver, Menu.class);
		employeepage ep=PageFactory.initElements(driver, employeepage.class);
		addemployeedependentspage aedp=PageFactory.initElements(driver, addemployeedependentspage.class);
		m.Employee();
		Thread.sleep(2000);
		m.sm.Dependents();
		Thread.sleep(2000);
		int lastrownum=0;
		lastrownum=eo.getRowCount(dependents, 0);
		System.out.println(lastrownum);
		for (int i = 1; i <= lastrownum; i++) 
		{
			ep.AddNew();
			Row r=ws.getRow(i);
			String msgtitle=aedp.addDependentDetails(r);
			WebElement title=driver.findElement(By.id("addModal")); 
			String heading=title.getCssValue("display");
			if(!msgtitle.contains(heading))
			{
				String result=eo.actresultpass(r, 10, 11, 12);
				System.out.println(result);
				Thread.sleep(2000);
			}
			else
			{
				String result=eo.actresultfail(r, 10, 11, 12);
				System.out.println(result);
				ScreenShot s=PageFactory.initElements(driver, ScreenShot.class);
				String fail="dependentfail"+Integer.toString(i);
				s.getScreenshot(driver, fail);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@id='addModal' and @aria-labelledby='myModalLabel1']//a[@class='btn default']")).click();
			}
		}
	}
	@AfterMethod
	public void logout() throws IOException, InterruptedException
	{
		Logout lo=PageFactory.initElements(driver, Logout.class);
		f1=new FileOutputStream(dependentsres);
		wb.write(f1);
		f1.close();
		Thread.sleep(500);
		lo.logoutstaffing(driver);
		driver.close();
	}	
}