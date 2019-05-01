package day27_arrays05;

public class CanvasCourses {
	public static void main(String[] args) {
		/*
		 * 147 => Java Programming
		 * 204 => Mentoring sessions
		 * 149 => SDLC
		 * 152 => QA Testing
		 * 144 => Team activity
		 * 143 => Welcome Kit
		 * 
		 * split by "/" and get the last value from array
		 * convert it to integer. Integer.parseInt(...) - int value
		 * switch statement and find the matching
		 */
					//  0   |1|      2                |  3    |  4
		String url = "https://learn.cybertekschool.com/courses/149";
		//split by / and store into array
		String [] urlArr = url.split("/");
		System.out.println("length:"+urlArr.length);
		//get last number and convert to int data type
		System.out.println(urlArr[urlArr.length -1]);
		
		int courseID = Integer.parseInt(urlArr[4]);
		//use switch to find course id
		switch(courseID) {
		case 147:
			System.out.println("Java Programming");
			break;
		case 204:
			System.out.println("Mentoring Sessions");
			break;
		case 149:
			System.out.println("SDLC");
			break;
		case 152:
			System.out.println("QA Tesing");
			break;
		case 144:
			System.out.println("Team Activity");
			break;
		case 143:
			System.out.println("Welcome Kit");
			break;
		default:
			System.out.println("Invalid number for course ID!");
		}
		
	}
}
