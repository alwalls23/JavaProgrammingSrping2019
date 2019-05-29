package day46_static_keyword;

public class Customer {
	/*
	 * encapsuted:
	 * -> String name
	 * -> String email
	 * getters and setters
	 * 2 contructors;
	 * -> no args
	 * 		name = "undefined"
	 * 		email = "undefined"
	 * -> 2 args
	 * toString
	 */

	private String name;
	private String email;
	
	static int count; //shared by everyone/all objects
					  //one central copy of this variable

	public Customer() {
		name = "Undefined";
		this.email = "Undefined";// this. is optional on no args constructor
		count++;
	}

	public Customer(String name, String email) {
		this.name = name;
		this.email = email;
		count++;
	}

	public String toString() {
		return "Customer [name=" + name + ", email=" + email + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
