package java_practice_problems;

public class Return3x {
	public static String makeThreeSubstr(String string, int i, int j) {
		String word = string;
		int startIndex = word.charAt(i);
		int endIndex = word.charAt(j);
		
		System.out.println((startIndex+endIndex) + (startIndex+endIndex) + (startIndex+endIndex));
		return word;
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(makeThreeSubstr("hello",0,2)); //should be hehehe
		System.out.println(makeThreeSubstr("shenanigans",3,7)); //should be naninaninani
	}

	
}
