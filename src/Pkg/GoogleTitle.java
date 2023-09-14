package Pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTitle {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
/*String actualtitle=driver.getTitle();   //TESTING TITLE
System.out.println(actualtitle);
String exp="Google";
if(actualtitle.equals(exp))
{
	System.out.println("Pass");
}
else
{
	System.out.println("Fail");
} */
String contents=driver.getPageSource();  //TESTING CONTENT
//System.out.println(contents);
String ex="Gmail";
if(contents.contains(ex))
{
	System.out.println("Pass");
}
else
{
	System.out.println("Fail");
}
	}

}
