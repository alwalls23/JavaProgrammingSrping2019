package office_hours_review_session;

import java.util.*;

public class ArrayOrder {
	public static void main(String[] args) {
		int[] nums = new int[] { 1, 1, 4, 5, 6, 7, 12 };
		int[] nums2 = new int[] { 1, 4, 6, 3, 7, 12 };
		int[] nums3 = {433,12,5};
		
		boolean sorted = assortedArray(nums);
		isArraySorted(nums3);
		isArraySorted(new int [] {10,33});
		
		for (int i = 0; i < nums2.length - 1; i++) {
			System.out.println(nums2[i] + " " + nums2[i + 1]);
			if (nums2[i] > nums2[i + 1]) {
				sorted = false;
				break;// exit the loop
			}
		}
		System.out.println("Array is sorted? - " + sorted);
	}

	public static boolean assortedArray(int[] nums) {
		boolean sorted = true;

		for (int i = 0; i < nums.length - 1; i++) {
			System.out.println(nums[i] + " " + nums[i + 1]);
			if (nums[i] > nums[i + 1]) {
				sorted = false;
				break;// exit the loop
			}
		}
		System.out.println("Array is sorted? - " + sorted);
		return sorted;
	}

	// Method accepts array of ints
	public static void isArraySorted(int[] nums3) {
		boolean sorted = true;
		for (int i = 0; i < nums3.length - 1; i++) {
			System.out.println(nums3[i] + " " + nums3[i + 1]);
			if (nums3[i] > nums3[i + 1]) {
				sorted = false;
				break;// exit the loop
			}
		}
		System.out.println("Array is sorted " + sorted);
	}
}
