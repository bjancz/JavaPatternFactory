package pl.bjsoft.factory;

public class FactoryTest {

	public static void main(String[] args) {
		VehicleFactory vehicleFactory = new VehicleFactory();
		Vehicle veh = vehicleFactory.getVehicle("Ford");

		System.out.println(veh.getType());
	}
}
