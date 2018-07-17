package co.com.devcognitio.certification.pageobject.step_definitions;

import co.com.devcognitio.certification.pageobject.pages.GoogleApps;
import co.com.devcognitio.certification.pageobject.steps.AUser;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class GoogleTranslateStepDefinitions {

	@Steps
	AUser susan;
	
	@Given("^that Susan wants to translate a word$")
	public void thatSusanWantsToTranslateAWord() throws Exception {
		susan.opensTheApplication(GoogleApps.TRANSLATE);
	}

	@When("^she translates the word (.*) from (.*) to (.*)$")
	public void sheTranslatesTheWordCheeseFromEnglishToSpanish(String word, String sourceLanguage, String targetLanguage) throws Exception {
		susan.translateAWord(word, sourceLanguage, targetLanguage);
	}

	@Then("^she should see the word (.*) in the screen$")
	public void sheShouldSeeTheWordQuesoInTheScreen(String expectedWord) throws Exception {
		susan.shouldSeeTheWord(expectedWord);
	}

}
