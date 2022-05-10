package com.crm.elotto.SampleTest;

import org.testng.annotations.Test;

public class SampleTest {
	
	@Test(groups = "SmokeTest")
	public void createsampTest()
	{
		System.out.println("Sample created");
	}
	
	@Test(groups = "RegressionTest")
	public void editSampleTest()
	{
		System.out.println("Sample edited");
	}
	
	@Test(groups = "RegressionTest")
	public void deleteSampleTest()
	{
		System.out.println("Sample deleted");
	}

}
