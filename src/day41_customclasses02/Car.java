package day41_customclasses02;

import java.util.*;

public class Car {
	
		/*
		 * **instance variable/attributes/properties/data;
		 * make
		 * model
		 * currentSpeed
		 * color
		 * 
		 * **Methods
		 * printCarInfo()
		 * "car make[make], model [model], color[color], currentSpeed[currentSpeed]"
		 * 
		 * showCurrentSpeed
		 * return: void
		 * param: int sppdLimit
		 * "make is driving at currentSpeed, following speed limit - 55"
		 * "make is driving at currentSpeed, over the speed limit - 55"
		 *
		 */
		
		String make;
		String model;
		int currentSpeed;
		String color;
		
	public void printCarInfo() {
		String info = "Car make ["+make+"], model["+model+"], color ["+color+"], current speed ["+currentSpeed+"]";
		System.out.println(info);
	}
	public void showCurrentSpeed(int speedLimit) {
		if(currentSpeed <= speedLimit) {
			System.out.println(make+" is driving at "+currentSpeed+" mph, under the speed limit "+speedLimit);
		}else {
			System.out.println(make+" is driving at "+currentSpeed+" mph, over the speed limit - "+speedLimit);
		}
	}
	
	public void drive() {
		System.out.println(make+" is driving ...");
	}
	public void accelerate(int mph) {
		currentSpeed = currentSpeed + mph; //currentSpeed+= mph;
	}
	
}
