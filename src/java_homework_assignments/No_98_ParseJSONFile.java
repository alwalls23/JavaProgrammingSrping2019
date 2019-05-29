package java_homework_assignments;
import java.util.*;
public class No_98_ParseJSONFile {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String json = scan.nextLine();
	  String firstName = json.substring(json.indexOf("firstName")+13, json.indexOf("\","));
	  String lastName = json.substring(json.indexOf("lastName")+12, json.indexOf("\","));
	  System.out.println(firstName);
	  System.out.println(lastName);
	  
	}
}


//		{"id": 1944, "firstName": "Cecil", "lastName": "Nacey", "role": "student-team-leader"}