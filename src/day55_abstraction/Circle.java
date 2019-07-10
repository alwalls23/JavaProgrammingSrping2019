package day55_abstraction;

public class Circle extends Shape{
	
	double radius;
	
	public Circle() {
		super("Circle");
		this.radius = radius;
	}

	@Override
	public double calucalateArea() {
		
		return 0;
	}

	@Override
	public void draw() {
			System.out.println("  ***  \n" + 
					" *   * \n" + 
					"*     *\n" + 
					"*     *\n" + 
					"*     *\n" + 
					" *   * \n" + 
					"  ***");
		
	}

}
