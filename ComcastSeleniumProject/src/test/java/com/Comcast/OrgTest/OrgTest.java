package com.Comcast.OrgTest;

import org.testng.annotations.Test;

public class OrgTest{
	

	@Test(groups ="SmokeTest")
	public void createOrgTest() {
	
		System.out.println("execute createCreate");
	}
	
	@Test(groups ="RegressionTest")
	public void createOrgWithInduTest() {
	
		System.out.println("execute createContactWithOgTest");
	}
	@Test(groups ="RegressionTest")
	public void deleteOrgTest() {
	
		System.out.println("execute deleteContactTest");
		
	}
}
