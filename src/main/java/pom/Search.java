package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search
{
	static WebDriver driver;
	@FindBy (xpath="//*[@id='twotabsearchtextbox']")
	private WebElement searchbox;
	
	@FindBy (xpath="//*[@id='nav-search-submit-button']")
	private WebElement search;
	
    @FindBy (xpath="//span[@class='a-price-whole']")
    private	 List<WebElement> price ;
	
	public Search(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	} 
	
	public void Laptop() 
	{
		searchbox.sendKeys("Laptop");
		boolean result = searchbox.isDisplayed();
		System.out.println(result);
		
	} 
	
	public void Search() 
	{
		search.click();
	} 
	
	public void Values() 
	{
	  
	   for (int i=0; i<price.size(); i=i+1) 
	       {
			  System.out.println(price.get(i).getText());          
	       }
		
	}

}
