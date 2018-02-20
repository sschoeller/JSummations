package jsummations;
/**
 * A method of calculating finite Arithmetic series, attributed to Gauss
 * @author Scott Schoeller (sschoellerSTEM)
 */
public class Gauss {
	
	private int summation;
	
	public Gauss(int endNum) {
		summation = (1 + endNum)*(endNum/2);
	}
	
	public int getSummation() {
		return this.summation;
	}

}
