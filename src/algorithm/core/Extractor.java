/**
 * 
 */
package algorithm.core;

import java.util.ArrayList;

/**
 * @author Ibrahim
 *
 */
public class Extractor {

	private double totalError=0;
	private ArrayList<Double> error_List=new  ArrayList<Double>();
	
	private ArrayList<Double> orgBearing = new ArrayList<Double>();
	private ArrayList<Double> currentBearing = new ArrayList<Double>();
	private ArrayList<Container> data=Initializer.dataContainer;
	
	private double B0=-117;
	private double Q=-2;
	private double P=31;
	
	private double tiIncremnt=0.000578703708;
	private double ti=tiIncremnt;
	
	private double atan(double x , double y){
		return Math.atan2(y,x);
	}
	private double sin(double x){
		return Math.sin(x);
	}
	private double cos(double x){
		return Math.cos(x);
	}
	
	private double calculateBi(){
   		return atan((sin(Math.toRadians(B0))) +(P*ti),(cos(Math.toRadians(B0))+(Q*ti)) );

		//		//=DEGREES(ATAN2(SIN(RADIANS(-54))+(7*0.07175925934),COS(RADIANS(-54))+(-27*0.07175925934))
				//=DEGREES(ATAN2(SIN(RADIANS($L$2))+$L$3*C75,COS(RADIANS($L$2))+$L$4*C75))
 	}
	
	/**
	 * 
	 */
	public Extractor() {
		// TODO Auto-generated constructor stub
	}
	
	
	
public double eval(){
	return Math.toDegrees(calculateBi());
	
}
}