package java_homework_assignments;
import java.util.*;
public class No_100_ArraysPrinting01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] arr = new String[5];
		for (int i=0;i<5;i++)
		{
			arr[i] = input.nextLine();
		}
		//leave above alone!  write your code below. 
		//Create another loop for your solution!
		
		for (String letter : arr) {
			System.out.println(letter.substring(0, 3));
		}
		
		
		
	}
}
