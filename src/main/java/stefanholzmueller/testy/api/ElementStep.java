package stefanholzmueller.testy.api;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class ElementStep implements Step {

	private final Finder finder;

	public ElementStep(Finder finder) {
		this.finder = finder;
	}

	protected abstract Result execute(WebElement element);

	@Override
	public Result execute(WebDriver driver) {
		return execute(finder.find(driver));
	}
}
