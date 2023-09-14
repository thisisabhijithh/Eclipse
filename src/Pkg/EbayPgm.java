package Pkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EbayPgm {
WebDriver driver;
@BeforeTest
public void setup1()
{
	driver=new ChromeDriver();
}
@BeforeMethod
public void set1()
{
	driver.get("https://www.ebay.com/");
}
@Test
public void ebaytest()
{
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); //	implicit wait
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));//EXPLICIT CLASS CREATION
	WebElement electronics=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
	Actions act=new Actions(driver);
	act.moveToElement(electronics).perform();
	//EXPLISIT WAIT
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")));
	driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")).click();
}
}
