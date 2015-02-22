package stefanholzmueller.testy.api;

import org.openqa.selenium.WebDriver;

public interface Step {
	Result execute(WebDriver driver);
}
