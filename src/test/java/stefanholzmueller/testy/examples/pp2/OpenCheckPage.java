package stefanholzmueller.testy.examples.pp2;

import org.openqa.selenium.WebDriver;

import stefanholzmueller.testy.api.Action;

public class OpenCheckPage implements Action {

	@Override
	public boolean execute(WebDriver driver) {
		driver.get("http://stefanholzmueller.github.io/pp2js/");
		return true;
	}

}
