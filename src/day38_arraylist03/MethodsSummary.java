package day38_arraylist03;

import java.util.*;

public class MethodsSummary {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("red");
		list1.add("blue");
		list1.add("white");
		list1.add("grey");
		list1.add("black");

		// add method with index: "yellow will be placed to index 0"
		list1.add(0, "yellow");

		// toString method to print all values in same line
		System.out.println(list1.toString());

		// size method
		System.out.println("Number of elements " + list1.size());

		// get method return value from index
		System.out.println("3: " + list1.get(3));
		System.out.println("0: " + list1.get(0));

		// remove using index.removes value from index position
		list1.remove(0);
		System.out.println(list1.toString());

		// remove using value/element. removes element first occurrence
		list1.remove("blue");
		System.out.println(list1.toString());

		// set(index, value) replace certain index with new value
		list1.set(0, "orange");
		System.out.println(list1.toString());
		list1.set(list1.size()-1, "purple");

		// indexOf(value), returns index of value in the list
		System.out.println("grey: " + list1.indexOf("grey"));
		System.out.println("green: " + list1.indexOf("green"));// since "green" is not listed the default index will be
																// -1

		// isEmpty() returns true if list is empty, size ==-
		System.out.println("Is list empty? " + list1.isEmpty());
		System.out.println("is list empty? " + (list1.size() == 0));

		// contains(element) ==> returns true if value is present
		System.out.println("white in list? " + list1.contains("white"));

		List<String> list2 = new ArrayList<>();

		// addAll => adds all values from one list into another
		list2.addAll(list1);
		System.out.println("list2: " + list2.toString());

		// containsAll. check if list has all values of another list
		System.out.println("ContainsAll: " + list1.containsAll(list2));

		// EQUALS(list). checks if 2 lists are exactly equal
		System.out.println("equals: " + list1.equals(list2));
		System.out.println(list1.equals(list2)? "yes it is equal" : "no it is not");//using ternary operator

		list2.add("pink");
		// REMOVE(list). removes all matching values from your list that are in other
		// list
		list2.removeAll(list1);
		System.out.println("list2 after removeAll: " + list2);
		System.out.println("list1: " + list1);

		// addAll(index, list1) adds a new list values starting from given index
		list2.addAll(0, list1);
		System.out.println("list2 after list2.addAll(0, list1): " + list2.toString());

		// CLEAR. cleares a list, removes all values
		list1.clear();
		list2.clear();
		System.out.println("both empty? -" + (list1.isEmpty() && list2.isEmpty()));

	}
}
