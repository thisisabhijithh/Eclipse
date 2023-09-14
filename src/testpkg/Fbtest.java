package testpkg;
import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Fbpage;
import utilities.Excelutil;
public class Fbtest extends Baseclass{
	@Test
	public void verifyloginWithvalidCred() throws Exception
	{
		Fbpage p1=new Fbpage(driver);
		//reading data elements from excel
		String x1="D:\\Luminar\\data.xlsx";
		String Sheet="Sheet1";
		int rowCount=Excelutil.getrowCount(x1,Sheet);
		for (int i=1;i<=rowCount;i++)
		{
			String username=Excelutil.getcellvalue(x1, Sheet, i, 0);
			System.out.println("username---"+username);
			String pwd=Excelutil.getcellvalue(x1, Sheet, i, 1);
			System.out.println("Password---"+pwd);
			p1.setvalues(username, pwd);
			p1.login();
		}
	}

}
