package jsummations;
/**
 * Unit Tests for Gauss.java
 * @author Scott Schoeller (sschoellerSTEM)
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class TestGauss {

	@Test
	public void testGauss() {
		
		Gauss g50 = new Gauss(50);
		
		if (g50.getSummation() != 1275)
			fail("Gauss not correctly implemented");
		
		Gauss g100 = new Gauss(100);
		if (g100.getSummation() != 5050)
			fail("Gauss not correctly implemented");

	}

}
