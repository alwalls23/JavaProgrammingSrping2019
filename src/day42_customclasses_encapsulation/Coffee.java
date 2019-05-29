package day42_customclasses_encapsulation;

public class Coffee {
	/*
	 * instance variables:
	 * 	name
	 * 	size
	 * 	price
	 * 	calories
	 * 
	 * Methods:
	 * 	getCoffeeInfo
	 * 	prints above data
	 * 
	 * set name
	 * void
	 * params 
	 * It will assign newName to name instance variable
	 * -setter methods for other 3 variables
	 * 
	 * setCoffeeInfo:
	 * void
	 * params: String newName, String newSize, double newPrice, int newCal
	 * it will assign 4  values to 4 instance variables.
	 */
	String name;
	String size;
	double price;
	int calories;
	
	public void getCoffeeInfo() {
		String info = name.toUpperCase()+" "+size.toUpperCase()+" $"+price+" "+calories+" CAL";
		System.out.println(info);
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void setSize(String newSize) {
		if(newSize.equalsIgnoreCase("tall") || 
		newSize.equalsIgnoreCase("grande") || 
		newSize.equalsIgnoreCase("venti")) {
		}else {
			System.out.println("ERROR: Invalid Size - " + newSize);
			size = "unknown";
		}

		size = newSize;
	}
	
	public void setPrice(double newPrice) {
		price = newPrice;
	}
	public void setCalories(int newCalories) {
		calories = newCalories;
	}
	
	public void setCoffeeInfo(String newName, String newSize, double newPrice, int newCal) {
		name = newName;
		setSize(newSize);
		price = newPrice;
		calories = newCal;
	}
}
