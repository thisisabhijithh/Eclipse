package Pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTest {
ChromeDriver driver;
@Before
public void setup()
{
	driver =new ChromeDriver();
	driver.get("https://www.facebook.com");
}
@Test
public void set()
{
	driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("abcdefg");
	driver.findElement(By.name("login")).click();
}
}
