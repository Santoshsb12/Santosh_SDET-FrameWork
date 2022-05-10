package com.crm.elotto.OrganisationTest;

import org.testng.annotations.Test;

public class OrganisationTest {
	@Test(groups = "SmokeTest")
	public void createorgTest()
	{
		System.out.println("Organisation created");
	}
	
	@Test(groups = "RegressionTest")
	public void editOrgTest()
	{
		System.out.println("Organisation edited");
	}
	
	@Test(groups = "RegressionTest")
	public void deleteOrgTest()
	{
		System.out.println("Organisation deleted");
	}

}
