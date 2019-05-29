package day52_inheritance05;

public class FinalMethods {
	public final void method1() {
		System.out.println("Final mehtod 1");
	}
	
	public static void staticMethod(String word) {
		System.out.println("staticMethod: "+word);
	}
}

class Sub extends FinalMethods {
	//cannot override since it is a final method
//	public void method1() {
//		System.out.println("Overrided method 1");
//	}
	
//	public static void staticMethod{
//		System.out.println("staticMethod: "+word);
//	}
}
