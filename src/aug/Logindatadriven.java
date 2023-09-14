package aug;

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

public class Logindatadriven {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urload()
	{
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	@Test
	public void main() throws IOException
	{
		File f=new File("D:\\Luminar\\student 1.xlsx");
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
			
			driver.findElement(By.xpath("//*[@id=\"username\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(username);
			driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(pswd);
			driver.findElement(By.id("submit")).click();
			//String actualurl="https://practicetestautomation.com/practice-test-login/";
			String actualurl=driver.getCurrentUrl();
			System.out.println(actualurl);
			String expectedurl="https://practicetestautomation.com/logged-in-successfully/";
			if(expectedurl.equals(actualurl))
			{
				System.out.println("LOGIN SUCCESS");
			}
			else
			{
				System.out.println("LOGIN FAILED");
			}
		}
	}

}
