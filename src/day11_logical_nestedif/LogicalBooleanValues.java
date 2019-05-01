package day11_logical_nestedif;

public class LogicalBooleanValues {
	public static void main(String[] args) {
		boolean b1 = 5 > 10 && 10 > 100;
		System.out.println("B1: " + b1);//False
		
		boolean b2 = 'a' == 'a' && 123 > 120;
		System.out.println("B2: "+ b2);//True
		
		boolean b3 = true && 10 >= 10 && 1000 <= 900;
		System.out.println("B3: "+ b3);//False
		
		boolean b4 = false && false && 10==10;
		System.out.println("B4: " + b4);//False
		
		boolean b5 = true || false && 10==10;
		System.out.println("B5: " + b5);//True
		
		boolean b6 = false || true && 10==10;
		System.out.println("B6: " + b6);//True
		
		boolean b7 = false && true || 10==10;//&& has higher precedence and will be tested first
		System.out.println("B7: " + b7);//True
		
		boolean b8 = true || true && 10!=10;
		System.out.println("B8: " + b8);//True
		
		boolean b9 = true || (true && 10!=10);
		System.out.println("B9: " + b9);//True
		
		boolean b10 = false && (true || 10==10);
		System.out.println("B10: " + b10);//False
		
		boolean b11 = !(true || false) && true;
		System.out.println("B11: " + b11);//False
		
		boolean b12 = !true || true && false;
		System.out.println("B12: " + b12);//False
		
		boolean b13 = true;
		System.out.println(!b13);//False
		
		boolean b14 = true;
		System.out.println(!!b14);//True, you can keep using !!!!..., it will keep reversing the end result.
		
		boolean topicDone = true;
		boolean isMoreThan3Pm = true;
		boolean everyThingIsClear = true && !false;
		boolean letsGoForABreak = topicDone && isMoreThan3Pm && everyThingIsClear;
		System.out.println("letsGoForABreak: "+ letsGoForABreak);
		
	}
	
}
