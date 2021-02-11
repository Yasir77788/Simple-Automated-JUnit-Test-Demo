package JUnitTestPackage;

//Simple class with two methods to be tested using JUnit test
public class MyJUnitTestClass
{
	
	// simple addition method to test
	public int add(int a, int b)
	{
		return a + b;
	}
	
	// simple concatenation method to test
	public String concat(String str1, String str2)
	{
		return str1 + str2;
	}
}