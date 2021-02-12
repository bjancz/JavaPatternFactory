package pl.bjsoft.factory;

public class VehicleFactory {

	public Vehicle getVehicle(String make) {
		switch (make) {
		case "Renault":
			return new Renault();
		case "Porsche":
			return new Porsche();
		case "Ford":
			return new Ford();
		default:
			return new Renault();
		}
	}

}
