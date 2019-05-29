package day48_inheritance01;

public class Company {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.name = "Marufjon";
		emp1.jobTitle = "teacher";
		emp1.age = 30;
		emp1.gender = 'm';
		
		Employee emp2 = new Employee();
		emp2.name = "Elizabeth";
		emp2.age = 25;
		emp2.gender = 'f';
		emp2.jobTitle = "Dancer";
		
		emp1.work();
		emp2.work();
		
		emp1.eat("pizza");
		emp2.eat("salad");
		
		emp1.walk();
		emp2.walk();
		
		
		
	}
}
