package day36_wrapperclasses_arraylistintro;

public class Boxing {
	public static void main(String[] args) {
		//AUTOBOXING
		Integer num1 = 1234;
		int n = 5;
		Integer num2 = n;
		
		//UNBOXING
		Double d1 = new Double (34.2);
		double d2 = d1;
		System.out.println("d1: "+d1);
		System.out.println("d2: "+d2);
		
		long l1 = new Long(6000000); //AUTO-BOXING
		Long l2 = new Long(345434543L);// NO BOXING
		long l3 = l2;//UNBOXING
		Long l4 = l3;//AUTO-BOXING
		
		Integer num3 = Integer.valueOf(345);
		//Double d3
		
	}
}
