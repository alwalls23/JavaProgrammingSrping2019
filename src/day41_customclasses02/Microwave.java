package day41_customclasses02;

public class Microwave {
	/*
	 * Microwave
	 * brand
	 * isOn
	 * 
	 * Methods:
	 * turnOn - "Turning on the microwave" - if already on ==? "It is alrady on"
	 * turnOff - Turning off the microwave" if already off = > "It is already off"
	 * hear(food) = if on = "Heating the pizza" if off => "Microwave is off, cannot heat pizza"
	 */
	
	String brand;
	boolean isOn;//default is false
	
	public void turnOn() {
		if(isOn) {
			System.out.println(brand+ " microwave is already ON");
		}else {
			System.out.println("Turning on "+brand+" microwave");
			isOn = true;
		}
	}
	public void turnOff() {
		if(isOn == false) {
			System.out.println(brand+ " microwave is already OFF");
		}else {
			System.out.println("Turning OFF "+brand+" microwave was one");
			isOn = false;
		}
	}
	public void heat(String food) {
		if(isOn) {
			System.out.println("Heating " + food);
		}else {
			System.out.println("Microwave is OFF, cannot heat " + food);
		}
	}
}
