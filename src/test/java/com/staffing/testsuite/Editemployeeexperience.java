package com.staffing.testsuite;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.staffing.editemployee.Editemployeeexperiencepage;
import com.staffing.utility.ScreenShot;

public class Editemployeeexperience extends Constants
{
	FileInputStream f;
	XSSFWorkbook wb;
	XSSFSheet ws;
	FileOutputStream f1;
	FirefoxDriver driver;
	WebDriverWait mywait;
	int count=0;
	@Test
	public void entereditaddressDetails() throws IOException, InterruptedException
	{
		f=new FileInputStream(experience);
		wb=new XSSFWorkbook(f);
		ws=wb.getSheetAt(0);
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("staffprofile");
		driver=new FirefoxDriver(fp);		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		Menu m=PageFactory.initElements(driver, Menu.class);
		Login l=PageFactory.initElements(driver, Login.class);
		Logout lo=PageFactory.initElements(driver, Logout.class);
		Editemployeeexperiencepage ep=PageFactory.initElements(driver, Editemployeeexperiencepage.class);
		l.button();
		Thread.sleep(2000);
		l.loginstaff(user,pwd);
		Thread.sleep(2000);
		m.Employee();
		Thread.sleep(2000);
		m.sm.Experience();
		Thread.sleep(2000);
		int lastrownum=0;
		mywait=new WebDriverWait(driver,20);
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='big_table_info']")));
		String text=driver.findElement(By.xpath("//*[@id='big_table_info']")).getText().split(" ")[5];
		Thread.sleep(500);
		if(text.equals("0"))
		{
			System.out.println("data table not present in this module");
		}
		else
		{
			WebElement table=driver.findElement(By.id("big_table"));
			List<WebElement> tablerow=table.findElements(By.tagName("tr"));
			lastrownum=eo.getRowCount(experience, 0);
			for (int i = 1; i < tablerow.size(); i++) 
			{
				List<WebElement> editbtn=tablerow.get(i).findElements(By.cssSelector("a.btn.green"));
				for (int j = 0; j <  editbtn.size(); j++) 
				{
					Row r=ws.getRow(i);
					if(i<= lastrownum)
					{
						for (int k = 1; k < lastrownum;) 
						{
							Thread.sleep(2000);
							editbtn.get(j).click();
							String msgtitle=ep.employeeexperience(driver, r);
							String heading=driver.findElement(By.xpath("//*[@id='pageload']/div/div/div[1]/div[1]")).getText();
							if(!msgtitle.equals(heading))
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
								String fail="editexperiencefail"+Integer.toString(k);
								s.getScreenshot(driver, fail);
								Thread.sleep(2000);
								driver.findElement(By.cssSelector("input.btn.default")).click();
							}
							break;
						}
					}
				}
				Thread.sleep(2000);
				table=driver.findElement(By.id("big_table"));
				tablerow=table.findElements(By.tagName("tr"));
			}
		}
		f1=new FileOutputStream(experienceres);
		wb.write(f1);
		f1.close();	
		Thread.sleep(500);
		lo.logoutstaffing(driver);
		driver.close();
	}
}