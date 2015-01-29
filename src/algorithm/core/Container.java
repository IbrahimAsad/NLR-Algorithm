/**
 * 
 */
package algorithm.core;

/**
 * @author Ibrahim
 *
 */
public class Container {
	//12/01/2010 12:00:00,12000,24000,205,6.17,-153.43
	//Date,X(m),Y(m),Course (Degs),Speed (m/sec),Bearing (degs)
	private int id;
	private String time;
	private double x;
	private double y;
	private double courseDegs;
	private double speed;
	private double bearingDegs;
	
	
	/**
	 * 
	 */
	public Container() {
		// TODO Auto-generated constructor stub
	}



	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}



	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}



	/**
	 * @param time the time to set
	 */
	public void setTime(String time) {
		this.time = time;
	}



	/**
	 * @return the x
	 */
	public double getX() {
		return x;
	}



	/**
	 * @param x the x to set
	 */
	public void setX(double x) {
		this.x = x;
	}



	/**
	 * @return the y
	 */
	public double getY() {
		return y;
	}



	/**
	 * @param y the y to set
	 */
	public void setY(double y) {
		this.y = y;
	}



	/**
	 * @return the speed
	 */
	public double getSpeed() {
		return speed;
	}



	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(double speed) {
		this.speed = speed;
	}



	/**
	 * @return the bearingDegs
	 */
	public double getBearingDegs() {
		return bearingDegs;
	}



	/**
	 * @param bearingDegs the bearingDegs to set
	 */
	public void setBearingDegs(double bearingDegs) {
		this.bearingDegs = bearingDegs;
	}



	/**
	 * @return the courseDegs
	 */
	public double getCourseDegs() {
		return courseDegs;
	}



	/**
	 * @param courseDegs the courseDegs to set
	 */
	public void setCourseDegs(double courseDegs) {
		this.courseDegs = courseDegs;
	}

}
