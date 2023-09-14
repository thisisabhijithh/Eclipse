package Pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkPgm2 {
ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
}
@Test
public void set()
{
	List<WebElement> lnk = driver.findElements(By.tagName("a"));
	System.out.println("Total no of link: "+lnk.size());
	for(WebElement a:lnk)
	{
		String link = a.getAttribute("href");
		String text = a.getText();
		System.out.println(link+"---"+text);
	}
}
}
