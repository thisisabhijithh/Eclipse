package aug;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepicker {
	
	WebDriver driver;
	@BeforeTest
	public void setuo()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void urlload()
	{
		
		driver.manage().window().maximize();
		driver.get("https://www.booking.com/");
		
	}
	@Test
	public void testdate()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().refresh();
		driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[2]/div/div[1]/button[1]")).click();
		while(true)
		{
			WebElement month=driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/h3"));
			String month1=month.getText();
			if(month1.equals("August 2023"))
			{
				System.out.println(month1);
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/button/span/span/svg")).click();
			}
		}
			List<WebElement> alldates1=driver.findElements(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/table/tbody/tr/td/span/span"));
			for (WebElement dateelement:alldates1)
			{
				String date=dateelement.getText();
				if(date.equals("20"))
				{
					System.out.println(date);
					
					dateelement.click();
					break;
				}
			}
		
	
	}
}
