package day54_inheritance_review_session;



class superClass {
	public void original() {
		System.out.println("Cybertek");
	}
	
	public static void method() {
		
	}
	
	public static void method(int a) {
		
	}
	
	protected void method1() {
		
	}
	
}

public class Method_Overriding extends superClass {
	/*
	 * Method Overriding:  only instance methods (not all) can be overridden
	 * 		Method needs to be override in subclass
	 * 		Parameter MUST be the same
	 * 		@Override should be applicable
	 * 
	 * Method Override VS Method Overload:
	 * 		
	 * Method_Override: MUST have same signature 
	 * 		cannot be override in same class
	 * 		return type needs to be the same
	 * 		Access modifier needs to be in the same class
	 * 		Only instance methods (does not have final and private) can be override
	 * 
	 * Method_Overload: MUST have different parameter
	 * 		can be overload in same class
	 * 		return type can be same or different
	 * 		Access modifier can be different
	 * 		Any methods and constructor can be overload
	 * 		
	 */
//	 void method1() { }
	
	public static void method(int a) {
		
	}
	
	@Override //checks if the method is being overridden
	public void original() {
		System.out.println("Batch 11");
	}
	
	public static void main(String[] args) {
		new superClass().original();
		new Method_Overriding().original();
	}
}
