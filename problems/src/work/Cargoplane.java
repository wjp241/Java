package work;

public class Cargoplane extends Plane {
	Cargoplane(){}
	Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}
	
	public void flight(int distance) {
		super.flight(((distance / 10) * 50));
	}
}
