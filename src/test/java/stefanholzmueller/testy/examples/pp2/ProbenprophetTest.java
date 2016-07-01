package stefanholzmueller.testy.examples.pp2;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import stefanholzmueller.testy.api.Executor;

public class ProbenprophetTest {

	private static Executor executor;

	@BeforeClass
	public static void start() {
		FirefoxDriver driver = new FirefoxDriver();
		executor = new Executor(driver);
	}

	@Before
	public void enterCheckPage() {
		executor.execute(new OpenCheckPage());
	}

	@Test
	public void enterAttributes() throws Exception {
		executor.execute(new EnterAttributes());
	}

	@AfterClass
	public static void cleanup() {
		executor.shutdown();
	}

}
