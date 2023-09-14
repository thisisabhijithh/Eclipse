package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Blazepage {
	WebDriver driver;
	By reginame=By.id("name");
	By compny=By.id("company");
	By emailname=By.id("email");
	By pswrd=By.id("password");
	By confrmpswd=By.id("password-confirm");
	By register=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button");
	public Blazepage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String rname,String compname,String emailid,String psword,String cnfmpsword)
	{
		driver.findElement(reginame).clear();
		driver.findElement(reginame).sendKeys(rname);
		driver.findElement(compny).clear();
		driver.findElement(compny).sendKeys(compname);
		driver.findElement(emailname).clear();
		driver.findElement(emailname).sendKeys(emailid);
		driver.findElement(pswrd).clear();
		driver.findElement(pswrd).sendKeys(psword);
		driver.findElement(confrmpswd).clear();
		driver.findElement(confrmpswd).sendKeys(cnfmpsword);
	}
	public void regist()
	{
		driver.findElement(register).click();
	}
	

}
