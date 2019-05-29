package day47_blocks;

public class VariableAccess {
	//instance variable
	int myInstanceVa = 40;
	
	//static variable
	static int myStaticVariable = 55;
	
	public static void main(String[] args) {
		//System.out.println(myInstanceVar); //cannot access non-static from static method 
		System.out.println(myStaticVariable);
		
		//create object of VariableAccess and print myInstatnceVar
		VariableAccess v = new VariableAccess();
		System.out.println(v.myInstanceVa);
		System.out.println(v.myStaticVariable);
		
		//access static variable using classname
		System.out.println(VariableAccess.myStaticVariable);
		
	}
}
