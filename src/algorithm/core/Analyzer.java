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
		// trying to draw the current curve 
		for(int i=0;i<localCurve.size();i++){
			System.out.println(localCurve.get(i));
		}
		
	}

}
