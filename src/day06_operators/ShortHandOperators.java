package day06_operators;

public class ShortHandOperators {
	public static void main(String[] args) {
		int students = 45;
		
		System.out.println("Students: " + students);
		
		students = students + 5;
		System.out.println("Students: " + students);
		
		students = students -2;
		
		System.out.println("Students: " + students);
		
		int teachers = 10;
		System.out.println("Teacher: " + teachers);
		
		teachers+=2;
		//teachers = teachers + 2
		//teachers = teachers + 2
		System.out.println("Teachers: " + teachers);
		
		//teachers = teachers -5;
		teachers-=5;
		System.out.println("Teachers: " + teachers);
		
		int cars = 12;
		System.out.println("Cars: " + cars);
		
		cars*=2;   //cars = cars * 2;
		System.out.println("Cars: " + cars);
		
		cars+= cars;
		System.out.println("Cars: " + cars);
		
		int shoes = 20;
		shoes/=4; //shoes = shoes / 4
		System.out.println("Shoes: " + shoes);
		
		double price = 45.50;
		int amount = 5;
		price += amount;
		System.out.println(price);
		
		int minutes = 66; // minutes = minutes % 60;
		minutes %=60;
		System.out.println("Remaining: " + minutes);
		
		int pennies = 550;
		pennies %= 100; //pennies = pennies % 100;
		System.out.println("Pennies: " + pennies);
		
		int apples = 10;
		apples =-3; //assign -3 to apples
		System.out.println(apples);
		
		
	}

}
