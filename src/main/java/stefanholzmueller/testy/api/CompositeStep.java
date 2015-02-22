package stefanholzmueller.testy.api;

import org.openqa.selenium.WebDriver;

public class CompositeStep<R> implements Step<R> {

	private Step<R>[] steps;

	public CompositeStep(Step<R>... steps) {
		this.steps = steps;
	}

	public CompositeStep(Step<Void> action, Step<R> noErrorValidation) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public R execute(WebDriver driver) {
		for (Step<R> step : steps) {
			R r = step.execute(driver);
		}
		return null;
	}

}
