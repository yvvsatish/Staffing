package com.staffing.testsuite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	@FindBy(css="a.btn.success")
	WebElement button;
	public void button()
	{ 
		button.click();
	}
	@FindBy(id="login-username")
	WebElement username;
	@FindBy(id="login-password")
	WebElement password;
	@FindBy(tagName="button")
	WebElement Login;
	public void loginstaff(String u,String p)
	{
		username.sendKeys(u);
		password.sendKeys(p);
		Login.click();
	}		
}
	
