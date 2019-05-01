package day30_methods02;

import java.util.Random;

public class MyNumbers {
	 public static void main(String[] args) {
		
		//methond name: showMe5numbers
		//return type: void
		//params: no
		//prints 5 random numbers.0, 1000 in same line separated by comma
		//ex: showMe5Numbers(); 345, 234, 566, 2, 23
	
		 showMe5Numbers();
		 
	 }
	 public static void showMe5Numbers() {
		 Random r = new Random();
		 for (int i = 1; i <= 5; i++) {
			System.out.print(r.nextInt(1001)+" ");//print random num 0-1000
		}
		 System.out.println();//take it to new line
	}
}
