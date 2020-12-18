package com.testngconcept;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test12 {
	
	@BeforeMethod
	public void BeforeMethodExecution()
	{
		System.out.println("Execute before Every Test mETHOD");
	}
	
	@Test(priority=1)
	public void FirstTest()
	{
		System.out.println("First test");
	}
	@Test(priority=2)
	public void SecondTest()
	{
		System.out.println("Second Test");
	}
	
	@Test(priority=3)
	public void ThirdTest()
	{
		System.out.println("Third Test");
	}
	
	@Test(priority=4)
	public void FourthTest()
	{
		System.out.println("Fourth Test");
	}
	@Test(priority=5)
	public void FifthTest()
	{
		System.out.println("Fifth Test");
	}
	@Test(priority=6)
	public void SixthTest()
	{
		System.out.println("Sixth Test");
	}
	@Test(priority=7)
	public void SeventhTest()
	{
		System.out.println("Seventh Test");
	}
	@AfterMethod
	public void AfterMethodExecution()
	{
		System.out.println("Execute After Every Tet Methood");
	}

}
