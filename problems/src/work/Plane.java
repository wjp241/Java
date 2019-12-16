package work;

abstract public class Plane {
	private String planeName;
	private int fuelSize;
	public Plane(){};
	public Plane(String planeName, int fuelSize) {
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}
	
	public String getPlaneName() { 
		return this.planeName;
	}
	
 public void setPlaneName(String planeName) {
	 this.planeName = planeName;
	 }

	public int getFuelSize() {
		return this.fuelSize;
	}
	
	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}
	
	public void refuel(int fuel) {
		setFuelSize(getFuelSize() + fuel);
	}
	
	public void flight(int distance) {
		setFuelSize(getFuelSize() - distance);
	}
	
}
