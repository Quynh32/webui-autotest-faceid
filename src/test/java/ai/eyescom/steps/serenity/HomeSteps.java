package ai.eyescom.steps.serenity;

import ai.eyescom.pages.HomePage;
import net.thucydides.core.annotations.Step;

public class HomeSteps {
	
	HomePage onHomepage;
    
	@Step
	public void visit_application() {
		onHomepage.open();

	}

	@Step
	public void login_page(String userName, String password) {
		enter_username(userName);
		enter_password(password);
		click_login();
	}
	
	@Step
	public void enter_username(String userName) {
		onHomepage.enterTextIntoUserName(userName);
		
	}

	@Step
	public void enter_password(String password) {
		onHomepage.enterTextIntoPassword(password);
		
	}
	
	@Step
	public void click_login() {
		onHomepage.clickOnLoginButton();
	}

}