package Pkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatadrivenTest {
 WebDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
}
@BeforeMethod
public void urload()
{
	driver.get("https://www.facebook.com");
}
@Test
public void main() throws IOException
{
	File f=new File("D:\\Luminar\\data.xlsx");
	FileInputStream fi=new FileInputStream(f);
	XSSFWorkbook wb= new XSSFWorkbook(fi);
	XSSFSheet sh=wb.getSheet("Sheet1");
	System.out.println(sh.getLastRowNum());
	
	for(int i=1;i<=sh.getLastRowNum();i++)
	{
		String username=sh.getRow(i).getCell(0).getStringCellValue();
		System.out.println("username"+username);
		String pswd=sh.getRow(i).getCell(1).getStringCellValue();
		System.out.println(pswd);
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(pswd);
		driver.findElement(By.name("login")).click();
		String actualurl="https://www.facebook.com";
		//String actualurl=driver.getCurrentUrl();
		//System.out.println(actualurl);
		String expectedurl="https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=120&lwc=1348092";
		if(expectedurl.equals(actualurl))
		{
			System.out.println("login success");
		}
		else
		{
			System.out.println("login failed");
		}
	}
}
}
