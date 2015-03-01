package stefanholzmueller.testy.api;

import org.openqa.selenium.WebDriver;

public interface Retrieval<R> {

	R retrieve(WebDriver driver);

}
