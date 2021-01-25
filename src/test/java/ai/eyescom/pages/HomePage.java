package ai.eyescom.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://easy-face.web.app/")
public class HomePage extends PageObject{
	
	private static final String LOGIN_BUTTON = "//*[@class='mat-button-wrapper']";
	private static final String PASSWORD_FIELD = "//input[@id='mat-input-1']";
	private static final String USERNAME_FIELD = "//input[@id='mat-input-0']";
	
	public void enterTextIntoUserName(String userName) {
		element(USERNAME_FIELD).type(userName);
	}	
	
	public void enterTextIntoPassword(String password) {
		element(PASSWORD_FIELD).type(password);
	}
	
	public void clickOnLoginButton() {
		element(LOGIN_BUTTON).click();
	}

}