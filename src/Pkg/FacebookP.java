package Pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookP {
ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
}
@Test
public void set()
{
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc");
driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("passss");
}
}