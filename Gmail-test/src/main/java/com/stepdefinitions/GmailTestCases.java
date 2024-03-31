package com.stepdefinitions;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.pageobject.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GmailTestCases {
	
	@Given("Open  Gmail url")
	public void openGmailurl() {
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		ChromeDriver driver = new ChromeDriver(options);
//		
//		driver.get("https://mail.google.com/mail/u/0/#inbox");
	}
	@Given("Enter User Email ID")
	public void enterUserId() {
		CustomeHooks hook = new CustomeHooks();
		hook.implicitlyWait();
		HomePage page = new HomePage();
		page.enterMailId("abcdw5880@gmail.com");
		
	}
	
	@Given("click on Next Button")
	public void clickOnNextButtonToUserId() {
		HomePage page = new HomePage();
		page.clickOnNextButtonIn();

	}
	
	@Given("Click on Compose")
	public void loginAmazonAccount() {
		HomePage page = new HomePage();
		page.clickOnComposeButton();
		
	}
	@Given("Enter recipients mail id")
	public void receiversMailInGmail() {
		HomePage page = new HomePage();
		page.textMailInTo("abcdw5880@gmail.com");
	}
	
	@When("gmail subject")
	public void writeInSubject() {
		HomePage page = new HomePage();
		page.thisIsTextMail("This is subject text");
	}
	
	@Then("write gmailbody")
	public void writeTextInBody() {
		HomePage page = new HomePage();
		page.textInBody("Hello,"+'\n' + "This is sample mail"+'\n' +'\n' +"Thanks & Regards"+'\n' +"ABCD XYZ");
		
	}
	
	@Then("Click on Send")
	public void clickOnSend() {
		HomePage page = new HomePage();
		page.clickOnSendButton();
	}
}
