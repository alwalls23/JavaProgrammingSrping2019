package day53_inheritance06;

public class TestHiding {
	public static void main(String[] args) {
		City city = new City(345, "London");
		Capital cap = new Capital(433, "Paris", 5432345L);
		
		System.out.println(city.count);
		System.out.println(cap.count);
		
		System.out.println(city.toString());
		System.out.println(cap.toString());
		
		cap.displayCount();
		
		//call static methods
		city.buildARoad();
		cap.buildARoad();
		
		City.buildARoad();
		Capital.buildARoad();
		
		City city2 = new City(22244, "Fairfax");
		Capital capital2 = new Capital(6544, "Richmond", 248758393L);
		
		city2.letsBuildARoad();
		capital2.letsBuildARoad();
	}
}
