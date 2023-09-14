package Pkg;

import java.io.File;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotPgm {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void scrsht() throws Exception
	{
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scr, new File("D:\\Luminar\\selenium\\error.png"));
	}
}
