package day58_interfaces02;

public class ClassA implements Cloneable{
	public Object clone() {
		System.out.println("Cloning");
		//any custom code to run when cloning ClassA object
		return null;
	}
}
