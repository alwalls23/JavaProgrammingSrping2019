package java_homework_assignments;
import java.util.*;
public class No_72_Email1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String email = scan.next();
	    
	    
	    if(email.contains("_")) {
	    	System.out.println((email.substring(email.indexOf('_')+1, email.indexOf('@')))+"_"+(email.substring(email.indexOf(0)+1, email.indexOf('_'))+"@gmail.com"));
	    }else {
	    	System.out.println(email);
	    }
	    }
}
