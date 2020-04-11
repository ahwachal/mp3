package jenkins.model;
import static org.junit.Assert.*;
import org.junit.Test;

public class q4test{
	@Test
	public void testDollarSignZero() {
		IdStrategy.CaseSensitive test = new IdStrategy.CaseSensitive();
		String filename = "test$0030";
		assertEquals(test.idFromFilename(filename), "test0");		
	}
	
	@Test
	public void testDollarSignz() {
		IdStrategy.CaseSensitive test = new IdStrategy.CaseSensitive();
		String filename = "test$007A";
		assertEquals(test.idFromFilename(filename), "testz");		
	}
}