package co.com.devcognitio.certification.pageobject.steps;

import co.com.devcognitio.certification.pageobject.pages.GoogleApps;
import co.com.devcognitio.certification.pageobject.pages.GoogleHomePage;
import co.com.devcognitio.certification.pageobject.pages.GoogleTranslatePage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class AUser {

    GoogleHomePage homePage;
    GoogleTranslatePage translatePage;

    @Step
    public void opensTheApplication(GoogleApps app) {
        homePage.openApp(app);
    }

    @Step
    public void translateAWord(String word, String sourceLanguage, String targetLanguage) {
        translatePage.translateWord(word, sourceLanguage, targetLanguage);
    }

    @Step
    public void shouldSeeTheWord(String word) {
        assertThat(translatePage.getTargetLanguageResult(), is(equalTo(word)));
    }
}
