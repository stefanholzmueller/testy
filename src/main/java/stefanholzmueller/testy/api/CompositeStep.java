package stefanholzmueller.testy.api;

import java.util.function.Consumer;
import java.util.function.Function;

import org.hamcrest.CustomTypeSafeMatcher;
import org.openqa.selenium.WebDriver;

public class CompositeStep implements Step {

	private Step[] steps;

	public CompositeStep(Step... steps) {
		this.steps = steps;
	}

	@Override
	public boolean execute(WebDriver driver) {
		for (Step step : steps) {
			boolean result = step.execute(driver);
			if (!result) {
				return false;
			}
		}
		return true;
	}

	public static <T, R> Consumer<T> buildValidationStep(Function<T, R> f,
			Consumer<R> validator) {
		new CustomTypeSafeMatcher<T>("bla") {

			@Override
			protected boolean matchesSafely(T item) {
				// TODO Auto-generated method stub
				return false;
			}

		};
		return (x) -> validator.accept(f.apply(x));
	}
}
