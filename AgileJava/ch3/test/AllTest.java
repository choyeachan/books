import junit.framework.TestSuite;

public class AllTest extends TestSuite {
	public static TestSuite suite(){
		TestSuite suite = new TestSuite();
		suite.addTestSuite(StringTest.class);
		suite.addTestSuite(CharTest.class);
		return suite;
	}
}
