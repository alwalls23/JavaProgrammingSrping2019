package day27_arrays05;

import java.util.*;

public class BinarySearch {
	public static void main(String[] args) {
		int[] nums = { 1, 3, 5, 35, 69, 88 };
		System.out.println(Arrays.binarySearch(nums, 35));
		System.out.println(Arrays.binarySearch(nums, 69));
		System.out.println(Arrays.binarySearch(nums, 1));
		System.out.println(Arrays.binarySearch(nums, 4));
		
		int i = Arrays.binarySearch(nums,  3);
		System.out.println(i);
		
		//Arrays.binarySearch(a, fromIndex, toIndex, c); comparator
	}
}
