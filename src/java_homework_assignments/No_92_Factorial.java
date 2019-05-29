package java_homework_assignments;
import java.util.*;
public class No_92_Factorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    long j = 1L;
	    
	    for(int i = 1; i <= n; i++){
	        j = j * i;
	       
	      }
	       System.out.println(j);
	}
}
