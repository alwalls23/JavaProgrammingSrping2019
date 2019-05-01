package day33_methods05;

public class PayCalculator {

	/*
	 * Method: getHourlyPay
	 * Return type: double
	 * params: int hours, double rate
	 * return total pay by multiplying hours * rate
	 * if hours is 0 or negative - return 0;
	 * print "Invalid hours"
	 * if rate is 0 or negative - return 0;
	 * print "Invalid rate"
	 */
	public static void main(String[] args) {
		int pay = getHourlyPay(40,50);
		System.out.println("Total pay for 40 hours: "+pay);
		System.out.println(getHourlyPay(0,10));
		int noPay = getHourlyPay(10, 0);
		System.out.println("No Pay: "+noPay);
	}
	
	public static int getHourlyPay(int hours, int rate) {
		if(hours <=0) {
			System.out.println("INVALID HOURS!");
			return 0;
		}
		if(rate <= 0) {
			System.out.println("INVALID RATE!");
			return 0;
		}
		int totalPay = hours * rate;
		return totalPay;
	}
}
