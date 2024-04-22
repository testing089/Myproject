package AmazonTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Amazon.BaseTest;

public class search {
WebDriver driver;
@FindBy(id="twotabsearchtextbox")
WebElement search;


 public search(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void Searchsend(String iphone) {
	search.sendKeys("iphone");
	
	
}
}
