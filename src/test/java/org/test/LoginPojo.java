package org.test;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends LibGlobal{
	
public LoginPojo() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//a[contains(text(),'Sign In')]")
private WebElement btnLogin;
@FindBy(id="j_username")
private WebElement btnUserName;
@FindBy(id="j_password")
private WebElement btnPassword;
public WebElement getBtnLogin() {
	return btnLogin;
}
public WebElement getBtnUserName() {
	return btnUserName;
}
public WebElement getBtnPassword() {
	return btnPassword;
}
}
