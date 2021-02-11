package JUnitTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConcatenationTestCase {

	@Test
	void test() 
	{
		//instantiate MyJUnitTest class
		MyJUnitTestClass jUnit = new MyJUnitTestClass();
		
		// use fixtures or test case to test concat() method
		String result = jUnit.concat("Hello " , "World.");
		
		assertEquals("Hello World.", result);
	}

}
