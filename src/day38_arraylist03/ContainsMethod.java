package day38_arraylist03;

import java.util.*;

public class ContainsMethod {
	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Jan");
		list1.add("Feb");
		list1.add("Mar");
		list1.add("Apr");
		list1.add("May");

		System.out.println(list1.toString());
		ArrayList<String> list2 = list1;// list1, list2 points to same object in memory; if a value is changed in list1,
										// then list2 will also change
		System.out.println(list2);
//		list2.set(0, "Dec");
//		System.out.println(list1);
//		System.out.println(list2);

		ArrayList<String> months = new ArrayList<>(list1);// copy all values from list1; if a value is changed in list1,
															// then months will not change
		System.out.println(months);
		months.add("Jun");
		months.add("Jul");
		months.add("Aug");

		// print contains(object element)
		System.out.println(months.contains("Jan"));
		System.out.println(months.contains("Dec"));
		// how would you check if Feb is in second position
		System.out.println(months.indexOf("Feb") == 1);
		System.out.println(months.get(1).contentEquals("Feb"));
		
		ArrayList<String> months2 = new ArrayList<>(list1);
		System.out.println("Months: " +months.toString());
		
		//check if month has all the values on months2
		if(months.containsAll(months2)) {
			System.out.println("Months has all of the Month2");
		}else {
			System.out.println("Some values are missing");
		}
		
		//add one more Jan to month2
		months2.add("Jan");
		if(months.containsAll(months2)) {
			System.out.println("Months has all of the Month2");
		}else {
			System.out.println("Some values are missing");
		}
		
	}
}
