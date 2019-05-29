package day38_arraylist03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSorting {
	public static void main(String[] args) {
		List<Integer> numsList = new ArrayList<>();
		numsList.add(44);
		numsList.add(1);
		numsList.add(4);
		numsList.add(1000);
		numsList.add(3);
		System.out.println(numsList);

		System.out.println("Sorting...please wait...");
		Collections.sort(numsList);

		System.out.println(numsList);

		List<String> strList = new ArrayList<>();
		strList.add("Fuad");
		strList.add("Roman");
		strList.add("Murad");
		strList.add("Muhabbat");
		strList.add("Maria");
		strList.add("Dina");
		strList.add("Bojan");
		strList.add("Anastasia");
		strList.add("Yaroslav");
		System.out.println(strList);
		System.out.println("Sorting...pleas wait...");

		Collections.sort(strList);
		System.out.println(strList);

		// MAX, MIN
		int maxNum = Collections.max(numsList);
		int minNum = Collections.min(numsList);

		System.out.println("maxNum: " + maxNum);
		System.out.println("minNum: " + minNum);

		String maxName = Collections.max(strList);
		String minName = Collections.min(strList);

		System.out.println("maxName: " + maxName);
		System.out.println("minName: " + minName);

		Collections.shuffle(strList);
		System.out.println(strList);
	}
}
