package co.com.devcognitio.certification.pageobject.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

import java.util.concurrent.TimeUnit;

@DefaultUrl("http://www.google.com")
public class GoogleHomePage extends PageObject {

    public static final String GOOGLE_APPS = "//*[@id='gbwa']/div[1]/a";
    public static final String GOOGLE_TRANSLATE = "#gb51";
    public static final String YOUTUBE = "#gb36";

    public void openApp(GoogleApps app) {
        open();
        waitForTheApplicationToLoad();
        selectApplication(app);
    }

    private void waitForTheApplicationToLoad() {
        withTimeoutOf(60, TimeUnit.SECONDS).waitFor(GOOGLE_APPS);
    }

    private void selectApps() {
        findBy(GOOGLE_APPS).click();
    }

    private void selectApplication(GoogleApps app) {
        selectApps();
        if(app.equals(GoogleApps.YOUTUBE)) {
            findBy(YOUTUBE).click();
        } else {
            findBy(GOOGLE_TRANSLATE).click();
        }
    }

}
