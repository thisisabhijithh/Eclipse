package Pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPgm {
ChromeDriver driver;
@Before
public void setup()
{
	driver =new ChromeDriver();
	driver.get("file:///D:/Luminar/javawork/alert.html");
}
@Test
public void set()
{
	driver.findElement(By.xpath("/html/body/input[1]")).click();
	driver.switchTo().alert().accept();
	/* Alert a = driver.switchTo().alert();
	 String actualtxt = a.getText();
	 if(actualtxt.equals("Hello iam an alert box"))
	 {
		 System.out.println("pass");
	 }
	 else
	 {
		 System.out.println("fail");
	 }
	a.accept();*/
	driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("abhi");
	driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("abcdefg");
}
}
