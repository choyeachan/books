import junit.framework.TestCase;

public class StringTest extends TestCase {
	public void testString(){
		assertEquals("abcd", "ab".concat("cd"));
		assertEquals("abcdef","abc"+"def");

	}
}
