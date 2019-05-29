package java_homework_assignments;

import java.util.*;

public class No_93_PrefixAgain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int n = scan.nextInt();
		int count = 0;
		
		String prefix = str.substring(0,n);
		if(str.substring(n).contains(prefix)) {
			System.out.println(true);
		}else
			System.out.println(false);
	}
}
