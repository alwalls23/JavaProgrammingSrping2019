package day23_arrays_and_loops;

public class Arrays1 {
	public static void main(String[] args) {
		int [] numbers = new int [3];
		int num1 = 5;
		int num2 = 7;
		int num3 = 10;
		
		//assign to the first variable value of num1
		numbers[0] = num1;
		numbers[1] = num2;
		numbers[2] = num3;
		
		numbers[0] = 7;
		numbers[1] = 8;
		// we cannot provide different data type, we have to use data type of an array
		//number[2] = 'a'
		numbers[1] = 'A';
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		
		System.out.println("****************************************************");
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		byte[] byteArray = new byte [3];//[Integer.MAX_VALUE-5]
		
		String [] names = new String [5];
		String []names2 = {"Bill", "Roman", "Vlad", "Burok", "Maria"};
		
		System.out.println(names2[4]);
		
//		System.out.println("number of items: "+names2.length);
//		String[]countries = {};
//		double [] values = 
//		Array has fixed size
//		countries[0] = "USA";
//		String name = null;
		//================================================================================
		
		String[]fruits = new String[] {"apple", "orange"};
		//for each loop stands for collections of data
		//we need specify data type, variable name: our collection of data
		for (String fruit: fruits) {
			System.out.println(fruit);
			
		}
	}
}
