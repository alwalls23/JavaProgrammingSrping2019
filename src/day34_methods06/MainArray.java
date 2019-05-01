package day34_methods06;
import java.util.*;
public class MainArray {
	
	/*
	 * Method name: getArray
	 * return type: int []
	 * Params: int size
	 * In the method, build array and assign value then return it.
	 */
	public static void main(String[] args) {
		System.out.println(Arrays.toString(CountArray.getArray()));
		
		//store return value into array
		int [] nums = CountArray.getArray();
		System.out.println(Arrays.toString(nums));
		
//		for(;;) { //while(true) ==> both are infinite loop
		System.out.println(Arrays.toString(CountArray.getRandomArray(20)));
//		}
		int [] randomNums = CountArray.getRandomArray(5);
		System.out.println(Arrays.toString(randomNums));
	}
}
