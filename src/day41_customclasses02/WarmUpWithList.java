package day41_customclasses02;
import java.util.*;
public class WarmUpWithList {
	public static void main(String[] args) {
		/*
		 * name: doubleTheList
			return type: List<Integer>
			params: List<Integer> nums
			It will double the values of each element and return it
			
			doubleTheList([3,5,7]); => [6,10,14]
			
			Try solving without creating another arraylist in the method.
		 */
		
		List<Integer> myList = new ArrayList<>();
		myList.add(50);
		myList.add(44);
		myList.add(101);
		System.out.println(doubleTheList(myList));
		
		List<Integer> myList2 = new ArrayList<>();
		myList2.add(50);
		myList2.add(44);
		myList2.add(101);
		List<Integer> newList = doubleTheList(myList2);
		System.out.println(newList);
	}
	/*
	 * [5,2]
	 * [10,4]
	 */
	public static List<Integer> doubleTheList(List<Integer> nums) {
		for(int i = 0; i < nums.size(); i++) {
			nums.set(i, nums.get(i) * 2);
		}
		return nums;
	}
}
