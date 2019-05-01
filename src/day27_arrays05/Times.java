package day27_arrays05;

import java.util.*;

public class Times {
	public static void main(String[] args) {
		// declare 2 int arrays time 1 and time 2.
		// Both of them have 2 items/values that represent hour and minute
		Scanner scan = new Scanner(System.in);

		int[] time1 = new int[2]; // 0,0 by default
		int[] time2 = new int[2]; // 0,0 by default

//		System.out.println(time1[0]); //0

		time1[0] = scan.nextInt();// [0] is representing hours
		time1[1] = scan.nextInt();// [1] is representing minutes

		time2[0] = scan.nextInt();
		time2[1] = scan.nextInt();

		System.out.println("Time 1: " + time1[0] + ":" + time1[1]);

		// Before comparing, check if both arrays have
		// valid hour/minute

		if (time1[0] < 0 || time1[0] > 23) {
			System.out.println("Time1 has invlid hour");
//			return; // break can only be used in switch or loop
		}
		if (time1[1] < 0 || time1[1] > 59) {
			System.out.println("Time1 has invlid minute");
//			return;// stop code
		}
		System.out.println("\nTime 2: " + time2[0] + ":" + time2[1]);

		if (time2[0] < 0 || time2[0] > 23) {
			System.out.println("Time2 has invlid hour");
//			return; // break can only be used in switch or loop
		}
		if (time2[1] < 0 || time2[1] > 59) {
			System.out.println("Time2 has invlid minute");
			return;
		}

		if (time1[0] < time2[0]) {
			System.out.println("Tiime1 is earlier");
		} else if (time2[0] < time1[0]) {
			System.out.println("Time 2 is earlier");
		} else {// hours are equal, check minutes
			if (time1[1] < time2[1]) {
				System.out.println("Time 1 is earlier");
			} else if (time2[1] < time1[1]) {
				System.out.println("Time 2 is earlier");
			} else {
				System.out.println("Same Time!");
			}
		}
	}
}
