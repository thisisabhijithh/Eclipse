package testpkg;

import org.testng.annotations.Test;

import basepkg.Basetestlogin;
import pagepkg.Loginpage;
import utilities.Excellogin;


public class Studtest extends Basetestlogin {
	@Test
	public void verifyloginWithvalidCred() throws Exception
	{
		Loginpage l1=new Loginpage(driver);
		String x1="D:\\Luminar\\data.xlsx";
		String Sheet="Sheet1";
		int rowCount=Excellogin.getrowCount(x1,Sheet);
		for (int i=1;i<=rowCount;i++)
		{
			String username=Excellogin.getcellvalue(x1, Sheet, i, 0);
			System.out.println("username---"+username);
			String pwd=Excellogin.getcellvalue(x1, Sheet, i, 1);
			System.out.println("Password---"+pwd);
			l1.setvalues(username, pwd);
			l1.login();
		}
	}

	

}
