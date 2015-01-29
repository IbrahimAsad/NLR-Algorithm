/**
 * 
 */
package algorithm.core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Ibrahim
 *
 */
public class LoadInputFile {

	String csvFile = "../ArcTan_Data.csv";
	BufferedReader br = null;
	String line = "";
	String cvsSplitBy = ",";
	
	/**
	 * 
	 */
	public LoadInputFile() {
		// TODO Auto-generated constructor stub
	}
	
	public void loadFile(){
		try {
			 
			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {
	 		        // use comma as separator
				String[] attributes= line.split(cvsSplitBy);

				for (String string : attributes) {
						System.out.println(string);
				}
				System.out.println("");
				
			}
	 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	 
		System.out.println("Done");
	  
	 
	}
}
