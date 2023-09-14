package Pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReddifPgm2 {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void set()
	
	{
	boolean a=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]")).isSelected();
	if(a)
	{
		System.out.println("Selected");
	}
	else
	{
		System.out.println("Not Selected");
	}
	boolean a1=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
	if(a1)
	{
		System.out.println("Displayed");
	}
	else
	{
		System.out.println("Not Displayed");
	}
	boolean a2=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input")).isSelected();
	if(a2)
	{
		System.out.println("Selected");
	}
	else
	{
		System.out.println("Not Selected");
	}
}
}
