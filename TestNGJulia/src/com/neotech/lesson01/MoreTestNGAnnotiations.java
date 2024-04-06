package com.neotech.lesson01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MoreTestNGAnnotiations {

	
	@BeforeTest
	public void beforeTest () 
	{
		System.out.println("Before test");
	}
	
	@AfterTest
	public void afterTest () 
	{
		System.out.println("After test");
	}
	
	@BeforeClass
	public void beforeClass () 
	{
		System.out.println("Before class");
	}
	
	@AfterClass
	public void afterClass() 
	{
		System.out.println("After class");
	}
	
	 @AfterMethod
	public void afterMethod() 
	{
		System.out.println("After method");
	}
	
	@Test                                             // we can have many test cases inside one class
	public void testOne ( ) 
	{
		System.out.println("test case 1.....");
	}
	
	@Test
	public void testTwo ( ) 
	{
		System.out.println("test case 2.....");
	}
	
	@BeforeMethod
	public void beforeMethod() 
	{
		System.out.println("Before method");
	}
	
	
}
