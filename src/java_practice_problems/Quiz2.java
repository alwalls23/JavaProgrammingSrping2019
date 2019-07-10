package java_practice_problems;

import java.util.ArrayList;

public class Quiz2 {
	public static void main(String[] args) {

		int b = 1;

		ArrayList<Integer> list = new ArrayList<>();

		list.add(3);

		list.add(2);

		list.add(1);

		System.out.println(list.remove(b));

		
		
		Integer a=1;

		ArrayList<Integer> list1= new ArrayList<>();

		list.add(3);

		list.add(2);

		list.add(1);

		System.out.println( list.remove( a ) );
		
		
		ArrayList<String> names = new ArrayList<>();

		names.add("John");

		names.add("James");

		names.add("Aaron");
		
		names.remove("James");
		System.out.println(names);
		
		char A = 'U';

		Numbers(A);
		System.out.println("+++++++++++++++++++++++++++++++++++");
		
		long num = 20L;
		int x = (int)20L;
		
		String totalNumber = "200";
		int Total = new Integer (totalNumber);
//		int Total = Integer.parseInt(totalNumber);
//		int Total = Integer.valueOf(totalNumber);
		System.out.println(Total);
		
		for(int i = 11; i <= 121; i++){
		    if(i % 2 == 1){
		      System.out.print(i +" ");
		    }
		  }
		System.out.println("===============================================");
		char [] letters = {'z','y','x','w','v'};
		
		for (char i = 'z'; i < 'v'; i++) {
			for (int j = 'z'; j < 'v'; j++) {
				System.out.print(i);
				System.out.println(j);
			}
			
		}
		
		
		}
		
		 

		public static void Numbers( int num1) {

		System.out.println("int number: "+num1);

		}

		 

		public static void Numbers( double num1) {

		System.out.println("double number: "+num1);

		}

		 

		public static void Numbers( short  num1) {

		System.out.println("short number: "+num1);

		
	}
		
		}
	


