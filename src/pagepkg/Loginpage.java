package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	WebDriver driver;
	By studentname=By.id("username");
	By studdpaassword=By.id("password");
	By studsubmit=By.id("submit");
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String uname,String pword)
	{
		driver.findElement(studentname).clear();
		driver.findElement(studentname).sendKeys(uname);
		driver.findElement(studdpaassword).clear();
		driver.findElement(studdpaassword).sendKeys(pword);
		
	}
	public void login()
	{
		driver.findElement(studsubmit).click();
	}

}
