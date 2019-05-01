package day30_methods02;
import java.util.*;
public class WarmupMethods {
	public static void main(String[] args) {
		
		print5Stars();//call the method
		//call print5Stars 100 times
		for (int i = 0; i <= 100; i++) {
			print5Stars();
		}
		
		introduce();
		
		
	}
	public static void print5Stars() {
//		for (int i = 0; i <= 100; i++) {
			System.out.println("* * * * *");
//		}		
	}
		//method name: introduce
		//params/args: nothing
		//return type: void
		//create a scanner
		//ask for name and assign to String name
		//then print "Nice to meet you," + name
	public static void introduce() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello, what is your name?");
		String name = scan.next();
		System.out.println("Nice to meet you, "+name);
	}
	
	
}
