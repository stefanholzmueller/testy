package stefanholzmueller.testy.library;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import stefanholzmueller.testy.api.Result;
import stefanholzmueller.testy.api.Validation;

public abstract class AlertValidation implements Validation {

	public abstract Result validate(Alert alert);

	@Override
	public Result execute(WebDriver driver) {
		return validate(driver.switchTo().alert());
	}

}
