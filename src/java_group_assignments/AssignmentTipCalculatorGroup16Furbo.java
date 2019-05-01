package java_group_assignments;
import java.util.*;

public class AssignmentTipCalculatorGroup16Furbo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		byte numberOfPeople;
		String split, serviceQuality;
		double checkAmount;
		
		System.out.println("Enter number of people: ");
		numberOfPeople = scan.nextByte(); //number of people entered
			if (numberOfPeople < 1 || numberOfPeople > 10) {
				System.out.println("Invalid number of people!");
				return;
			}
		
		System.out.println("Would you like to split the check? Enter yes or no:" );
		split = scan.next();
		
		boolean split1 = (split.equalsIgnoreCase("Yes"))? true : false ;
		
		
		System.out.println("Check amount:");
		checkAmount = scan.nextDouble();
		
		System.out.println("Score the quality of service: Excellent/Great/Good/Fair/Poor");
		serviceQuality = scan.next();
		
		
		double totalPerPerson, totalTip, tipPerPerson;
		

		
		switch (serviceQuality) {
		case "Poor":
			totalTip = checkAmount * 0.05;
			break;
		case "Fair":
			totalTip = checkAmount * 0.1;
			break;
		case "Good":
			totalTip = checkAmount * 0.15;
			break;
		case "Great":
			totalTip = checkAmount * 0.2;
			break;
		case "Excellent":
			totalTip = checkAmount * 0.25;
			break;
		default:
			System.out.println("Wrong service quality statement");
			return;
		}
			double totalToPay = 0.0;
			totalToPay = checkAmount + totalTip;
			
			switch (numberOfPeople) {
			case 1: 
				System.out.println("Number of People: &");
				break;
			case 2: 
				System.out.println("Number of People: &&");
				break;
			case 3: 
				System.out.println("Number of People: &&&");
				break;
			case 4: 
				System.out.println("Number of People: &&&&");
				break;
			case 5: 
				System.out.println("Number of People: &&&&&");
				break;
			case 6: 
				System.out.println("Number of People: &&&&&&");
				break;
			case 7: 
				System.out.println("Number of People: &&&&&&&");
				break;
			case 8: 
				System.out.println("Number of People: &&&&&&&&");
				break;
			case 9: 
				System.out.println("Number of People: &&&&&&&&&");
				break;
			case 10: 
				System.out.println("Number of People: &&&&&&&&&&");
				break;
			
		}
			
			if (!(split1)) {
				System.out.println("Split: No");
				System.out.println("Total to pay: " + totalToPay);
				System.out.println("Total tip: " + totalTip);
			}
			else if (numberOfPeople==1 && split.equalsIgnoreCase("Yes")) {
				System.out.println("Split: Yes");
				System.out.println("Total to pay: " + totalToPay);
				System.out.println("Total tip: " + totalTip);
			}
			else {
				System.out.println("Split: Yes");
				System.out.println("Total to pay: " + totalToPay);
				System.out.println("Total tip: " + totalTip);
				System.out.println("Total per person: " + (totalToPay / numberOfPeople));
				System.out.println("Tip per person: " + (totalTip / numberOfPeople));
			}
		}

			
		}
		
	

