package com.testngconcept;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test13 {
	
	@BeforeMethod
	public void BeforeMethodExecution()
	{
		System.out.println("Execute before Every Test mETHOD");
	}
	
	@Test()
	public void FirstTest()
	{
		System.out.println("First test");
	}
	@Test(dependsOnMethods="FirstTest")
	public void SecondTest()
	{
		System.out.println("Second Test");
	}
	
	@Test(dependsOnMethods="SecondTest")
	public void ThirdTest()
	{
		System.out.println("Third Test");
	}
	
	@Test(dependsOnMethods="ThirdTest")
	public void FourthTest()
	{
		System.out.println("Fourth Test");
	}
	@Test(dependsOnMethods="FourthTest")
	public void FifthTest()
	{
		System.out.println("Fifth Test");
	}
	@Test(dependsOnMethods="FifthTest")
	public void SixthTest()
	{
		System.out.println("Sixth Test");
	}
	@Test(dependsOnMethods="SixthTest")
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
