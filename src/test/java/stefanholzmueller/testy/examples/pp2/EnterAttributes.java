package stefanholzmueller.testy.examples.pp2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import stefanholzmueller.testy.api.Step;

public class EnterAttributes implements Step {

	@Override
	public boolean execute(WebDriver driver) {
		(new WebDriverWait(driver, 5)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
				WebElement attributeInput = d.findElement(By
						.id("attributesInput0"));
				return attributeInput.isDisplayed();
			}
		});

		for (int i = 0; i < 3; i++) {
			WebElement attributeInput = driver.findElement(By
					.id("attributesInput" + i));
			attributeInput.sendKeys("20");
		}
		return true;
	}

}
