package day31_methods03;

//	print "audi is driving 60 mph

public class Cars {
	public static void drive(String car, int speed) {
		System.out.println(car + " is driving " + speed + " mph");
	}

	public static void main(String[] args) {
		drive("Audi", 60);
	}
}
