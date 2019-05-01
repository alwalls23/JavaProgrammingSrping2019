package java_homework_assignments;

import java.util.*;

public class LaptopRequirements {
	public static void main(String[] args) {
		double price = 0;
		double screenSize = 0;
		String storageType, screenType, cpu;
		int ram = 0;
		int memory = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("Select screen size:");
		screenSize = scan.nextDouble();
		if (screenSize == 13.3) {

			price += 200.0;
		} else if (screenSize == 15.0) {
			price += 300.0;
		} else if (screenSize == 17.3) {
			price += 400.0;
		}

		System.out.println("Select CPU type:");
		cpu = scan.next();
		if (cpu.equalsIgnoreCase("i3")) {
			price += 150.0;
		} else if (cpu.equalsIgnoreCase("i5")) {

			price += 250.0;
		} else if (cpu.equalsIgnoreCase("i7")) {
			price += 350.0;
		}

		System.out.println("Select RAM size:");
		ram = scan.nextInt();
		if (ram > 4) {
			price += (ram / 4) * 50.0;
		} else if (ram == 4) {
			price += 50.0;
		}

		System.out.println("Select storage type:");
		storageType = scan.next();
		if (storageType.equalsIgnoreCase("HDD")) {
		} else if (storageType.equalsIgnoreCase("SSD")) {
		}

		System.out.println("Enter memory size:");
		memory = scan.nextInt();
		if (storageType.equalsIgnoreCase("HDD") && memory > 500) {
			price += (memory / 500) * 50.0;
		} else if (storageType.equalsIgnoreCase("HDD") && memory == 500) {
			price += 50.0;
		}

		if (storageType.equalsIgnoreCase("SSD") && memory > 500) {
			price += (memory / 500) * 100.0;
		} else if (storageType.equalsIgnoreCase("SSD") && memory == 500) {
			price += 100.0;
		}

		System.out.println("Enter screen resolution:");
		screenType = scan.next();
		if (screenType.equalsIgnoreCase("FULLHD")) {
			price += 100.0;
		} else if (screenType.equalsIgnoreCase("4K")) {
			price += 200.0;
		}

		System.out.println("Laptop price is: $" + price);

	}
}
