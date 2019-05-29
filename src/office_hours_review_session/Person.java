package office_hours_review_session;

public class Person {
	private String firstName;
	private String lastName;
	private String birthday;
	
	//the constructor a method-(action/behavior) without a return type
	//in the body of the constructor, we are assigning the argument to birthday
	//from now on, whenever we want to create an object, we have to provide the constructor
	public Person(String bDay) {
		System.out.println("constructing");
		birthday = bDay;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBirthday() {
		return birthday;
	}
	//we will not have publid set birthday method
	//people 

//	public void setBirthday(String birthday) {
//		this.birthday = birthday;
//	}
		
}
