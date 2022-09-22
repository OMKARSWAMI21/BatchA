package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon
{
	public static void main(String[] args) throws InterruptedException 
		{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%2F%3F_encoding%3DUTF8%26adgrpid%3D59671903835%26ext_vrnc%3Dhi%26gclid%3DCj0KCQjwl92XBhC7ARIsAHLl9amJRf7U0ChQNPGhEVbWZXELg7fAR4I0V6Wpu84h8NLNPfrP6Yqivy0aAuMYEALw_wcB%26hvadid%3D398134035836%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D20462%26hvnetw%3Dg%26hvpone%3D%26hvpos%3D%26hvptwo%3D%26hvqmt%3De%26hvrand%3D8066103066972377007%26hvtargid%3Dkwd-837441119212%26hydadcr%3D24542_1971411%26ie%3DUTF8%26index%3Daps%26keywords%3Dlogin%2520amazon%2520account%26ref%3Dpd_sl_2cwzc6x246_e%26tag%3Dgooginhydr1-21%26ref_%3Dnav_em_hd_re_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&&ref_%3Dnav_em_hd_clc_signin_0_1_1_32");
		Thread.sleep(2000);
		WebElement usrename =driver.findElement(By.xpath("//input[@type='email']"));
		usrename.sendKeys("8668287428");
		Thread.sleep(2000);
		WebElement signin=driver.findElement(By.xpath("//input[contains(@id,'continue')]"));
		signin.click();
		Thread.sleep(2000);
		WebElement password =driver.findElement(By.xpath("//input[contains(@type,'password')]"));////span[contains(text(),'Login')]
		password.sendKeys("Pass@123");
		Thread.sleep(2000);
		WebElement signin2=driver.findElement(By.xpath("//input[contains(@id,'signInSubmit')]"));
		signin2.click();
		Thread.sleep(2000);
		WebElement AddCart=driver.findElement(By.xpath("//span[contains(@class,'nav-cart-icon nav-sprite')]"));
		AddCart.click();
	
		                         //Need_Help
		
//		WebElement Needhelp=driver.findElement(By.xpath("//span[contains(text(),' Need help?')]"));
//	    Needhelp.click();
 

	

		}
}
