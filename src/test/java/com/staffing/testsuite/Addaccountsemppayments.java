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

import com.staffing.accounts.Employeepayments;
import com.staffing.employee.employeepage;
import com.staffing.utility.ScreenShot;

public class Addaccountsemppayments extends Constants{
	FileInputStream f;
	XSSFWorkbook wb;
	XSSFSheet ws;
	@Test
	public void emppayments() throws InterruptedException, IOException
	{
		int lastrownum=0;
		f=new FileInputStream(accountsemppay);
		wb=new XSSFWorkbook(f);
		ws=wb.getSheetAt(0);
		String result=null;
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("staffprofile");
		FirefoxDriver driver=new FirefoxDriver(fp);	
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		Login lg=PageFactory.initElements(driver, Login.class);
		Logout lo=PageFactory.initElements(driver, Logout.class);
		lg.button();
		lg.loginstaff(user,pwd);
		Menu m=PageFactory.initElements(driver, Menu.class);
		employeepage ep=PageFactory.initElements(driver, employeepage.class);
		Employeepayments aep=PageFactory.initElements(driver, Employeepayments.class);
		m.Accounts();
		m.sm.EmployeePayments();
		lastrownum=eo.getRowCount(accountsemppay, 0);
		System.out.println(lastrownum);
		for(int i=1;i<=lastrownum;i++)
		{
			ep.AddNew();
			Row r=ws.getRow(i);
			String title=aep.employeepayments(driver,r);
			WebElement maintitle=driver.findElement(By.id("addModal"));
			String heading=maintitle.getCssValue("display");
			if(!title.contains(heading))
			{
				result=eo.actresultpass(r, 6, 7, 8);
				System.out.println("result:"+result);
				Thread.sleep(2000);
			}
			else
			{
				result=eo.actresultfail(r, 6, 7, 8);
				System.out.println("result:"+result);
				ScreenShot s=PageFactory.initElements(driver, ScreenShot.class);
				String fail="accountemppaymentfail"+Integer.toString(i);
				s.getScreenshot(driver, fail);
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("input.btn.default")).click();
			}
		}
		FileOutputStream f1=new FileOutputStream(accountsemppayres);
		wb.write(f1);
		f1.close();
		Thread.sleep(500);
		lo.logoutstaffing(driver);
		driver.close();
	}
}