/**
 * 
 */
package algorithm.core;

/**
 * @author Ibrahim
 *
 */
public final  class Initializer {
	
	public static String fileName="";
	
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
