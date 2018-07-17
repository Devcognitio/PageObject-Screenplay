package co.com.devcognitio.certification.pageobject.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class GoogleTranslatePage extends PageObject {

    public static final String SOURCE_LANGUAGE_OPTION = "#gt-sl-gms";
    public static final String TARGET_LANGUAGE_OPTION = "#gt-tl-gms";
    public static final String SOURCE_LANGUAGE = "//div[@id='gt-sl-gms-menu']/table/tbody/tr/td//div[contains(text(), '%s')]";
    public static final String TARGET_LANGUAGE = "//div[@id='gt-tl-gms-menu']/table/tbody/tr/td//div[contains(text(), '%s')]";
    public static final String SOURCE_LANGUAGE_TEXTAREA = "#source";
    public static final String TRANSLATE = "#gt-submit";
    public static final String TARGET_LANGUAGE_RESULT = "#gt-res-dir-ctr";

    private WebElementFacade sourceLaguage(String name) {
        return $(String.format(SOURCE_LANGUAGE, name));
    }

    private WebElementFacade targetLanguage(String name) {
        return $(String.format(TARGET_LANGUAGE, name));
    }

    private void selectSourceLanguage(String language) {
        $(SOURCE_LANGUAGE_OPTION).click();
        sourceLaguage(language).waitUntilClickable().then().click();
    }

    private void selectTargetLanguage(String language) {
        $(TARGET_LANGUAGE_OPTION).click();
        targetLanguage(language).waitUntilClickable().then().click();
    }

    private void selectTranslateButton() {
        findBy(TRANSLATE).click();
    }

    private void typeWord(String word) {
        $(SOURCE_LANGUAGE_TEXTAREA).type(word);
    }

    public void translateWord(String word, String sourceLanguage, String targetLanguage) {
        selectSourceLanguage(sourceLanguage);
        selectTargetLanguage(targetLanguage);
        typeWord(word);
        selectTranslateButton();
    }

    public String getTargetLanguageResult() {
        return findBy(TARGET_LANGUAGE_RESULT).waitUntilVisible().then().getText();
    }
}
