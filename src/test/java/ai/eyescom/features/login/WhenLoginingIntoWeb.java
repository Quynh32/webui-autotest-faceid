package ai.eyescom.features.login;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import ai.eyescom.steps.serenity.HomeSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class WhenLoginingIntoWeb {
	
	private static final String USERNAME = "thuandq";
	private static final String PASSWORD = "thuandq";


	@Managed
	WebDriver driver;
	
	@Steps
	HomeSteps trinhdt;
	
	@Test
	public void launch_web_application() {
		trinhdt.visit_application();
		trinhdt.login_page(USERNAME, PASSWORD);
	}

}
