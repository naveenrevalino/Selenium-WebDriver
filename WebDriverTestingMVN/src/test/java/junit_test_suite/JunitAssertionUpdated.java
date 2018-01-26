package junit_test_suite;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import junit.framework.Assert;

public class JunitAssertionUpdated {
	@Rule
	public ErrorCollector errorcollector = new ErrorCollector();
	@Test
	public void Title() {
		String Actual = "Gmail";
		String Expected = "Gmail.com";
		System.out.println("Inorder to execute the line below the assert, we modify the code by adding a TRY CATCH ");
		try{
			Assert.assertEquals(Expected, Actual);
		}
		catch (Throwable errormsg) {
			System.out.println("Test Failed, hence using ErrorCollector Object to report the error to Junit.");
			errorcollector.addError(errormsg);
		}
		System.out.println("**************************************");
		
	}

}
