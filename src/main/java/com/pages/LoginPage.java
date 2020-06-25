package com.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
	
	
	@FindBy(id="email")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(xpath="//button")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void typeUserName(String uName) {
		username.clear();
		username.sendKeys(uName);
	}
	public void typePassword(String pass) {
		password.clear();
		password.sendKeys(pass);
	}
	public HomePage clickLoginButton(WebDriver driver) {
		
		loginButton.click();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
		return new HomePage(driver);
	}
	
	
	
	
}
