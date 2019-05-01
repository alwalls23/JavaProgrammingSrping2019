package java_group_assignments;
import java.util.*;
public class TipCalculator {
	public static void main(String[] args) {
		Scanner tip = new Scanner(System.in);
		
		String serviceQuality, split;
		String symPeople = "";
		int numberOfPeople = 0; 
		double checkAmount = 0;
		double totalToPay = 0;
		double totalTip = 0;
		double totalPerPerson = 0;
		double tipPerPerson = 0;
		double checkPerPerson = 0;
		
		System.out.println("Split:");
		split = tip.next();
		
		
		System.out.println("Number of people:");
		numberOfPeople = tip.nextInt();
		
		switch(numberOfPeople) {
		case 1:
			symPeople = ("&");
			break;
		case 2:
			symPeople = ("&&");
			break;
		case 3:
			symPeople = ("&&&");
			break;
		case 4:
			symPeople = ("&&&&");
			break;
		case 5:
			symPeople = ("&&&&&");
			break;
		case 6:
			symPeople = ("&&&&&&");
			break;
		case 7:
			symPeople = ("&&&&&&&");
			break;
		case 8:
			symPeople = ("&&&&&&&&");
			break;
		case 9:
			symPeople = ("&&&&&&&&&");
			break;
		case 10:
			symPeople = ("&&&&&&&&&&");
			break;	
		}
		
		System.out.println("Check amount:");
		checkAmount = tip.nextDouble();
		
		System.out.println("Service Quality:");
		serviceQuality = tip.next();
		
		switch(serviceQuality) {
		case "Poor":
			totalTip = (checkAmount * .05);
			break;
		case "Fair":
			totalTip = (checkAmount * .10);
			break;
		case "Good":
			totalTip = (checkAmount * .15);
			break;
		case "Great":
			totalTip = (checkAmount * .20);
			break;
		case "Excellent":
			totalTip = (checkAmount * .25);
			break;
			
		}
		
		switch(split) {
		case "Yes":
			checkPerPerson = checkAmount / numberOfPeople;
			tipPerPerson = totalTip / numberOfPeople;
			break;
		case "No":
			tipPerPerson = totalTip;
			break;	
		}
				
		totalPerPerson = checkPerPerson + tipPerPerson;
		totalToPay = checkAmount + totalTip;
		
		System.out.println("Number of people entered: "+symPeople);
		System.out.println("Total to pay: "+ totalToPay);
		System.out.println("Total tip: "+ (totalTip));
		System.out.println("Total per person: "+ totalPerPerson);
		System.out.println("Tip per person: " + tipPerPerson);

	}
}
