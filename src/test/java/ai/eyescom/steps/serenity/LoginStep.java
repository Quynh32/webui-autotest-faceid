package ai.eyescom.steps.serenity;

import ai.eyescom.pages.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginStep {
	LoginPage onLoginPage;
	@Step
	public void  login_account(String account,String password )
	{
		enter_text_account(account);
		enter_text_password(password);
		enter_text_login();
	}
	@Step
	public void enter_text_password(String password) {
		onLoginPage.enterTextPassWord(password);
	}
	@Step
	public void enter_text_account(String account) {
		onLoginPage.enterTextAccount(account);
		
	}
	@Step
	public void enter_text_login() {
		onLoginPage.enterTextLogin();
		
	}
}
