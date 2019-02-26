import junit.framework.TestCase;

public class CharTest extends TestCase {
	public void testChar(){
		char capitalA = 'A';
		assertEquals('\u0041',capitalA);
		assertEquals('\101',capitalA);
	}
}
