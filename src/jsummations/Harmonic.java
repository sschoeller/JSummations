package jsummations;
/**
 * Method of calculating Harmonic series and individual terms within the series
 * @author Scott Schoeller (sschoellerSTEM)
 */
public class Harmonic implements SeriesInterface {
		
	public double calculateTerm(double term) throws Exception {
		if (term > 0)
			return (1.0/term);
		else
			throw new Exception("Can\'t divide by zero");
		
	}
	
	public double calculateSeries(double lastTerm) throws Exception {
		//base case
		if (lastTerm == 0.0)
			return 0.0;
		//recursive case
		return calculateSeries(lastTerm-1) + calculateTerm(lastTerm);
		
	}

}
