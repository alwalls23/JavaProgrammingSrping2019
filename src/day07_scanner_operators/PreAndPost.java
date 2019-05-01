package day07_scanner_operators;

public class PreAndPost {
	public static void main(String[] args) {
		int num = 10;
		int num2 = num++;
		
		System.out.println("num: " + num);
		System.out.println("num2: " + num2);
		
		int n = 20;
		int n2 = ++n;
		
		System.out.println("n: " + n);
		System.out.println("n2: " + n2);
	
		int i = 10;
		i++;// Post add 1 automatically, no need to use = operator
		++i;// Pre add 1
			// They aresame in a way that both of them are adding 1 to the variable i.
			//When the difference come into picture?
			//Whenever we assign this variables to other vaiables and use ++, --. 
			//It will make a difference if it is on the right or left side.
			//n++; will pass the current value first, then will will increase by 1
			//++n; will increase the current value first, then pass the value
		
		System.out.println("I value: " + i);
		
		int bananas = 6;
		int pears = bananas++;
		int apples = ++bananas;
		
		System.out.println("banans: " + bananas);
		System.out.println("pears: " + pears);
		System.out.println("apples: " + apples);
		
		int friends = 10;
		System.out.println(++friends);
		System.out.println(friends);
		
		int p1 = 10;
		++p1;
		int sum = p1++ + 5;
		//p1 + 1 + 5 and assign to sum
		//p1 = p1 + 1 + 1		
		
		System.out.println("sum: " + sum);
		System.out.println("p1: " + p1);
		
		int batteries = 8;
		int oldBatteries = 5;
		           //14       //8                 //6
		int totalBatteries = batteries++ + ++oldBatteries;
		
		System.out.println("batteries: " + batteries);//9
		System.out.println("old batteries " + oldBatteries);//6
		System.out.println("total batteries " + totalBatteries);//14
		
		
		
	}

}
