package stefanholzmueller.testy.api;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class ElementStep<R> implements Step<R> {

	private final Finder finder;
	
	public ElementStep(Finder finder) {
		this.finder = finder;
	}

	protected abstract R execute(WebElement element);

	@Override
	public R execute(WebDriver driver) {
		return execute(finder.find(driver));
	}
}
