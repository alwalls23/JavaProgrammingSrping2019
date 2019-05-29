package java_homework_assignments;
import java.util.*;	
public class No_84_ZombieAttack1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int inhabitants = scan.nextInt();
	    int day = 0;
	    
//	    do {
//	    	System.out.println("Day"+ day+"["+inhabitants+"]");
//	    	day++;
//	    	inhabitants = inhabitants / 2;
//	    
//	    }while(inhabitants > 0);
//	    
//	    System.out.println("------EXTINCT------");
	    
	    while(inhabitants > 0) {
	    	System.out.println("Day "+day+"["+inhabitants+"]");
	    	day++;
	    	inhabitants = inhabitants / 2;//decrease by half
	    }
	    System.out.println("------EXTINCT------");
//	    
	}
}
