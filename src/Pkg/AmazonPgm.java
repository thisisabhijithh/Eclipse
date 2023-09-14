package Pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPgm {
ChromeDriver driver;
@Before
public void setup()
{
	driver =new ChromeDriver();
	driver.get("https://www.amazon.in");
}
@Test
public void set()
{
	driver.manage().window().maximize();
	//driver.findElement(By.xpath("//div[@id='nav-xshop']//a[5]")).click();
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobile",Keys.ENTER);
    driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
    driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.co");
    driver.findElement(By.xpath("//input[@id='continue']")).click();
    driver.navigate().back();
    driver.navigate().back();
    driver.findElement(By.xpath("//div[@id='nav-xshop']//a[2]")).click();
    driver.findElement(By.xpath("//div[@id='nav-main']//a[1]")).click();
   


}
}
