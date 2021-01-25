package ai.eyescom.features.brower;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import ai.eyescom.steps.serenity.HomeSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class WhenOpeningTheWeb {
	
	@Managed
	WebDriver driver;
	
	@Steps
	HomeSteps trinhdt;
	
	@Test
	public void launch_web_application() {
		trinhdt.visit_application();
	}

}
