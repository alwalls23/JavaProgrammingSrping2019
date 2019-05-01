package day27_arrays05;
import java.util.*;
public class ArraysClass {
	public static void main(String[] args) {
		int [] nums = {43,12,4,1,3,5};
		//toString method
		System.out.println(Arrays.toString(nums));
		String str = Arrays.toString(nums);
		System.out.println(str);
		
		//sort method. sorts array in ascending order
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		String [] languages = {"Zulu", "Spanish", "Italian", "English", "Polish", "Arabic", "Uzbek"};
		System.out.println(Arrays.toString(languages));
		Arrays.sort(languages);
		System.out.println(Arrays.toString(languages));
		
		int [] nums2 = {345,665,3333,11,3,66};
		//find lowest and largest values from nums2 array
		
		Arrays.sort(nums2);
		int lowest = nums2[0];
		int largest = nums2[nums2.length-1];
		
		System.out.println("Lowest num: "+lowest);
		System.out.println("Largest num: "+largest);
	}
}
