package day15_string_manipulation;

public class StartsEndsWith {
	public static void main(String[] args) {
		String word1 = "eclipse";
		//startsWith ==> tests if string starts with another character
		System.out.println(word1.startsWith("e"));//true
		System.out.println(word1.startsWith("ec"));//true
		System.out.println(word1.startsWith("ecli"));//true
		
		System.out.println(word1.startsWith("Ec"));//false
		
		System.out.println(word1.endsWith("e"));//true
		System.out.println(word1.endsWith("ipse"));//true
		
		System.out.println(word1.endsWith("java"));//false
		
		//"PSE"
		System.out.println(word1.toUpperCase().endsWith("PSE"));
		
		System.out.println();
		//Mr. == > Male
		//Mrs. ==> married woman
		//Ms. ==> single woman
		//Dr. ==> doctor man or woman
		// ==> Unknown Status
		
		String name = "Ms. Jackson";
		if(name.startsWith("Mr.")) {
			System.out.println("man");
		}else if(name.startsWith("Mrs.")) {
			System.out.println("married woman");
		}else if(name.startsWith("Ms.")) {
			System.out.println("single woman");
		}else if(name.startsWith("Dr.")) {
			System.out.println("doctor man or woman");
		}else {
			System.out.println("unknown status");
		}
		
		
		
	}
}
