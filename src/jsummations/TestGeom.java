package jsummations;
/**
 * Unit Tests for Geom.java
 * @author Scott Schoeller (sschoellerSTEM)
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class TestGeom {
	
	private Geom gHalf = new Geom(0.5);
	
	@Test
	public void testCalculateTerm() {

		if (gHalf.calculateTerm(1) != 0.5)
			fail("calculateTerm(1) does not produce the correct result for base 1/2");

	}
	
	@Test
	public void testCalculateSeries0() {
		if (gHalf.calculateSeries(0) != 1.0)
			fail("calculateSeries(0) does not produce the correct result for base 1/2");

	}
	
	@Test
	public void testCalculateSeries1() {
		if (gHalf.calculateSeries(1) != 1.5)
			fail("calculateSeries(1) does not produce the correct result for base 1/2");

	}
	
}
