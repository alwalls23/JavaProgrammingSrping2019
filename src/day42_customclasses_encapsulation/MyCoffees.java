package day42_customclasses_encapsulation;

public class MyCoffees {
	public static void main(String[] args) {
		Coffee coffee1 = new Coffee();
		coffee1.name = "ICED CARAMEL MACCHIATO";
		coffee1.size = "GRANDE";
		coffee1.price = 4.76;
		coffee1.calories = 250;
		
		coffee1.getCoffeeInfo();
		
		Coffee coffee2 = new Coffee();
		coffee2.setName("JAVA CHiP");
		coffee2.size = "venti";
		coffee2.price = 5.95;
		coffee2.calories = 600;
		
		coffee2.getCoffeeInfo();
		
		Coffee coffee3 = new Coffee();
		coffee3.setName("iced coffee");
		coffee3.setSize("tall");
		coffee3.setPrice(2.45);
		coffee3.setCalories(60);
		
		System.out.println("coffee3 name: "+coffee3.name);
		coffee3.getCoffeeInfo();
		
		Coffee coffee4 = new Coffee();
		coffee4.setCoffeeInfo("flat white", "grande", 5.50, 400);
	}
}
