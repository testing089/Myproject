package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	public static WebDriver driver;

	@BeforeTest
	public static void AmazonHomepage() {

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

	}

	@AfterTest
	public  static void teardown() {

		driver.quit();
	}

}
