package Pkg;

import org.testng.annotations.Test;

public class TestingGrouping {
@Test(groups= {"sanity"})  //GROUPING TEST
public void main1()
{
	System.out.println("main 1");
}
@Test(groups= {"smoke","regression"})
public void main2()
{
	System.out.println("main 2");
}
@Test(groups= {"sanity","smoke"})
public void main3()
{
	System.out.println("main 3");
}
@Test(groups= {"regression"})
public void main4()
{
	System.out.println("main 4");
}
@Test(groups= {("smoke")})
public void main5()
{
	System.out.println("main 5");
}
}
