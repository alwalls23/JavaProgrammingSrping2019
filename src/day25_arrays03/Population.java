package day25_arrays03;

public class Population {
	public static void main(String[] args) {
		int [] population = new int [5]; 
		population[0] = 12500;
		population[1] = 98700;
		population[2] = 246800;
		population[3] = 864200;
		population[4] = 468000;		
		
//		int [] population = {12500, 98700, 246800, 864200, 468000}; //the order of the variables listed are important

		System.out.println(population[0]);
		System.out.println("City 0 population :"+population[0]);
		System.out.println("City 1 population :"+population[1]);
		System.out.println("City 2 population :"+population[2]);
		System.out.println("City 3 population :"+population[3]);
		System.out.println("City 4 population :"+population[4]);
		
		
		System.out.println();
		
		int idx = 0;
		System.out.println("City 0 population :"+population[idx]);
		
		idx++;
		System.out.println("City 1 population :"+population[idx]);
		
		String str = "abc";												//the length of abc is 3, population [3] = 864200
		System.out.println("City STR.LENGTH population :"+population[str.length()]);
		
		System.out.println();
		
		int [] population2 = {100000, 900000, population[2], 800000, 400000};
		
		System.out.println(population2[2]);
		
		System.out.println();
		
		//String array called cities = "Miami", "London", "Tokyo", "Rome", "New York"
		
		String [] cities = {"Miami", "London", "Tokyo", "Rome", "New York"};
		
		//Population of Miami is 12500
		//Population of London is 98700
		//Population of Tokyo is 246800
		//Population of Rome is 864200
		//Population of New York is 468000
		
		System.out.println("Population of "+cities[0]+" is "+population[0]);
		System.out.println("Population of "+cities[1]+" is "+population[1]);
		System.out.println("Population of "+cities[2]+" is "+population[2]);
		System.out.println("Population of "+cities[3]+" is "+population[3]);
		System.out.println("Population of "+cities[4]+" is "+population[4]);
		
	}
}
