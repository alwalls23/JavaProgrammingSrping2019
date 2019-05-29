package day41_customclasses02;

public class MyCar {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.make = "Ford";
		car1.model = "Fiesta";
		car1.color = "Red";
		car1.currentSpeed = 55;
		
		car1.printCarInfo();
		
		car1.showCurrentSpeed(70);
		
		car1.drive();
		
		car1.accelerate(20);
		
		BMW bmw = new BMW();
		System.out.println(bmw.make);
		bmw.model = "m3";
		bmw.showPrice();
	}
}
