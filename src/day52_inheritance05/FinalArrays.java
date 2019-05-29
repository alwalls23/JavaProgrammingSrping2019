package day52_inheritance05;

import java.util.Arrays;

public class FinalArrays {
	public static void main(String[] args) {
		final int [] TEAMS = {11, 11};
		System.out.println("Team 1 : "+TEAMS[0]);
		System.out.println("Team 2 : "+TEAMS[1]);
		
		TEAMS[0] = 10;
		TEAMS[1] = 9;
		
		System.out.println("Team 1 : "+TEAMS[0]);
		System.out.println("Team 2 : "+TEAMS[1]);
		
		int[] nums = new int [] {23, 55, 35534};
		System.out.println(Arrays.toString(nums));
		
		final int[] finalNums = {23, 66, 44, 11};
		finalNums[0] = 34567;
		System.out.println(Arrays.toString(finalNums));
		
		
	}
}
