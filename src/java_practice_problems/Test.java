package java_practice_problems;


	public class Test {

	    public  String  name ;

	    public void Test() {

	        name = "James";

	    }

	

	    public static void main(String [] args) {

	        Test obj = new Test();

	        System.out.println(obj.name);
	        
	        int a = 2;

	        boolean res = false;

	        res = a++ == 2 || --a == 2 && --a == 2;

	        System.out.println(a);
	        
	        char [ ]  arr1 [ ] =  new  char[ 5 ][ ];
	        
	        int [ ]  arr2  = { 1,  2,  3,  4,  5 };
	       
//	        short  arr [ ]  =  new short[2];
	        
//	        short [ ]  arr = new short[ ] {100, 100};
	        
	        short [ ]  arr;

	        arr = new short[ 2 ];
	        
	        String fruit = "mango";

	        switch (fruit) {

	            default:  System.out.println("ANY FRUIT WILL DO");

	 

	            case "Apple":   System.out.println("APPLE");

	 

	            case "Mango":  System.out.println("MANGO");

	 

	            case "Banana": System.out.println("BANANA");

	                break;

	                
	        }   
	        

	    }

	}
	
	class Student {

	    String name;

	    int age;

	 

	    public void Student() {

	        Student("James", 25);

	    }

	    public void Student(String name, int age) {

	        this.name = name;

	        this.age = age;

	    }

	

	 

	

	    public static void main(String[ ]  args) {     

	          Student s = new Student( );

	        System.out.println(s.name + ":" + s.age);  
	        
	        
//	        System.out.println("Output is: " + 10 != 5);      

	    }
	    

	    }

