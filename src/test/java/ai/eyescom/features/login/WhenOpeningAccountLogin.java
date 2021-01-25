package ai.eyescom.features.login;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import ai.eyescom.steps.serenity.HomeSteps;
import ai.eyescom.steps.serenity.LoginStep;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class WhenOpeningAccountLogin {
	private static final String account = "thuandq";
	private static final String pass = "thuandq";
	@Managed
	WebDriver driver;
	
	@Steps
	HomeSteps home;

	@Steps
	LoginStep loginSteps;
	@Test
	public void launch_web_application() {
		home.visit_application();
		loginSteps.login_account(account,pass);
	}
	

}
