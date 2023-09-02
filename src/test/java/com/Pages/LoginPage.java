package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	
	//1) Locators
	
	private By sign_In = By.xpath("//a[contains(text(),'Sign in')]");
	private By email = By.xpath("//input[@id='email']");
	private By password = By.xpath("//input[@id='passwd']");
	private By signInButton = By.xpath("//i[@class='icon-lock left']");
	
	//2) public constructor for this page class
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	//3) page actions: behavior of these elements in the form of methods
	
	public String getPageTitle() {
		return driver.getTitle();
	}

	
	public void signInClick() {
		driver.findElement(sign_In).click();
	}
	
	public void enterEmail(String userName) {
		driver.findElement(email).sendKeys(userName);
	}
	
	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickSignInButton() {
		driver.findElement(signInButton).click();
		driver.quit();
	}
	
}
