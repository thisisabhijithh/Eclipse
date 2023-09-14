package testpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Blazelogin {
	WebDriver driver;
	By Loginemail=By.id("email");
	By loginpasrd=By.id("password");
	By loginblaze=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[4]/div/button");
	public Blazelogin(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String emil,String psd)
	{
		driver.findElement(Loginemail).sendKeys(emil);
		driver.findElement(loginpasrd).sendKeys(psd);
		
	}
	public void loginblaze()
	{
		driver.findElement(loginblaze).click();
	}

}
