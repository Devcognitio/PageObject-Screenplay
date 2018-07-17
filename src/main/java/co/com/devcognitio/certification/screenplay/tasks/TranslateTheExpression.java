package co.com.devcognitio.certification.screenplay.tasks;

import static co.com.devcognitio.certification.screenplay.user_interface.GoogleTranslatePage.SOURCE_LANGUAGE_TEXTAREA;
import static co.com.devcognitio.certification.screenplay.user_interface.GoogleTranslatePage.TRANSLATE;

import co.com.devcognitio.certification.screenplay.model.language.SelectTheLanguage;
import co.com.devcognitio.certification.screenplay.model.translate.TranslationExpression;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class TranslateTheExpression implements Task {
	
	private TranslationExpression translationExpression;

	public TranslateTheExpression(TranslationExpression translationExpression) {
		this.translationExpression = translationExpression;
	}

	@Override
	@Step("{0} attempts to translate the #translateExpression")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(SelectTheLanguage.source().called(translationExpression.getSourceLanguage()),
				SelectTheLanguage.target().called(translationExpression.getTargetLanguage()),
				Enter.theValue(translationExpression.getWord()).into(SOURCE_LANGUAGE_TEXTAREA),
				Click.on(TRANSLATE));
	}

}
