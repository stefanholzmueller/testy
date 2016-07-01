package stefanholzmueller.testy.api;

import org.openqa.selenium.WebDriver;

public class Executor {

	private WebDriver driver;

	public Executor(WebDriver driver) {
		this.driver = driver;
	}

	public void execute(Step step) {
		step.execute(driver);
	}

	public void shutdown() {
		driver.close();
	}

}
