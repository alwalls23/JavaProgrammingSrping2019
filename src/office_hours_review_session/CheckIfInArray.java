package office_hours_review_session;
import java.util.*;
public class CheckIfInArray {
	public static void main(String[] args) {
		int n = 55;
		int nums [] = {22,33,55,22,11,90};
		
		checkArray(n, nums);
	}

	private static void checkArray(int n, int[] nums) {
		boolean present = false;//starting with false - called negative assumption so that once loop is true it will exit the loop
		
		for (int num : nums) {
			if(num == n) {
				present = true;
				break;
			}
		}
		System.out.println("Is "+n+" present? - "+present);
	}
}
