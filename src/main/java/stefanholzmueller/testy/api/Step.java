package stefanholzmueller.testy.api;

import org.openqa.selenium.WebDriver;

public interface Step {

	boolean execute(WebDriver driver);

	public static void main(String[] args) {
		Step s1 = (WebDriver driver) -> "".equals(driver.getTitle());
	}

}
