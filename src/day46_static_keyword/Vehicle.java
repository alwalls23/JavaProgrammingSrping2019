package day46_static_keyword;

public class Vehicle {
	String type; // instance variable, every object has its own type
	static int numberOfVehicles;// static variable - shared, one central value

	public static void vehicleInfo() {
		// System.out.println("type: "+type); < will not compile. type is non-static
		System.out.println("number of vehicles: " + numberOfVehicles);
		int count = getNumberOfVehicles();
		String make = "Kia";
		make = make.toUpperCase();
		System.out.println("make: " + make);
		//System.out.println(toString()); cannot call non-static method
	}

	public static int getNumberOfVehicles() {
		return numberOfVehicles;
	}

	public String toString() {
		return "Vehicle type: " + type + " | count:" + numberOfVehicles;
	}
}
