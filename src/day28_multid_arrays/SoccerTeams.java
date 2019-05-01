package day28_multid_arrays;

import java.util.Arrays;

public class SoccerTeams {
	public static void main(String[] args) {			
		//declare MultiD array
		String [] [] teams = new String [2][6]; //[2] teams [6] players each
		teams[0][0] = "Irina";//one row [0] multiple columns [0]-[5] similar to excel grid
		teams[0][1] = "Zarif";
		teams[0][2] = "Cihan";
		teams[0][3] = "Habib";
		teams[0][4] = "Adel";
		teams[0][5] = "Bohan";
		
		teams[1][0] = "Olimjon";//one row [1] multiple columns [0]-[5] similar to excel grid
		teams[1][1] = "Mirshod";
		teams[1][2] = "Usman";
		teams[1][3] = "Nursultan";
		teams[1][4] = "Roman";
		teams[1][5] = "Dmitriy";
		
		System.out.println("First player of first team:");
		System.out.println(teams[0][0]);//Irina
		System.out.println(teams[0][3]);//Habib
		System.out.println(teams[1][5]);//Dmitriy
		
		//Print how many rows/teams/arrays
		System.out.println("Number of rows: "+teams.length);
		System.out.println("People in the first team: "+teams[0].length);
		System.out.println("People in the second team: "+teams[1].length);
		
		System.out.println(Arrays.deepToString(teams));
		
	}
}
