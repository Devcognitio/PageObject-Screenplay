package co.com.devcognitio.certification.screenplay.questions;

import co.com.devcognitio.certification.screenplay.user_interface.YoutubeResultsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheVideoResults implements Question<Integer> {

	@Override
	public Integer answeredBy(Actor actor) {
		return Text.of(YoutubeResultsPage.LIST_OF_VIDEOS).viewedBy(actor).asList().size();
	}

	public static TheVideoResults are() {
		return new TheVideoResults();
	}

}
