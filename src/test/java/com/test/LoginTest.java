package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.Userspage;

public class LoginTest {
	WebDriver driver=null;
	LoginPage lp=null;
	HomePage hp=null;
	Userspage up=null;
	
	@BeforeSuite
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Administrator/Desktop/Offline%20Website/Offline%20Website/index.html");
		lp=new LoginPage(driver);
	}
	
	@Test
	public void validLoginTest() {
		lp.typeUserName("kiran@gmail.com");
		lp.typePassword("123456");
		hp=lp.clickLoginButton(driver);
		
	}
	@Test
	public void HomePageTest() {
		hp.verifyTiles(driver);
	}
	@Test
	public void clickUser() {
		up=hp.clickUsers(driver);
	}
	@Test
	public void clickAddUser() {
		up.clickAddUser(driver);
	}
}
