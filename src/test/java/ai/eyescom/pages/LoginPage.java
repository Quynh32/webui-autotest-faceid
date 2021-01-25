package ai.eyescom.pages;


import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {
	  private static final String LOGIN_BUTTON = "//*[@class='mat-button-wrapper']";
	  private static final String PASSWORD_FIELD = "//*[@id='mat-input-1']";
	  private String string;
	@FindBy(xpath = "//*[@id='mat-input-0']")
	   WebElementFacade ACCOUNT_FIELD;
	   public void enterTextAccount(String account) {
		   ACCOUNT_FIELD.type(account);
	   }
	   public void enterTextPassWord(String password) {
			   $(PASSWORD_FIELD).type(password);
	   }
	   public void enterTextLogin() {
			   element(LOGIN_BUTTON).click();
	   }
	
	

		   
}
