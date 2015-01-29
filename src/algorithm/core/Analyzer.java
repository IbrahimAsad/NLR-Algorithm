/**
 * 
 */
package algorithm.core;

import java.util.ArrayList;

/**
 * @author Ibrahim
 *
 */
public class Analyzer {
	private ArrayList<Curve> localCurve;
	/**
	 * 
	 */
	public Analyzer() {
		// TODO Auto-generated constructor stub
		CurveGenerator tmp=new CurveGenerator();
		localCurve=tmp.getCurveList();
		
		
	}

}
