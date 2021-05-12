package com.qmetry.qaf.example.steps;

import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;

import org.openqa.selenium.Keys;

import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.example.pages.CommonPage;

public class CommonPageSteps{

	public static CommonPage commonPage;
	
	@QAFTestStep(description = "Naviagte to URL")
	public static void openUrl() {
		
		commonPage = new CommonPage();
		
		commonPage.openPage(null, "");
		
		
	}
	
	
	@QAFTestStep(description = "User click on myaccount")
	public static void clickMyAccountLink() {
		
		commonPage = new CommonPage();
		commonPage.clickMyAccount();
		
		
	}
	
	
	@QAFTestStep(description = "User enter {UserName} and {PassWord}")
	public static void login(String userName, String passWord) {
		
		commonPage = new CommonPage();
		commonPage.enterUserDetails(userName, passWord);
	
	}
	
	@QAFTestStep(description = "User click on login button")
	public static void clickLoginButton() {
		
		commonPage = new CommonPage();
		commonPage.clickLoginBtn();
		
		
	}
	
	@QAFTestStep(description = "Verify My Account Header is displayed")
	public static void verifyMyAccountHeader() {
	
		commonPage = new CommonPage();
		commonPage.verifyMyAccountHeader();
		
		
	}
}
