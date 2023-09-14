package Pkg;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterdemo {
	@Parameters("a")
	@Test
	public void set(String a)
	{
		System.out.println("value is: " +a);
	
}
}