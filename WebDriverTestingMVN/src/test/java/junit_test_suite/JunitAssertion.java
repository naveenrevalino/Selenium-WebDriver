package junit_test_suite;

import org.junit.Test;

import junit.framework.Assert;

public class JunitAssertion {
	/**
	 * What this method dose is?
	 * 	1. will compare the Actual title with the Expected title.
	 *  2. If they are same the test will pass else will fail the test.
	 *  3. In this method i have hard coded both the values
	 *  4. The dawback of this conventional method is, even if the test pass or fail the Junit output window will
	 *  	   not capture it.
	 */
	@Test
	public void Title() {
		System.out.println("METHOD 1 : Title()");
		String Actual = "Gmail";
		String Expected = "Gmail.com";
		if (Actual == Expected) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		System.out.println("Test failed but not captured in Junit window.");
		System.out.println("*********************************************");
	}
	
	@Test
	public void Alternate() {
		System.out.println("METHOD 2 : Alternate()");
		String Actual = "Gmail";
		String Expected = "Gmail.com";
		System.out.println("Test Failed");
		System.out.println("Test failed and captured in Junit.");
		System.out.println("The problem in this method is,  if the test fails the codes below the assert will not execute.");
		System.out.println("*********************************************");
		Assert.assertEquals(Expected, Actual);
		System.out.println("0000000000000000000000000000");
		
	}
	
	@Test
	public void Alternate2() {
		System.out.println("METHOD 3 : Alternate2()");
		String Actual = "Gmail";
		String Expected = "Gmail.com";
		System.out.println("Inorder to execute the line below the assert, we modify the code by adding a TRY CATCH ");
		try{
			Assert.assertEquals(Expected, Actual);
		}
		catch (Throwable msg) {
			System.out.println("Test Failed");
			System.out.println("The test failed but not captured in Junit window.");
		}
		System.out.println("**************************************");
		
	}

}
