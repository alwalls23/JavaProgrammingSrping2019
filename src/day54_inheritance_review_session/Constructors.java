package day54_inheritance_review_session;

class example1{
	public example1() {
		// TODO Auto-generated constructor stub
	}
	
	public example1(int a) {
		
		System.out.println("Constructor 1");
		}
	
	public example1(boolean a) {
	//	example1(9);  reason: #5
		this(300);
	}
	
	public example1(float a) {
		
		//	this('y');   reason: #7
		
	}
	public example1(char a) {
		this(20f);
	//	this();
		methods();
	}
	
	public void methodE() {
	//	this(300); reason: 6
	}
	
	
	public void methods() {
		methods();  
	}
	
}
public class Constructors {
	/*
	 * Constructor: belongs to the object
	 * 	1. Every class MUST have constructor
	 * 		if there isn't any declared, compiler will give no-arg constructor (default constructor)
	 * 	2. Cannot have specifier and return type
	 * 		specifiers: final, static, abstract
	 * 		return-types: void, primitives, wrapper class, all objects
	 * 	3. Constructor name MUST be same with class name
	 * 	4. Constructor execution depends on the creation of object.
	 * 		(same with instance block, after instance block)
	 * 	5. Constructor cannot be called by constructor name
	 * 	6. Constructor can only be called in other constructors
	 * 	7. Constructor cannot call itself.
	 * 	8. Constructor can only call one constructor.
	 * 
	 */
	public static void main(String[] args) {
		main(new String[] {"A"});
		example1 obj = new example1(9);
	}
}
