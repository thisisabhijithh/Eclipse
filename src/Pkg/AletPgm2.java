package Pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AletPgm2 {
ChromeDriver driver;
@Before
public void setup()
{
	driver =new ChromeDriver();
	driver.get("https://demoqa.com/alerts");
}
@Test
public void set()
{
	driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
	driver.switchTo().alert().dismiss();
}
}
