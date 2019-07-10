package day60_polymorphism02;

import java.util.*;

import day59_polymorphism.Circle;
import day59_polymorphism.Shape;
import day59_polymorphism.Square;
import day59_polymorphism.Triangle;

public class InstanceOfOperator {
	public static void main(String[] args) {
		Shape shape = new Square();

		System.out.println(shape.getClass().getName());
		System.out.println(shape.getClass().getSimpleName());
		//getClass().getName() method
		if (shape.getClass().getSimpleName().equals("Triangle")) {
			System.out.println("It is a Triangle!");
		} else if (shape.getClass().getSimpleName().equals("Square")) {
			System.out.println("It is a Square!");
		} else if (shape.getClass().getSimpleName().equals("Circle")) {
			System.out.println("It is a Circle!");
		}

		// Same check using instanceof operator

		System.out.println(shape instanceof Square);
		System.out.println(shape instanceof Circle);
		System.out.println(shape instanceof Triangle);

		System.out.println(shape instanceof Shape);
		System.out.println(shape instanceof Object);

		if (shape instanceof Triangle) {
			System.out.println("It is a Triangle!!");
			shape.draw();
		} else if (shape instanceof Circle) {
			System.out.println("It is a Circle!!");
			shape.draw();
		} else if (shape instanceof Square) {
			System.out.println("It is a Square!!");
			shape.draw();
		}
		
		Shape[] shapes = {new Triangle(), new Square(), new Circle(),
				  		 new Triangle(), new Square(), new Circle()};
		
		
		int circles = 0, squares = 0, triangles = 0;
		//using for each loop find our number of each type
		
		for (Shape sh : shapes) {
			if(sh instanceof Circle) {
				circles++;
			}else if(sh instanceof Square) {
				squares++;
			}else if(sh instanceof Triangle) {
				triangles++;
			}
		}
		System.out.println("circles: "+ circles+ "\n"+
							"squares: "+ squares+ "\n"+
							"triangles: "+ triangles+ "\n");
		
		
	}
}
