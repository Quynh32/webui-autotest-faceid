package ai.eyescom.steps.serenity;

import ai.eyescom.pages.HomePage;
import net.thucydides.core.annotations.Step;

public class HomeSteps {
	
	HomePage onHomepage;
    
	@Step
	public void visit_application() {
		onHomepage.open();
	}
	

}