package day49_inheritance2_2;
import day49_inheritance2.*;
//Non-sub class in different package
public class OverSeasFactory {
	public static void main(String[] args) {
		Device dv = new Device();
		dv.brand = "Samsung";
//		dv.model = "3200"; not visible in this package
//		dv.price = 1000; not visible
//		dv.country = "El Salvador"; not visible
	}
}
