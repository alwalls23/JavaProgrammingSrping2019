package day47_blocks;

import static java.lang.Math.*;
import static java.lang.Character.*;
import static java.util.Arrays.sort;
import java.util.Arrays;
import static java.time.LocalDateTime.now;

import java.util.Arrays;

public class StaticImports {
	public static void main(String[] args) {
		System.out.println(PI);// pie
		System.out.println(max(10, 5));
		System.out.println(max(10, 10));
		System.out.println(min(10, 100));
		System.out.println(floor(3.45));
		System.out.println(floor(3.67));
		System.out.println(round(3.67));
		System.out.println(abs(-10));
		System.out.println(pow(10, 2));
		System.out.println(sqrt(5));
		System.out.println(sqrt(81));
		System.out.println(random() * 10);
		
		System.out.println(isDigit('4'));
		System.out.println(isAlphabetic('1'));
		
		int[] nums = {34, 23, 44, 11, 444, 1222};
		sort(nums);
		System.out.println(Arrays.toString(nums));
		
		System.out.println(now());
		
	}

}
