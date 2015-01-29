/**
 * 
 */
package algorithm.core;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * @author Ibrahim
 *
 */
public class CurveGenerator {
	private ArrayList<Container> localData;
	private ArrayList<Curve> curveList=new ArrayList<Curve>();
	
	/**
	 * 
	 */
	public CurveGenerator() {
		// TODO Auto-generated constructor stub
		localData=Initializer.dataContainer;
		getPeroidForTimeAndBearing();
		
	}
	public ArrayList<Curve> getCurveList(){
		return curveList;
	}
	
	
	private void getPeroidForTimeAndBearing(){
		
		curveList.clear();
		DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		
//		System.out.println(();
		
		for(int i=0;i<localData.size()-1;i++){
			try {
				Curve curve=new Curve();
				curve.setTime((int) ((formatter.parse(localData.get(i+1).getTime()).getTime()-formatter.parse(localData.get(i).getTime()).getTime())/1000));
				curve.setBearing(localData.get(i+1).getBearingDegs()-localData.get(i).getBearingDegs());
				curve.setStartTime(localData.get(i).getTime());
				curve.setEndTime(localData.get(i+1).getTime());
				curveList.add(curve);
			
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				System.out.println("FAILD TO PARSE TIME");
				e.printStackTrace();
			}
			
		}
		
		
		
		
		 
		
	}
	
	
	

}
