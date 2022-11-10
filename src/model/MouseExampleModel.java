package model;

public class MouseExampleModel {
	private int x,y;
	private int count;
	private String checkIn;//yes,no;
	public MouseExampleModel() {
		super();
		this.x = 0;
		this.y = 0;
		this.count = 0;
		this.checkIn = "no";
	}
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}
	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}
	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}
	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}
	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}
	/**
	 * @return the checkIn
	 */
	public String getCheckIn() {
		return checkIn;
	}
	/**
	 * @param checkIn the checkIn to set
	 */
	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}
	public void increaseClick() {
		this.count++;
	}
	public void enter() {
		
	}
	public void exist() {
		
	}
}
