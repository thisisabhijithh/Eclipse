package Pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragdropPgm {
WebDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
}
@BeforeMethod()
public void set()
{
	driver.get("https://demoqa.com/droppable");
}
@Test
public void testt()
{
	WebElement dragbox=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	WebElement dropbox=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
	Actions act= new Actions(driver);
	act.dragAndDrop(dragbox, dropbox);
	act.perform();
	String text=dropbox.getText();
	if(text.equals("Dropped!"))
	{
		System.out.println("Dropped");
	}
	else
	{
		System.out.println("Not expected");
	}
}
}
