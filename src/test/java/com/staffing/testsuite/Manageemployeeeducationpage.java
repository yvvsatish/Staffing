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

import com.staffing.employee.employeepage;
import com.staffing.manageemployee.Addmanageeducationpage;
import com.staffing.utility.Autofilloption;
import com.staffing.utility.ScreenShot;
import com.staffing.utility.Slider;

public class Manageemployeeeducationpage extends Constants {
	FileInputStream f;
	XSSFWorkbook wb;
	XSSFSheet ws;
	FileOutputStream f1;
	@Test
	public  void enterEducationDetails() throws IOException, InterruptedException
	{
		String result = null;
		FileOutputStream f1 = null;
		f=new FileInputStream(manageeducation);
		wb=new XSSFWorkbook(f);
		ws=wb.getSheetAt(0);
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("staffprofile");
		driver=new FirefoxDriver(fp);	
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		Menu m=PageFactory.initElements(driver, Menu.class);
		employeepage ep=PageFactory.initElements(driver, employeepage.class);
		Login l=PageFactory.initElements(driver, Login.class);
		Logout lo=PageFactory.initElements(driver, Logout.class);
		Addmanageeducationpage amep=PageFactory.initElements(driver, Addmanageeducationpage.class);
		Autofilloption afo=PageFactory.initElements(driver,Autofilloption.class);
		Slider slide=PageFactory.initElements(driver, Slider.class);
		l.button();
		Thread.sleep(2000);
		l.loginstaff(user,pwd);
		Thread.sleep(2000);
		try{
			m.HREmployee();
		}catch(Exception e){
			slide.slider(driver);
			m.HREmployee();
		}
		Thread.sleep(2000);
		m.sm.ManageEmployee();
		Thread.sleep(2000);
		driver.findElement(By.id("country")).sendKeys("t");
		Thread.sleep(500);
		afo.selectoptionautofill("testsathish");
		driver.findElement(By.id("option")).sendKeys("Employee Education");
		driver.findElement(By.id("submit")).click();
		int lastrownum=0;
		lastrownum=eo.getRowCount(manageeducation, 0);
		for (int i = 1; i <= lastrownum; i++) 
		{
			Thread.sleep(2000);
			ep.AddNew();
			Row r=ws.getRow(i);
			String title=amep.addEducationDetails(driver, r);
			WebElement maintitle=driver.findElement(By.id("addModal"));
			String heading=maintitle.getCssValue("display");
			if(!title.contains(heading))
			{
				result=eo.actresultpass(r, 10, 11, 12);
				System.out.println("result:"+result);
				Thread.sleep(2000);
			}
			else
			{
				result=eo.actresultfail(r, 10, 11, 12);
				System.out.println("result:"+result);
				ScreenShot s=PageFactory.initElements(driver, ScreenShot.class);
				String fail="manageeducationfail"+Integer.toString(i);
				s.getScreenshot(driver, fail);
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("input.btn.default")).click();
			}
		}
		f1=new FileOutputStream(manageeducationres);
		wb.write(f1);
		f1.close();
		Thread.sleep(500);
		lo.logoutstaffing(driver);
		driver.close();
	}
}