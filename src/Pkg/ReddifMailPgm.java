package Pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReddifMailPgm {
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
	WebElement button =driver.findElement(By.xpath("//*[@id=\"Register\"]"));
	String text = button.getAttribute("value");
	if(text.equals("Create my account >>"))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
}
}
