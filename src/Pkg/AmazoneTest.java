package Pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazoneTest {
ChromeDriver driver;
@Before
public void setup()
{
	driver = new ChromeDriver();
	driver.get("https://www.amazon.com");
}
@Test
public void titleverify()
{
	String title= driver.getTitle();
	System.out.println(title);
	String Ex="Amazon.com. Spend less. Smile more.";
	if (title.equals(Ex))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
}
@Test
public void contentverify()
{
	String content=driver.getPageSource();
	//System.out.println(content);
	String c="Returns";
	if(content.contains(c))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}		
}
}
