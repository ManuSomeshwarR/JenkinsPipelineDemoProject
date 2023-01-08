package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2 {

	@Test(priority=1)
	public void test_search() {
		
		System.out.println("*****Search Test Case Passed*****");
		Assert.assertTrue(true);
	}
	
	@Test(priority=2)
	public void test_advSearch() {
		
		System.out.println("*****Advanced search Test Case Passed*****");
		Assert.assertTrue(true);
	}
}
