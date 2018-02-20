package jsummations;
/**
 * Interface for situations in which a series must be calculated by term
 * @author Scott Schoeller (sschoellerSTEM)
 *
 */
interface SeriesInterface {
	
	//Calculates an individual term
	double calculateTerm(double term) throws Exception;
	
	//Calculates an entire series
	double calculateSeries(double lastTerm) throws Exception;
	
}
