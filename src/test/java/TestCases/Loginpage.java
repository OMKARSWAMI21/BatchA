package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.Search;

public class Loginpage 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.navigate().to("https://www.amazon.in/your-account");
	    //driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    String title = driver.getTitle();
	    System.out.println(title);
	     
	    // verify laptops
	     Search s=new Search(driver);
	     s.Laptop();
	     s.Search();
	     s.Values();
	    


	    
	   
	}

}
