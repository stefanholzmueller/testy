package stefanholzmueller.testy.api;

import org.openqa.selenium.WebDriver;

public class CompositeStep implements Step {

	private Step[] steps;

	public CompositeStep(Step... steps) {
		this.steps = steps;
	}

	@Override
	public Result execute(WebDriver driver) {
		for (Step step : steps) {
			Result r = step.execute(driver);
			// TODO handle success or failure?
		}
		return null;
	}

}
