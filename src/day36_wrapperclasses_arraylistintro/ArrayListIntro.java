package day36_wrapperclasses_arraylistintro;

import java.util.ArrayList;

public class ArrayListIntro {
	public static void main(String[] args) {
		
		//Create an arraylist
		String [] str = new String[5];
		ArrayList<String> names = new ArrayList<>();
		
		int[] numsArray = new int[5];
		ArrayList<Integer> nums = new ArrayList<>();
		
		//assign values into arraylist
		names.add("Roman");
		names.add("Ohan");
		names.add("Vlad");
		names.add("Olimjon");
		names.add("Natalia");
		names.add("Maria");
		
		nums.add(100);
//		nums.add(new Integer(100));
		nums.add(99);
		nums.add(656);
		nums.add(8566);
//		nums.add(e);
		
		//read from ArrayList
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		
		System.out.println("Names count: "+names.size());
		System.out.println("Nums count: "+nums.size());
	}
}
