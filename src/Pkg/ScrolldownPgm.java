package Pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScrolldownPgm {
WebDriver driver;
@BeforeTest
public void setup()
{
	driver= new ChromeDriver();
}
@BeforeTest
public void urlload()
{
	driver.get("https://www.amazon.in");
}
@Test
public void test1()
{
	driver.manage().window().maximize();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,1000)", "");
	driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[6]/ul/li[2]/a")).click();
}
}
