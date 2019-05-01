package day09_stringequals_conditionals;

public class StringEquals {
	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "java";
		//using ==
		System.out.println(str1 == str2);//true
		System.out.println(str1 =="java");//true
		System.out.println(str2 == "Java");//false
		
		//equals method. PREFERRED WAY
		System.out.println(str1.contentEquals(str2));//true
		System.out.println(str1.equals("java"));//true
		System.out.println(str2.contentEquals("Java"));//false
		
		//String month = "March";
		String month = new String("March");
		String month2 = new String("March");
		
		System.out.println(month == month2);
		
		System.out.println(month.equals(month2));
		System.out.println(month.contentEquals("March"));
		
		
		
	}
}
