package stefanholzmueller.testy.examples;

import org.openqa.selenium.WebDriver;

import stefanholzmueller.testy.api.Result;
import stefanholzmueller.testy.api.Validation;

public class NoErrorValidation implements Validation {

	@Override
	public Result execute(WebDriver driver) {
		return null;
	}

}
