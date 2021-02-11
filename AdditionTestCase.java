package JUnitTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AdditionTestCase 
{

	@Test
	void addTest() 
	{
		//instantiate MyJUnitTest class, where the method to be
		// tested is located.
		MyJUnitTestClass jUnit = new MyJUnitTestClass();
		
		// use fixtures or test case to test add() method
		int result = jUnit.add(100, 200);
		assertEquals(300, result);
	
	}
}
