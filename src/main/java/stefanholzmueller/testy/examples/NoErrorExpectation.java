package stefanholzmueller.testy.examples;

import org.openqa.selenium.WebDriver;

import stefanholzmueller.testy.api.Expectation;

public class NoErrorExpectation implements Expectation {

	@Override
	public boolean execute(WebDriver driver) {
		return !"ERROR".equals(driver.getTitle());
	}

}
