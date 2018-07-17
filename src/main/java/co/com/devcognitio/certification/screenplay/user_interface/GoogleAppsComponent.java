package co.com.devcognitio.certification.screenplay.user_interface;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class GoogleAppsComponent {
	
	public static final Target GOOGLE_APPS = Target.the("Google Apps Button").locatedBy("//*[@id='gbwa']/div[1]/a");
	public static final Target GOOGLE_TRANSLATE = Target.the("Google Translate Option").located(By.id("gb51"));
	public static final Target YOUTUBE = Target.the("Youtube Option").located(By.id("gb36"));

}
