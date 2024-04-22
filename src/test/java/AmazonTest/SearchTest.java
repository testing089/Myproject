package AmazonTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Amazon.BaseTest;

public class SearchTest extends BaseTest {
	
	@Test
public void testsearch() {
	search obj=new search(driver);
	obj.Searchsend("iphone");
}
}
