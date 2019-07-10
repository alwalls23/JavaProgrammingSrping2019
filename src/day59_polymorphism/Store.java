package day59_polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Store {
	public static void main(String[] args) {
		HairSpray hp = new HairSpray();
		hp.catchFire();
		
		Flammable hairsp = new HairSpray();
		hairsp.catchFire();
		//interface			  implementing class/sub class
		Flammable pTank = new PropaneTank();
		pTank.catchFire();
		
		Flammable item;
		item = new HairSpray();
		item = new PropaneTank();
		
		List<Flammable> items = new ArrayList<>();
	}
}
