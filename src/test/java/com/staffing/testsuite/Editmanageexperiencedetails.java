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

import com.staffing.editmanageemployee.Editmanageexperiencepage;
import com.staffing.employee.employeepage;
import com.staffing.testsuite.Constants;
import com.staffing.testsuite.Menu;
import com.staffing.utility.Autofilloption;
import com.staffing.utility.ScreenShot;
import com.staffing.utility.Slider;
import com.staffing.testsuite.Login;

public class Editmanageexperiencedetails extends Constants{
	FileInputStream f;
	XSSFWorkbook wb;
	XSSFSheet ws;
	FileOutputStream f1;
	FirefoxDriver driver;
	@Test
	public  void editexperienceDetails() throws IOException, InterruptedException
	{
		f=new FileInputStream(manageexperience);
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
		Slider slide=PageFactory.initElements(driver, Slider.class);
		Autofilloption afo=PageFactory.initElements(driver,Autofilloption.class);
		Editmanageexperiencepage emep=PageFactory.initElements(driver, Editmanageexperiencepage.class);
		l.button();
		Thread.sleep(1000);
		l.loginstaff(user,pwd);
		Thread.sleep(1000);
		try{
			m.HREmployee();
		}catch(Exception e){
			slide.slider(driver);
			m.HREmployee();
		}
		Thread.sleep(1000);
		m.sm.ManageEmployee();
		Thread.sleep(1000);
		driver.findElement(By.id("country")).sendKeys("t");
		Thread.sleep(500);
		afo.selectoptionautofill("testsathish");
		driver.findElement(By.id("option")).sendKeys("Employee Experience");
		driver.findElement(By.id("submit")).click();
		int lastrownum=0;
		lastrownum=eo.getRowCount(manageexperience, 0);
		System.out.println(lastrownum);
		for (int i = 1; i <= lastrownum; i++) 
		{
			Thread.sleep(2000);
			ep.AddNew();
			Row r=ws.getRow(i);
			String msgtitle=emep.editemployeeexperience(driver, r);
			System.out.println(msgtitle);
			WebElement title=driver.findElement(By.id("addModal"));
			String heading=title.getCssValue("display");
			System.out.println(heading);
			if(!msgtitle.contains(heading))
			{
				String result=eo.actresultpass(r, 15, 16, 17);
				System.out.println(result);
				Thread.sleep(2000);
			}
			else
			{
				String result=eo.actresultfail(r, 15, 16, 17);
				System.out.println(result);
				ScreenShot s=PageFactory.initElements(driver, ScreenShot.class);
				String fail="experiencefail"+Integer.toString(i);
				s.getScreenshot(driver, fail);
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("input.btn.default")).click();
			}
		}
		f1=new FileOutputStream(manageexperienceres);
		wb.write(f1);
		f1.close();
		Thread.sleep(500);
		lo.logoutstaffing(driver);
		driver.close();
	}	
}