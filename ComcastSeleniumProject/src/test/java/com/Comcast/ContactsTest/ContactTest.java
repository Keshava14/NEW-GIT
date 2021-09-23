package com.Comcast.ContactsTest;

import org.testng.annotations.Test;

public class ContactTest{
	

	@Test(groups ="SmokeTest")
	public void createContactTest() {
	
		System.out.println("execute createCreate");
	}
	
	@Test(groups ="RegressionTest")
	public void createContactWithOgTest() {
	
		System.out.println("execute createContactWithOgTest");
	}
	@Test(groups ="RegressionTest")
	public void deleteContactTest() {
	
		System.out.println("execute deleteContactTest");
		
	}
}
