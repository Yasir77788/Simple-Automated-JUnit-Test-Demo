package JUnitTestPackage;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
// the test cases to be collectively tested
@SuiteClasses({AdditionTestCase.class, ConcatenationTestCase.class})
public class AllTestCaseSuite 
{

}
