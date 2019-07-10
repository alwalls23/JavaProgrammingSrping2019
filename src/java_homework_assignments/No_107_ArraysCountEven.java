package java_homework_assignments;

import java.util.*;

public class No_107_ArraysCountEven {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt() };

		// TODO: Write your code below
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 0 || i == 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
