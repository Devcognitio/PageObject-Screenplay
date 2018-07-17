package co.com.devcognitio.certification.screenplay.model;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.devcognitio.certification.screenplay.model.translate.TranslationExpression;
import co.com.devcognitio.certification.screenplay.tasks.TranslateTheExpression;;

public class TranslateBuilder {
	
	private String word;
	private String sourceLanguage;
	
	public TranslateBuilder the(String word) {
		this.word = word;
		return this;
	}
	
	public TranslateBuilder from(String sourceLanguage) {
		this.sourceLanguage = sourceLanguage;
		return this;
	}
	
	public TranslateTheExpression to(String targetLanguage) {
		return instrumented(TranslateTheExpression.class, new TranslationExpression(word, sourceLanguage, targetLanguage));
	}

}
