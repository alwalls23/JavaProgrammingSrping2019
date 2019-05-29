package day37_arraylist;

import java.util.ArrayList;

public class MyCities {
	public static void main(String[] args) {

		ArrayList<String> cities = new ArrayList<>();
		cities.add("Barnaul");
		cities.add("Dushanbe");
		cities.add("Sterling");
		cities.add("Baku");
		cities.add("Tashkent");
		cities.add("Baku");

		// print each city using for each loop separated by space
		for (String city : cities) {
			System.out.print(city + " ");
		}
		System.out.println();

		// print each city using for loop, separated by space

		for (int i = 0; i < cities.size(); i++) {
			System.out.print(cities.get(i) + " ");
		}
		System.out.println();

		cities.remove("Baku");
		cities.remove("New York");// it will not remove or show error
		System.out.println(cities.toString());
		
		//is Empty
		System.out.println("Is list empty? "+ cities.isEmpty());
		
		//print additional city to the beginning of list
		cities.add(0, "Bishkek");
		System.out.println(cities.toString());
		
		cities.add(1, "Istanbul");
		System.out.println(cities.toString());
		
		cities.set(2, "Seoul");
		System.out.println(cities.toString());
		
		//find index of city
		int idx = cities.indexOf("Sterling");
		System.out.println("Sterling index: "+idx);
		//replace city using new variable
		cities.set(idx, "Zagreb");
		System.out.println(cities.toString());
		
		//clear list and check to see if is empty using boolean
		cities.clear();
		boolean empty = cities.isEmpty();
		System.out.println("City list empty? "+empty);
		
	}
}
