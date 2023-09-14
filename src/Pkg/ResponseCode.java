package Pkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResponseCode {
ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
}
@Test
public void linkcount()
{
	driver.get("https://www.google.com");
	List <WebElement> li = driver.findElements(By.tagName("a"));
	System.out.println("total link: "+li.size());
	for(WebElement s:li)
	{
		String link = s.getAttribute("href");
		Verify(link);
	}
}	
	public void Verify(String link)
	{
		try
		{
			URL ob=new URL(link);
			HttpURLConnection con=(HttpURLConnection)(ob.openConnection());
			con.connect();
			if(con.getResponseCode()==200)
			{
				System.out.println("Valid--"+link);
			}
			else if(con.getResponseCode()==404)
			{
				System.out.println("Broken Link--"+link);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	
}
}


		
	


