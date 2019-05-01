package day34_methods06;
import java.util.*;
import java.util.Random;
public class CountArray {

	/*
	 * Class CountArray
	 * Method findOccurences 
	 * Return type: int Params. int [] array, int value 
	 * Method will look for value in the array and 
	 * return the count occurrences
	 */
	public static void main(String[] args) {
		int [] nums = {2,3,4,5,5,6,6,6,7,5,5,12};
		//1. with Print return right away
		System.out.println(findOccurrences(nums, 5));
		System.out.println(findOccurrences(nums, 6));
		//2. assign return value into a variable
		int five = findOccurrences(nums, 5);
		System.out.println("5 values: "+ five);
		if(five > 0) {
			System.out.println("We have 5s");
		}else {
			System.out.println("No 5s");
		}
		if(findOccurrences(nums, 2) > 0) {
			System.out.println("We have 2s");
		}else {
			System.out.println("No 2s");
		}
		//create array and pass to method
		int twenty = findOccurrences(new int [] {10,20,20,30,55,22}, 20);
		System.out.println("Twenty: "+twenty);
	}
	
	public static int findOccurrences(int[] array, int value) {
		int counter = 0;
		for (int num : array) {
			if (num == value) {
				counter++;
			}
		}
		return counter;
	}
	/*
	 * Method name: getArray
	 * return type: int []
	 * Params: int size
	 * In the method, build array and assign value then return it.
	 */

	public static int [] getArray() {
		int [] retArray = {45,43,11,545,1000};
		return retArray;
	}
	/*
	 * Method name: getRandomArray
	 * Return type: int[]
	 * Params: int size
	 * In this method create an array with value of size and assign random values from 0-100 and return it
	 */
	
	public static int [] getRandomArray(int size) {
		Random rand = new Random();
		int [] nums = new int [size];
		for(int i = 0; i < size; i++) {
			nums[i] = rand.nextInt(101);
			}
		return nums;
		
	}
}
