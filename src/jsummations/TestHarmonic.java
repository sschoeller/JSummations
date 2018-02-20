package jsummations;
/**
 * Unit Tests for Harmonic.java
 * @author Scott Schoeller (sschoellerSTEM)
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class TestHarmonic {

	Harmonic h = new Harmonic();
	
	@Test
	public void testCalculateTerm() throws Exception {
		if (h.calculateTerm(1.0) != 1.0)
			fail("calculateTerm(1.0) does not produce the correct result");

	}

	@Test
	public void testCalculateSeriesBaseCase() throws Exception {
		if (h.calculateSeries(1.0) != 1.0)
			fail("calculateSeries(1.0) does not produce the correct result");

	}
	
	@Test
	public void testCalculateSeriesHalf() throws Exception {
		if (h.calculateSeries(2.0) != 1.5)
			fail("calculateSeries(2.0) does not produce the correct result");

	}

}
