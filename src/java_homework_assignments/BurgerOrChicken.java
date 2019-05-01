package java_homework_assignments;
import java.util.*;
public class BurgerOrChicken {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    String in = s.next();
	    float price = (float) 10.0;
	    
	    if(in.equals("burger") || in.equals("chicken")) {
	    	System.out.println("output: "+ price);
	    }else if(in.equals("soda")) {
	    	System.out.println("output: "+ (price - 8.0));
	    }
	    
	    
	}
}
