package co.com.devcognitio.certification.screenplay.model.language;

import co.com.devcognitio.certification.screenplay.model.LanguageBuilder;
import co.com.devcognitio.certification.screenplay.user_interface.GoogleTranslatePage;

public class SelectTheLanguage {
	
	public static LanguageBuilder source() {
		return new LanguageBuilder(GoogleTranslatePage.SOURCE_LANGUAGE_OPTION);
	}
	
	public static LanguageBuilder target() {
		return new LanguageBuilder(GoogleTranslatePage.TARGET_LANGUAGE_OPTION);
	}

}
