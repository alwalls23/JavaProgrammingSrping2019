package java_homework_assignments;

import java.util.*;

public class No_104_ArraysHas55 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt() };

		// TODO Type your code below:
		if (nums[0] == 5 && nums[1] == 5) {
			System.out.println(true);
		} else if (nums[1] == 5 && nums[2] == 5) {
			System.out.println(true);
		} else if (nums[2] == 5 && nums[3] == 5) {
			System.out.println(true);
		} else if (nums[3] == 5 && nums[4] == 5) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
