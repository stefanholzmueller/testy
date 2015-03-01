package stefanholzmueller.testy.api;

import org.openqa.selenium.WebElement;

public abstract class ElementAction extends ElementStep {

	public ElementAction(Finder finder) {
		super(finder);
	}

	protected abstract void executeAction(WebElement element);

	@Override
	protected boolean execute(WebElement element) {
		executeAction(element);
		return true; // convenience
	}

}
