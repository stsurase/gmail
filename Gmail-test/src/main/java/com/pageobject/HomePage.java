package com.pageobject;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;


public class HomePage {
	
	@FindBy(css = "input#identifierId")
	public WebElement enterUserEmail;
	
	@FindBy(css = "body > aside > div.Jw6k0 > div:nth-child(1) > div > button > span")
	public WebElement clickOnNextBut;
	
	
	@FindBy(css = "div[style='user-select: none']")
	public WebElement clickOnCompose;
	
	
	@FindBy(css = "input#\\:tq")
	public WebElement writeTextInTo;
	
	
	@FindBy(css = "input#\\:q4")
	public WebElement writeTextMail;
	
	@FindBy(css = "div#\\:re")
	public WebElement writeTextMailInBody;
	
	@FindBy(css = "div#\\:pu")
	public WebElement clickOnSend;
	
	
	public void enterMailId(String userid) {
		enterUserEmail.sendKeys(userid);
	}
	
	public void clickOnNextButtonIn() {
		clickOnNextBut.click();
		
	}
	
	public void clickOnComposeButton() {
		clickOnCompose.click();
		
	}
	
	public void textMailInTo(String GmailId) {
		writeTextInTo.sendKeys(GmailId);
	}
	
	public void thisIsTextMail(String subject) {
		writeTextMail.sendKeys(subject);
		
	}
	
	public void textInBody(String body) {
		writeTextMailInBody.sendKeys(body);
		
	}
	
	public void clickOnSendButton() {
		clickOnSend.click();
		
	}
	
	

}
