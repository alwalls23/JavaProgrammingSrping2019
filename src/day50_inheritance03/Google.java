package day50_inheritance03;

public class Google extends SearchEngine {
	@Override
	public int search(String word) {
		System.out.println("Searching for: "+word);
		int resultsCount = word.length();
		return resultsCount;
	}
	
	protected void search(String item, String item2) {
		System.out.println("Searching for 2 items: "+item+",");
		int resultsCount = item.length()+ item2.length();
		System.out.println("Total count: "+ resultsCount);
	}
	
	public String clickResult() {
		System.out.println("Clicking result");
		return "Search result page";
	}
}
