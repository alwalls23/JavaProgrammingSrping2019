package day64_collections01;

import java.util.*;

public class ArrayVsArrayList {
	public static void main(String[] args) {
		//Arrays are fixed size
		//Keeps ordering
		//Allows primitives and objects
		
		int[] numsArray = {30, 50, 5011};
		
		String[] days = new String [7];
		days[0] = "Monday";
		days[1] = "Tuesday";
		
		//ArrayList
		//ArrayList<Integer> numsList = new ArrayList<>();
		List<Integer> numsList = new ArrayList<>();
		numsList.add(44);
		numsList.add(44);
		numsList.add(101);
		
		System.out.println(numsArray[0]);
		System.out.println(numsList.get(0));
		
		System.out.println(Arrays.toString(numsArray));
		System.out.println(numsList.toString());
		
		
		
		
	}
}
