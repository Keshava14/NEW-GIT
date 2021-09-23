package com.Comcast.ContactsTest;

import org.testng.annotations.Test;

public class ContactTest{
	

	@Test(groups ="SmokeTest")
	public void createContactTest() {
	
		System.out.println("execute createCreate");
	}
	
	String Url = System.getProperty("url");
	String browser = System.getProperty("browser");
	
	@Test(groups ="RegressionTest")
	public void createContactWithOgTest() {
	
		System.out.println("execute createContactWithOgTest");
	}
	@Test(groups ="RegressionTest")
	public void deleteContactTest() {
		String Url = System.getProperty("URL");
		String Browser = System.getProperty("browser");
		System.out.println("execute deleteContactTest");
		System.out.println(Browser);
		System.out.println(Url);

		
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
