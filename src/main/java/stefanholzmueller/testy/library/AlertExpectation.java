package stefanholzmueller.testy.library;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import stefanholzmueller.testy.api.Expectation;

public abstract class AlertExpectation implements Expectation {

	public abstract boolean validate(Alert alert);

	@Override
	public boolean execute(WebDriver driver) {
		String windowHandle = driver.getWindowHandle();
		Alert alert = driver.switchTo().alert(); // TODO switch back?
		boolean validated = validate(alert);
		driver.switchTo().window(windowHandle);
		return validated;
	}

}
