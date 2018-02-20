package jsummations;
/**
 * Main menu for calculating finite cases of summation series
 * @author Scott Schoeller (sschoellerSTEM)
 */

import javax.swing.*;

class TestAll {

	boolean runTests() {
		try {
			return org.junit.runner.JUnitCore.runClasses(TestGauss.class, TestGeom.class, TestHarmonic.class).wasSuccessful();
		} catch (Exception ex) {
			return false;
		} // end try-catch
	}
}

class GUI {
// NOTE:	 The startup check error dialog is directly in the main method;
// all other GUI components are here

	int selectOption() {
		
		try {
			int opt = Integer.parseInt( JOptionPane.showInputDialog("Enter: 1 for Gauss\'s shortcut, 2 for Geometric Series, 3 for Harmonic Series", 0) );
			return opt;
		} catch (Exception ex) {
			return 0;
		} // end try-catch
		
	} // end selectOption()
	
	void runGauss() {
		int end = Integer.parseInt( JOptionPane.showInputDialog("Enter the end number in the series", 1) );
		Gauss ga = new Gauss(end);
		displayResult( ga.getSummation() );
		
	} // end runGauss(int end)
		
	void displayResult(int Result) {
		JOptionPane.showMessageDialog(null, Result + "", "Calculation Result", JOptionPane.PLAIN_MESSAGE);
	}
	
	void displayResult(double Result) {
		JOptionPane.showMessageDialog(null, Result + "", "Calculation Result", JOptionPane.PLAIN_MESSAGE);
	}
	
}

public class Main {

	public static void main(String[] args) throws Exception {
		// run unit tests on start-up
		TestAll ta = new TestAll();
		if (ta.runTests() == false) {
			JOptionPane.showMessageDialog(null, "ERROR: Program failed startup checks!", "Program Will Exit!", JOptionPane.ERROR_MESSAGE, null);
			System.exit(1);
		}
		
		// invoke GUI methods if unit tests pass
		int selOpt = 0;
		GUI g = new GUI(); 
		
		do {
			selOpt = g.selectOption();
		} while (selOpt != 1 && selOpt != 2 && selOpt != 3);
		
		switch (selOpt) {
			case 1:
				g.runGauss();
				break;
			case 2:
				break;
			case 3:
				break;
		}
			
	}

} // end Main
