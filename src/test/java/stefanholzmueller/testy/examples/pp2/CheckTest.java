package stefanholzmueller.testy.examples.pp2;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class CheckTest {

	private static FirefoxDriver driver = new FirefoxDriver();
	private static CheckPage page;

	@BeforeClass
	public static void start() {
		page = PageFactory.initElements(driver, CheckPage.class);
	}

	@Before
	public void enterCheckPage() {
		page.open();
	}

	@Test
	public void enterAttributes() throws Exception {
		page.enterAttributes(1, 2, 3);
	}

	@AfterClass
	public static void cleanup() {
		driver.close();
	}

}
