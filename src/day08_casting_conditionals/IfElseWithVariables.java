package day08_casting_conditionals;

public class IfElseWithVariables {
	public static void main(String[] args) {
		int temperature = 45;
		
		if(temperature >= 75) {
			System.out.println("It is a nice day! Lets code java.");
		}else {
			System.out.println("Stay home and code java.");
		}
	
	
		//2 int variables, teamAScore, teamBScore
		//put a condition. check if teamA won. 
		//"Team A won".
		//Go Team a!
		//else "team b won
		//Go Team B
		//or it was draw
		// Go Teams!
	
		int teamAScore = 21;
		int teamBScore = 17;
		
		if(teamAScore > teamBScore) {
			System.out.println("Team A Won!");
			System.out.println("Go Team A!");
		}else {
			System.out.println("Team B Won or it was a draw");
			System.out.println("Go Teams!");
			
			
		}
	
	}
}
