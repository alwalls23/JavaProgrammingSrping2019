package day40_customeclasses_methods;

public class Employee {
	/*
	 * class employee
	 * name
	 * jobTitle
	 * salary
	 * 
	 * work
	 * goToBreak
	 * attendMeeting
	 * 
	 * Introduce - > "Name[name], jobTtile[jobTitle], salary [salary]
	 */
	
	public String name;//can be used anywhere in project
	public String jobTitle;
	double salary;//can be used only in package
		

	public void work() {
		System.out.println(name + " is working hard ...");
	}
	
	public void attendMeeting() {
		System.out.println(name + " is attending a meeting ...");
	}
	//"Name[name], jobTitle[jobTitle], salary[salary]"
	public void introduce() {
		System.out.println("Name[" + name +"], jobTitle[" + jobTitle 
				+"], salary[" + salary + "]");
	}
}