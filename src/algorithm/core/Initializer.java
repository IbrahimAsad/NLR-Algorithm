/**
 * 
 */
package algorithm.core;

import java.util.ArrayList;

/**
 * @author Ibrahim
 *
 */
public final  class Initializer {
	
	public static String fileName="";
	public static ArrayList<Container >dataContainer=new ArrayList<Container>();
	/**
	 * 
	 */
	public Initializer() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 */
	static public  void setFileName(String filename){
		Initializer.fileName=filename;
	}
	
	/**
	 * 
	 */
	static public String getFileName(){
		return Initializer.fileName;
	}
	
	
	
}
