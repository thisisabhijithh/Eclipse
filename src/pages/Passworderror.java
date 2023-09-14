package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Passworderror {
	WebDriver driver;
	By forgotpswrdlink=By.xpath("//*[contains(text(),'Forgotten password?')]");
	By pswrdid=By.id("identify_email");
	By searchbtn=By.name("did_submit");
	
	public void linkclick()
	{
		driver.findElement(forgotpswrdlink).click();
	}
	public Passworderror(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String mobilenum)
	{
		driver.findElement(pswrdid).sendKeys(mobilenum);
	}
	public void click()
	{
		driver.findElement(searchbtn).click();
	}

}
