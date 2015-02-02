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

	String csvFile = "../input.csv";
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
			boolean firstTime=true;
			while ((line = br.readLine()) != null) {
				if(firstTime){
					firstTime=false;
					continue;
				}
	 		        // use comma as separator
				String[] attributes= line.split(cvsSplitBy);
				Container tmp=new Container();
				tmp.setId(Initializer.dataContainer.size());
				tmp.setTime(attributes[0]);
				tmp.setX(Double.parseDouble(attributes[1]));
				tmp.setY(Double.parseDouble(attributes[2]));

				tmp.setCourseDegs(Double.parseDouble(attributes[3]));

				tmp.setSpeed(Double.parseDouble(attributes[4]));
				tmp.setBearingDegs(Double.parseDouble(attributes[5]));
				Initializer.dataContainer.add(tmp);
 				
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
//		for(int i=0;i<Initializer.dataContainer.size();i++){
//			System.out.println(Initializer.dataContainer.get(i).getBearingDegs());
//		}
		System.out.println("loading Data Done");
	  
	 
	}
}
