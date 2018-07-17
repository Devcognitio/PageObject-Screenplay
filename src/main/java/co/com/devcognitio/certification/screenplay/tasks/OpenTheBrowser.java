package co.com.devcognitio.certification.screenplay.tasks;

import co.com.devcognitio.certification.screenplay.user_interface.Webpage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenTheBrowser implements Task {
	
	private Webpage webpage;
	
	public OpenTheBrowser(Webpage webpage) {
		this.webpage = webpage;
	}

	@Override
	@Step("{0} opens the browser on #webpage")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(webpage.page())
                //Click.on(POP_UP)
				);
	}

	public static OpenTheBrowser at(Webpage webpage) {
		return instrumented(OpenTheBrowser.class, webpage);
	}

}
