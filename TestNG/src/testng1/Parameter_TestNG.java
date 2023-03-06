package testng1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parameter_TestNG 
{
	@Parameters({"URL"})
@Test 
public void ParameterMethod(String url)
{
System.out.println("URL==" +url);	}
	
	@Parameters({"URL"})
	@Test
	public void Parameter2(String urlname )
	{
	System.out.println(urlname);	
	}
}

