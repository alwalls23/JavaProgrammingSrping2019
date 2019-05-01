package day27_arrays05;

public class Tools {
	public static void main(String[] args) {
		/*
		 * Java --> programming language
			Selenium --> Test Autmation
			TestNG --> Unit Tests
			Junit --> Unit Tests
			Cucumber --> BDD Style testing
			Git --> Version control
			Maven -->  Building and execution for project
		 */
		
		String [ ] tools = {"JAVA","Selenium","TestNG","JUnit","Cucumber","Git","Maven"};
						 //array
		for (String tool : tools) {
			
			switch (tool.toLowerCase()){
			case "java":
				System.out.println("Java --> Programming language");
				break;
			case "selenium":
				System.out.println("Selenium --> Test Automation");
				break;
			case "testng":
			case "junit":
				System.out.println(tool+" --> Testing Tool");
				break;
			case "cucumber":
				System.out.println("Cucmber --> BDD Style Testing");
				break;
			case "git":
				System.out.println("Git --> Version Control");
				break;
			case "maven":
				System.out.println("Maven --> Building and execution for projects");
			default:
				System.out.println("Unknwon tool");
		}
		
		}
		
	}
}
