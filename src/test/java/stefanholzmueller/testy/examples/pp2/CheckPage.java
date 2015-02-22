package stefanholzmueller.testy.examples.pp2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckPage {

	@FindBy(id = "attributesInput0")
	private WebElement attribute1;

	private WebDriver driver;

	public CheckPage(WebDriver driver) {
		this.driver = driver;
	}

	void open() {
		driver.get("http://stefanholzmueller.github.io/pp2js/src/check/check.html");
	}

	void enterAttributes(int a1, int a2, int a3) {
		(new WebDriverWait(driver, 2)).until(new ExpectedCondition<Boolean>() {
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
	}

}
