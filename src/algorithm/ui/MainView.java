/**
 * 
 */
package algorithm.ui;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import algorithm.core.Analyzer;
import algorithm.core.LoadInputFile;

/**
 * @author Ibrahim
 *
 */
public class MainView {

	/**
	 * 
	 */
	public MainView() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		 
			// TODO Auto-generated method stub
		new LoadInputFile().loadFile();
		new Analyzer();
	}

}
