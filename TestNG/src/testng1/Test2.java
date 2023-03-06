package testng1;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test2 {
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("I am aftersuite");
	}
	@Test
		public void Test21()
		{
		System.out.println("Hello! How are you?");	
		Assert.assertTrue(false);
		}
	@BeforeSuite
	public void beforesuite()
	{
	System.out.println("I am in Beforesuite");	
	}
	
	@Test
public void Test22()
{
	System.out.println("My name is Mamta");
}

}
