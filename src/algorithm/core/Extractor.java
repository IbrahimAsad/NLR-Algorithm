/**
 * 
 */
package algorithm.core;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

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
	
	private double bestB0=0;
	private double bestQ=0;
	private double bestP=0;
	
	private double bestError=999999;
	
	
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
		DecimalFormat x=new DecimalFormat("###.############");
		return atan((sin(Math.toRadians(B0))) +Double.parseDouble(x.format(P*ti)),(cos(Math.toRadians(B0))+Double.parseDouble(x.format(Q*ti))));

		//		//=DEGREES(ATAN2(SIN(RADIANS(-54))+(7*0.07175925934),COS(RADIANS(-54))+(-27*0.07175925934))
				//=DEGREES(ATAN2(SIN(RADIANS($L$2))+$L$3*C75,COS(RADIANS($L$2))+$L$4*C75))
 	}

	/**
	 * 
	 */
	public Extractor() {
		// TODO Auto-generated constructor stub
//		evaluateDataSet();
		startFinding();
	}
	private void incrementTime(){
		this.ti+=this.tiIncremnt;
	}
	
	public void evaluateDataSet(){
		for(int i=2;i<data.size();i++){
			double orgB=data.get(i).getBearingDegs();
			double curB=eval();
			orgBearing.add(orgB);
			currentBearing.add(curB);
			double curError=Math.pow((curB-orgB), 2);
			totalError+=curError;
			error_List.add(curError);
			incrementTime();
			
		}
//		for(int i=0;i<orgBearing.size();i++){
////			System.out.println(orgBearing.get(i) +" - "+ currentBearing.get(i) +"= "+error_List.get(i));
////			System.out.println(currentBearing.get(i));
//		}
////		System.out.println("total erros "+);
//		System.out.println(Q+","+P+","+B0+ " error ="+totalError+  " , BEST= "+bestError);
//		System.out.println();
//		System.out.println("B0="+B0);
		
		if(totalError<bestError){
			System.out.println(bestError);
			bestError=totalError;
			bestB0=B0;
			bestQ=Q;
			bestP=P;
			System.out.println("GREAAAT NEWS");	
			System.out.println(bestError);

//			waitResponse();
		}
		
//		changeNumbers();
		
		reset();
//		evaluateDataSet();
	}
	private void startFinding(){
		
		for(int iq=-200; iq <= 200 ; iq++){
			for(int ip=-200;ip<=200;ip++){
				for(int ib0=-200;ib0<=200;ib0++){
					B0=ib0;
					P=ip;
					Q=iq;
					evaluateDataSet();
				}
			}

			System.out.println(bestQ+","+bestP+","+bestB0+ " error ="+totalError+  " , BEST= "+bestError);
		}
		
		System.out.println("bestError "+bestError);
		System.out.println("B0 =" +bestB0);
		System.out.println("Q ="+bestQ);
		System.out.println("P ="+bestP);
		
		
		
		
//		Q++;
//		B0--;
//		P+=2;
//		Q=Math.random();
//		B0=Math.random();
//		P=Math.random();
	}
	private void reset(){
		error_List.clear();
		currentBearing.clear();
		orgBearing.clear();
		totalError=0;
		ti=tiIncremnt;
	}
	
	public void waitResponse(){
		Scanner x=new Scanner(System.in);
		x.nextInt();
	}
	
	public double eval(){
		return Math.toDegrees(calculateBi());
		
	}
	
	
}
