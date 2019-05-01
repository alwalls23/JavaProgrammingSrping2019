package day29_methods01;
import java.util.*;
public class CountriesArray {
	public static void main(String[] args) {
//										  0			1
		String [] [] countriesArray = {{"USA","Washington DC"},//0
									   {"Canda","Ottawa"},		//1
									   {"Mexico", "Mexico City"},//2
									   {"Brazil","Brasilia"},	//3
									   {"Peru","Lima"},			//4
									   {"Argentina","Buenes Aries"},//5
									   {"Bolivia","La Paz"},	//6
									   {"Macedonia","Skopje"},	//7
									   {"Kazakhastan","Nursultan"}//8
										};
		//String [] [] c = new String[9][2];
		//c[0] [0] = "USA"; c [0] [1] = "Washington DC";
		//print USA with Capital city
		System.out.println(countriesArray[0][0] +"|"+countriesArray[0][1]);//USA | Washington DC
		System.out.println(countriesArray[8][0] +"|"+countriesArray[8][1]);//Kazakhastan | Nursultan
		System.out.println(Arrays.deepToString(countriesArray));
		
		//print all the countries in same line separated by |
		//1) for loop
		
		for (int i = 0; i < countriesArray.length; i++) {
			System.out.print(countriesArray[i][0]+"|");
		}
		
		//2) for each loop
		System.out.println();
		for (String[] country : countriesArray) {
			System.out.print(country[0]+"|");
		}
		
		//get all the Cities and add to cities [] array
		System.out.println();
		String [] cities = new String[countriesArray.length];
		System.out.println(Arrays.toString(cities));//null means no object. it is not same as empty string
		for (int i = 0; i < countriesArray.length; i++) {
			cities[i] = countriesArray[i][1];
		}
		System.out.println(Arrays.toString(cities));
		
		//Look for Bolivia in the countires Arr and test if 
		//capital city is "La Paz"
		System.out.println();
		for (int row = 0; row < countriesArray.length; row++) {
			if(countriesArray[row][0].equals("Bolivia")) {
//				System.out.println(countriesArray[row][1]);
				if(countriesArray[row][1].contentEquals("La Paz")) {
					System.out.println("Bolivia test passed");
				}else {
					System.out.println("Bolivia test failed");
				}
				break;//exit the loop
				
			}
		}
		
	}
}
