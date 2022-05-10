package com.crm.elotto.contactTest;

import org.testng.annotations.Test;

public class ContactTest {
	@Test(groups = "SmokeTest")
	public void contactTest()
	{
		System.out.println("contact created");
		String value=System.getProperty("BROWSER");
		System.out.println(value);
		
	}
	
	@Test(groups = "RegressionTest")
	public void editcontactTest()
	{
		System.out.println("contact edited");
	}
	
	@Test(groups = "RegressionTest")
	public void deletecontactTest()
	{
		System.out.println("contact deleted");
	}
}
