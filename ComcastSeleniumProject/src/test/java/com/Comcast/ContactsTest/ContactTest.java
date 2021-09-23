package com.Comcast.ContactsTest;

import org.testng.annotations.Test;

public class ContactTest{
	

	@Test(groups ="SmokeTest")
	public void createContactTest() {
	
		String Url = System.getProperty("url");
		String Browser = System.getProperty("browser");
		System.out.println("===="+Browser);
		System.out.println("===="+Url);
		
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
	@Test(groups ="RegressionTest")
	public void searchContactTest() {
	
		System.out.println("execute searchContactTest");
		
	}
	@Test(groups ="RegressionTest")
	public void editContactTest() {
	
		System.out.println("execute editContactTest");
		
	}
}
