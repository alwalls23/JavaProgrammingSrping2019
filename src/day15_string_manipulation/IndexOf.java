package day15_string_manipulation;

public class IndexOf {
	public static void main(String[] args) {
		String word1 = "github";
		System.out.println(word1.indexOf('g'));//0
		System.out.println(word1.indexOf("th"));//2
		System.out.println(word1.indexOf("hub"));//3
		System.out.println(word1.indexOf("java"));//-1
		
		System.out.println(word1.charAt(0));
		
		String url = "www.okta.com";
		int i = url.indexOf(".");
		System.out.println("Position of . "+i);
		System.out.println(url.charAt(i+1));//to find the position of the next character
		System.out.println(url.charAt(i-1));//to find the position of the previous character
		
		String title = "Java - Google Search";
		//find position of '-' and check if space is on right and left sides
		int dash = (title.indexOf('-'));//5
		System.out.println(title.charAt(dash -2));//" "
		System.out.println(title.charAt(dash + 2));//" "
		
		String country = "United States of America";
		int states = country.indexOf("States");
		System.out.println("Position of states: "+ states);
		
		String word2 = "java, c++, python, tomcat, exlipse";
		//check if c++ is in the word2
		if(word2.contains("c++:")) {
			System.out.println("c++ is there");
		}else {
			System.out.println("c++ is not there");
		}
		//2) using indexOf
		if(word1.indexOf("c++") > -1) {
			System.out.println("c++ is there");
		}else {
			System.out.println("c++ is not there");
		}
		
		
		
		
		
		
		
		
	}
}
