package testng1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("I am before class");
	}

	@Test
		public void Test11()
		{
			System.out.println("Let's start TestNG");
		}
	@BeforeTest
	public void beforetest()
	{
		System.out.println("I am beforetest");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("I am before method");
	}
	@Test
	public void Test12()
	{
	System.out.println("I can do this");	
	}
	
}



//@BeforeSuite @AfterSuite
//@BeforeTest  @AfterTest
//@BeforeClass  @AfterClass
//@BeforeMethod  @AfterMethod


