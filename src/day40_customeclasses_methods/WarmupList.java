package day40_customeclasses_methods;

import java.util.*;

public class WarmupList {
	public static void main(String[] args) {
		/*
		 * method name: countOccurances 
		 * return: int 
		 * params: arraylist<String> list, string word 
		 * Method counts how many times, word appears in the list, and
		 * returns the count sensitive
		 */
		ArrayList<String> myList = new ArrayList<>();
		myList.add("Moon");
		myList.add("Sun");
		myList.add("Mars");
		myList.add("Saturn");
		myList.add("Venus");
		myList.add("Earth");
		myList.add("Sun");
		myList.add("Pluto");
		myList.add("Mercury");
		myList.add("Jupiter");
		myList.add("Sun");

		String targetWord = "Sun";
		int count = countOccurances(myList, targetWord);
		if (count == 3) {
			System.out.println("Unit test PASS: Count is 3");
		} else {
			System.out.println("Unit Test FAIL: Count is " + count);
			System.out.println("Expected: 3");
			System.out.println("Actual: " + count);
		}

	}

									// [aa, aa, bb, jj, yy]          aa
	public static int countOccurances(ArrayList<String> list, String word) {
		int count = 0;
		for (String str : list) {
			if (str.equals(word)) {
				count++;
			}
		}
		return count;
	}
}
