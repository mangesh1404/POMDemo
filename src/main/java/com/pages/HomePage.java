package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//span[text()='Dashboard']")
	private WebElement dashboard;
	
	@FindBy(xpath="//span[text()='Users']")
	private WebElement users;
	
	@FindBy(xpath="//span[text()='Operators']")
	private WebElement operators;
	
	@FindBy(xpath="//span[text()='Downloads']")
	private WebElement downloads;
	
	public Userspage clickUsers(WebDriver driver) {
		users.click();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | User");
		return new Userspage(driver);
	}
	
	public void verifyTiles(WebDriver driver) {
		List<WebElement>tiles=driver.findElements(By.tagName("h3"));
		for(WebElement tile:tiles) {
			System.out.println(tile.getText());
		}
	}
	public void launchHomePage(WebDriver driver) {
		dashboard.click();
	}
	
}
