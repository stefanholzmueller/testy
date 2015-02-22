package stefanholzmueller.testy.api;

import org.openqa.selenium.WebElement;

public abstract class ElementAction extends ElementStep<Void> {

	public ElementAction(Finder finder) {
		super(finder);
	}

	protected abstract void executeAction(WebElement element);
	
	@Override
	protected Void execute(WebElement element) {
		executeAction(element);
		return null;
	}

}
