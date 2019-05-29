package day43_encapsulation_constructor;

public class TelsaDealer {
	public static void main(String[] args) {
		//set the values using "setter" method and read the values using "getters" method
		Tesla tesla = new Tesla();
		tesla.setModel("model 3");
		tesla.setRange(310);
		tesla.setZeroTo60(3.2);
		tesla.setPrice(51450);
		tesla.setSelfDriving(true);
		
		System.out.println("Model: "+tesla.getModel());
		System.out.println("Range: "+tesla.getRange());
		System.out.println("Zero to 60: "+ tesla.getZeroTo60());
		System.out.println("Price: "+tesla.getPrice());
		System.out.println("Self Driving: "+tesla.isSelfDriving());
		
		System.out.println(tesla);//automatically calling toString method
		
		Tesla myTesla = new Tesla();
		myTesla.setTeslaInfo("roadster", 620, 1.9, 200000, true);
		System.out.println(myTesla.toString());
		
		if(tesla.getZeroTo60() > myTesla.getZeroTo60()) {
			System.out.println("Faster model: "+myTesla.getModel());
			System.out.println("0 - 60 speed: "+myTesla.getZeroTo60());
		}else {
			System.out.println("Faster model: "+tesla.getModel());
			System.out.println("0 - 60 speed: "+tesla.getZeroTo60());
		}
		
		/*
		 * static buy
		 * return type: void
		 * params: tesla car
		 * "purchasing + toString value"
		 */
		buy(myTesla);
		buy(tesla);
	}//Main Method	
		public static void buy(Tesla car) {
			System.out.println("Purchasing: "+car.toString());
		}
		/*
		 * testDrive
		 * return Tesla
		 * param: String model
		 * "Iwould like to test dirve - model"
		 * "sure, let me build the ojcet dn return it
		 * create boject with data here and return {Tesla Object};
		 */
		public static Tesla testDrive(String model) {
			System.out.println("Hi, I would like to test drive - "+model);
			System.out.println("Sure, let me build the object and return it momentarily");
			Tesla car = new Tesla();
			car.setTeslaInfo("model x", 310, 2.5, 95000, false);
			return car;
		}
	
}
