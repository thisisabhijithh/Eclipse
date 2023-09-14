package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbpage {
	WebDriver driver;
	By fbemail=By.id("email");
	By fbpaassword=By.id("pass");
	By fblogin=By.name("login");
	public Fbpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String email,String password)
	{
		driver.findElement(fbemail).clear();
		driver.findElement(fbemail).sendKeys(email);
		driver.findElement(fbpaassword).clear();
		driver.findElement(fbpaassword).sendKeys(password);
	}
	public void login()
	{
		driver.findElement(fblogin).click();
	}

}
