package java_homework_assignments;
import java.util.*;
public class SliceNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, digit1, digit2, digit3, digit4, digit5;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your number:");
		num = scan.nextInt();
		digit1 = num / 10000;
		digit2 = (num % 10000) / 1000;
		digit3 = (num % 10000 % 1000) / 100;
		digit4 = (num % 10000 % 1000 % 100) / 10;
		digit5 = (num % 10000 % 1000 % 100 % 10) / 1;
		
		System.out.println(digit1);
		System.out.println(digit2);
		System.out.println(digit3);
		System.out.println(digit4);
		System.out.println(digit5);
				
	}

}
