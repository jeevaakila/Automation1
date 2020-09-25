package com.pages.facebook;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.facebook.AutoConstant;
import com.generics.facebook.BasePage;
import com.generics.facebook.ExcelLibrary;

public class FacebookSignupPage extends BasePage implements AutoConstant
{
	@FindBy (xpath="//a[@data-testid='open-registration-form-button']")
	private WebElement createanaccountbutton;
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstnameTextfield;

	@FindBy(xpath="//input[@name='lastname']")
	private WebElement surnameTextfield;

	@FindBy(xpath="//input[@name='reg_email__']")
	private WebElement emailidTextfield;
	
	@FindBy(xpath="//input[@name='reg_email_confirmation__']")
	private WebElement retypeemailtextfield;

	@FindBy(xpath="//input[@id='password_step_input']")
	private WebElement passwordTextfield;

	@FindBy(xpath ="//select[@name='birthday_day']")
	private WebElement birthdaydropdownlist;

	@FindBy(xpath="//select[@id='month']")
	private WebElement monthdropdownlist;

	@FindBy(xpath="//select[@id='year']")
	private WebElement yeardropdownlist;

	@FindBy(xpath="(//input[@type='radio'])[1]")
	private WebElement femaleradiobutton;

	@FindBy(xpath = "(//button[@type='submit'])[1]")
	private WebElement Signupbutton;


	public FacebookSignupPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);

	}

	public void submitdetails() throws IOException
	{
		createanaccountbutton.click();
		firstnameTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 1, 0));
		surnameTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 1, 1));
		emailidTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 1, 2));
		retypeemailtextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 1, 2));
		passwordTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 1, 3));
		selectbyvalue(birthdaydropdownlist, "6");
		selectbyvisibletext(monthdropdownlist, "Apr");
		selectbyvalue(yeardropdownlist, "2007");
		femaleradiobutton.click();
		Signupbutton.click();
		
	}
}



