package algorithm.core;

public class Curve {

	private int time;
	private double bearing;
	private String startTime;
	private String endTime;
	public Curve() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the time
	 */
	public int getTime() {
		return time;
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(int time) {
		this.time = time;
	}

	/**
	 * @return the bearing
	 */
	public double getBearing() {
		return bearing;
	}

	/**
	 * @param bearing the bearing to set
	 */
	public void setBearing(double bearing) {
		this.bearing = bearing;
	}

	/**
	 * @return the startTime
	 */
	public String getStartTime() {
		return startTime;
	}

	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	/**
	 * @return the endTime
	 */
	public String getEndTime() {
		return endTime;
	}

	/**
	 * @param endTime the endTime to set
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

}
