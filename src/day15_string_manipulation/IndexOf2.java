package day15_string_manipulation;

public class IndexOf2 {
	public static void main(String[] args) {
		//index of with 2 inputs
		String list = "html-selenium-angular-jenkins-grid";
		
		int firstDash = list.indexOf("-");
		System.out.println("First dash: "+ firstDash);
		
		int secondDash = list.indexOf("-", 5);
		System.out.println("second dash: "+secondDash);
		
		//fird the third one by using secondDash variable
		int thirdDash = list.indexOf("-", secondDash + 1);
		System.out.println("third dash: "+thirdDash);
		
		//find the last dash
		
		int lastDash = list.lastIndexOf("-");
		System.out.println("Last dash: " + lastDash);
		
	
		String word = "java";
		int first = word.indexOf("a");
		int second = word.indexOf("a", first+1);
		System.out.println("Position of ssecond 'a': "+ second);
		
		//int second = word.indexOf("a", word.indexOf("a")+1);  this produces similar results to line 26
		//System.out.println("a: "+ second);
		
	}
}
