package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Userspage {

	public Userspage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[text()='Add User']")
	private WebElement addUser;
	
	public void clickAddUser(WebDriver driver) {
		addUser.click();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Add User");
	}
}
