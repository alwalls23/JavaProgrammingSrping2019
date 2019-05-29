package day48_inheritance01;

public class School {
	public static void main(String[] args) {
		
		Person person = new Person();
		Student student = new Student();
		
		person.name = "Obama";
		person.age = 57;
		person.gender = 'm';
		
		student.name = "Alexander";
		student.age = 32;
		student.gender = 'm';
		student.clazz = "java";
		
		person.eat("steak");
		student.eat("grechka");
		
		person.walk();
		student.walk();
		
		person.sleep(8);;
		student.sleep(7);
		
		Student student2 = new Student();
		student2.name = "Orhan";
		student2.age = 40;
		student2.gender = 'm';
		student2.studentID = 4040;
		student2.clazz = "Agile Scrum";
		student2.eat("kebab");
		student2.walk();
		student2.code("python");
		student2.attendClass();
		
		
	}
}
