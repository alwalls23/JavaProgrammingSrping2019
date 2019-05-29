package day50_inheritance03;

public class Company {
	public static void main(String[] args) {
		Employee emp = new Employee();
		FullTimeEmployee fte = new FullTimeEmployee();
		Contractor ct = new Contractor();
		
		emp.calculatePay(40, 30);
		fte.calculatePay(40, 35);
		ct.calculatePay(40, 45);
	}
}
