package com.staffing.responsetime;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.staffing.testsuite.Menu;
import com.staffing.testsuite.Login;

public class employeeaddress {
	long etime,totaltime,stime,start,end;
	WebDriverWait mywait;
	FirefoxDriver driver;
	long avgtime=0;
	@Test
	public void loadtime()
	{
		driver=new FirefoxDriver();
		driver.get("http://dev.drupalcorner.com/");
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		Menu m=PageFactory.initElements(driver, Menu.class);
		Login l=PageFactory.initElements(driver, Login.class);
		l.button();
		for (int i = 0; i < 3; i++) {
			l.loginstaff("testsathish", "testsathish");
			start=System.currentTimeMillis();
			m.Admin();
			m.sm.UploadPAF();
			mywait=new WebDriverWait(driver,20);
			mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='paf50']")));
			//mywait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.btn.green")));
			end=System.currentTimeMillis();
			//driver.findElement(By.cssSelector("input.btn.default")).click();
			Date date=new Date();
			totaltime=(end-start)/1000;
			System.out.println("total time in seconds:"+totaltime+"seconds");
			System.out.println("date and time:"+date);
			System.out.println();
			//Actions action = new Actions(driver);
		/*	WebElement event1=*/driver.findElement(By.className("dropdown-toggle")).click();
		driver.findElement(By.className("dropdown-toggle")).click();
		/*	WebElement event2=*/driver.findElement(By.xpath("html/body/div[1]/div/div[2]/ul/li/ul/li[3]/a")).click();
		//	action.moveToElement(event1).moveToElement(event2).click().build().perform();
			avgtime=totaltime+avgtime;
		}
		
		System.out.println("avg time:"+(avgtime/3));
		driver.close();
	}
}
