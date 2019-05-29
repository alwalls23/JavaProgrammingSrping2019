package day40_customeclasses_methods;

public class BestBuy {
	public static void main(String[] args) {
//		System.out.println(brand);
		// Above line will not work, we need object to use brand
		// Create CellPhone object
		CellPhone cell1 = new CellPhone();
		System.out.println(cell1.brand);
		System.out.println(cell1.screenSize);

		cell1.brand = "Samsung Note 10";
		cell1.screenSize = 6.8;
		cell1.color = "Space Black";
		cell1.price = 1050.00;
		
		System.out.println("#### CELL 1 VALUES ####");
		System.out.println("Brand: " + cell1.brand);
		System.out.println("Screen size: " + cell1.screenSize + "in");
		System.out.println("Phone color: " + cell1.color);
		System.out.println("Phone price: $" + cell1.price);
		
		CellPhone cell2 = new CellPhone();
		cell2.brand = "Siemens";
		cell2.screenSize = 1.5;
		cell2.color = "blue";
		cell2.price = 39.22;
		
		System.out.println("##### CELL 2 VALUES #####");
		System.out.println("Brand: " + cell2.brand);
		System.out.println("screenSize: " + cell2.screenSize);
		System.out.println("color: " + cell2.color);
		System.out.println("price: " + cell2.price);
		
		System.out.println("#### Calling Methods ####");
		cell1.call();
		cell1.message();
		cell1.takeAPhoto();
		
		cell2.call();
		cell2.message();
		cell2.takeAPhoto();
	}
}
