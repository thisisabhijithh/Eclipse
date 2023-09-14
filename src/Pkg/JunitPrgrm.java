package Pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitPrgrm {
@Before
public void browseropen()
{
	System.out.println("Browser Open");
}
@Test
public void titleverify()
{
	System.out.println("Test Activities");
}
@Test
public void contet()
{
	System.out.println("Test content");
}
@After
public void browserclose()
{
	System.out.println("Browser Closed");
}
}
