package jsummations;
/**
 * A method of calculating geometric series
 * @author Scott Schoeller (sschoellerSTEM)
 */
public class Geom implements SeriesInterface {
	
	private double base;
	
	public Geom(double base) {
		this.base = base;
	}
	
	public double calculateTerm(double term) {
		return (Math.pow(base, term));
	}

	public double calculateSeries(double lastTerm) {
		//base case
		if (lastTerm == 0)
			return 1;
		//recursive case
		return calculateSeries(lastTerm-1) + calculateTerm(lastTerm);
	}
}
