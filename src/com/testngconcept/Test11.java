package com.testngconcept;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test11 {
	
	@BeforeClass
	public void BeforeClassExecution()
	{
		System.out.println("Before class Execute");
	}
	
@BeforeMethod
	public void BeforeMethodExecution()
	{
		System.out.println("Execute before Every Test mETHOD");
	}
	
	@Test
	public void FirstTest()
	{
		System.out.println("First test");
	}
	@Test
	public void SecondTest()
	{
		System.out.println("Second Test");
	}
	
	@AfterClass
	public void AfterClassExecution()
	{
		System.out.println("After Class Execution");
	}
	
	@AfterMethod
	public void AfterMethodExecution()
	{
		System.out.println("Execute After Every Tet Methood");
	}

}
