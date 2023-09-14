package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Blazepage;

public class Blazetest  {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlload()
	{
		driver.get("https://blazedemo.com/register");
	}
	@Test
	public void testregister() throws Exception
	{
		Blazepage bb=new Blazepage(driver);
		bb.setvalues("abhi", "abcd", "abc@gmail.com", "pswrdd", "pswrdd");
		bb.regist();
		driver.navigate().to("https://blazedemo.com/login");
		Blazelogin bl=new Blazelogin(driver);
		bl.setvalues("abc@gmail.com", "pswd");
		bl.loginblaze();
	}
	

}
