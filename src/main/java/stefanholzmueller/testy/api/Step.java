package stefanholzmueller.testy.api;

import org.openqa.selenium.WebDriver;

public interface Step<R> {
	R execute(WebDriver driver);
}
