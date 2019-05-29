package day37_arraylist;

import java.util.ArrayList;

public class Shopping {
	public static void main(String[] args) {

		ArrayList<String> shoppingList = new ArrayList<>(6);
		shoppingList.add("paper towel");
		shoppingList.add("dish soap");
		shoppingList.add("trash bag");
		shoppingList.add("clorox");
		shoppingList.add("gloves");
		shoppingList.add("shovel");

		// print number of items
		int count = shoppingList.size();
		System.out.println("Total count: " + count);

		// print all items in single line
		System.out.println(shoppingList.toString());

		// print first and last item in single line
		System.out.println(shoppingList.get(0) + " and " + shoppingList.get(count - 1));

		// print list removing item from list
		shoppingList.remove("paper towel");
		shoppingList.remove("shovel");
		System.out.println(shoppingList);
		System.out.println(shoppingList.get(0));
		shoppingList.remove(0);
		System.out.println(shoppingList.toString());

		// FOR each loop can be used only for reading
		// we cannot modify list inside for each loop
		for (String item : shoppingList) {
			System.out.println(item);
		}

		// remove all items at once
		shoppingList.clear();
		System.out.println(shoppingList.toString());

	}
}
