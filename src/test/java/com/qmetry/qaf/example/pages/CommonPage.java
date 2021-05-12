package com.qmetry.qaf.example.pages;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Validator;
import static com.qmetry.qaf.automation.core.ConfigurationManager.getBundle;

public class CommonPage extends WebDriverBaseTestPage<WebDriverTestPage> {
	
	
	
	@Override
	public void openPage(PageLocator arg0, Object... arg1) {
		//driver.get(getBundle().getPropertyValueOrNull("env.baseurl"));
		driver.get("/");
		waitForPageToLoad();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	@FindBy(locator= "xpath=//input[@name='email']")
	private QAFWebElement userName;
	
	
	@FindBy(locator= "xpath=//input[@name='password']")
	private QAFWebElement passWord;
	
	
	@FindBy(locator= "xpath=//input[@value='Login']")
	private QAFWebElement loginBtn;
	

	@FindBy(locator= "xpath=//a[text()='Login']")
	private QAFWebElement loginLnk;
	
	@FindBy(locator= "xpath=//span[text()='My Account']")
	private QAFWebElement myAccountLnk;
	

	@FindBy(locator= "xpath=//h2[text()='My Account']")
	private QAFWebElement myAccountHeader;
	
	
	public void enterUserDetails(String user, String pass)
	{
		userName.clear();
		userName.sendKeys(user);
		passWord.clear();
		passWord.sendKeys(pass);
	}
	
	public void clickLoginBtn()
	{
		loginBtn.click();
	}
	
	public void clickMyAccount()
	{
		myAccountLnk.click();
		loginLnk.click();
	}
	
	public void verifyMyAccountHeader()
	{
		Validator.assertTrue(myAccountHeader.isDisplayed(),"My Account Header is NOT displayed in home page",
				"My Account Header is displayed in home page");
	}
	
	

}
