package java_practice_problems;
import java.util.*;
public class RemoveEveryOther {
	public static void main(String[] args) {
		removeEveryOther();
	}
	
	public static void removeEveryOther() {
		List<String> words = new ArrayList<>();
		
		for (int i = 0; i < words.size(); i++) {
			words.remove(i);
			i+=2;
		}
		System.out.println(words);
	}
	
}
