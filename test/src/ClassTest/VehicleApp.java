package ClassTest;

public class VehicleApp {

	public static void main(String[] args) {
		Vehicle c1=new Car(null, 0.0, 0);
		Vehicle b1=new Motorcycle(null, 0.0, 0);
		
		c1.calculateRentalCost(0);
		b1.calculateRentalCost(0);
	}

}