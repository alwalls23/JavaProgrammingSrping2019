package java_homework_assignments;
import java.util.*;
public class ParseHTML {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String html = scan.nextLine();
	    String attributeValue = html.substring(html.indexOf("id=\"")+4, html.indexOf("\">"));
	    
//	    <!DOCTYPE html><html><head><title>Java</title></head><body><p id="myid"></p></body></html>
	    if(html.contains("id=\""+attributeValue)) {
	    	System.out.println(attributeValue);
	    }else {
	    	System.out.println("Invalid input!");
	    }
	    
//	    <!DOCTYPE html><html><head><title>Coding is a POWER</title></head><body><div class="container"><a href="http://www.fb.com" id="fb">Clicki Here!</a></div></body></html>
	}
}
