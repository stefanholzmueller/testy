package stefanholzmueller.testy.library;

import org.openqa.selenium.WebElement;

import stefanholzmueller.testy.api.ElementAction;
import stefanholzmueller.testy.api.Finder;

public class Click extends ElementAction {

	public Click(Finder finder) {
		super(finder);
	}

	@Override
	protected void executeAction(WebElement element) {
		element.click();
	}

}
