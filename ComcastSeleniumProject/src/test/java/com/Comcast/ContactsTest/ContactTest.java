package com.Comcast.ContactsTest;

import org.testng.annotations.Test;

public class ContactTest{
	

	@Test(groups ="SmokeTest")
	public void createContactTest() {
	
		System.out.println("Execute createContactTest");

		String BROWSER = System.getProperty("browser");
		String ENV = System.getProperty("url");
		System.out.println("===="+ BROWSER);
		System.out.println("===="+ ENV);
		
	}
	
	@Test(groups ="RegressionTest")
	public void createContactWithOgTest() {
	
		System.out.println("execute createContactWithOgTest");
	}
	@Test(groups ="RegressionTest")
	public void deleteContactTest() {
				
		System.out.println("execute deleteContactTest");
		
	}
	@Test(groups ="RegressionTest")
	public void searchContactTest() {
	
		System.out.println("execute searchContactTest");
		
	}
	@Test(groups ="RegressionTest")
	public void editContactTest() {
	
		System.out.println("execute editContactTest");
		
	}
}
