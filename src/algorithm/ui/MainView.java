/**
 * 
 */
package algorithm.ui;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import algorithm.core.Analyzer;
import algorithm.core.Extractor;
import algorithm.core.Initializer;
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
//	Math.atan(arg0)
	}

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		 
			// TODO Auto-generated method stub
		new LoadInputFile().loadFile();
		Extractor a= new Extractor();
//		System.out.println(a.eval());
		
		
//		for(int i=0;i<Initializer.dataContainer.size();i++)
//			System.out.println(Initializer.dataContainer.get(i));
		
		
//		new Analyzer();
		
	}

}
