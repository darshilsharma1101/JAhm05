package geometrydemo;

import geometry.Circle;
import geometry.Rectangle;
import geometry.Triangle;

public class Main {
	public static void main(String[] args) {
	
		Circle c1 =  new Circle(10);
		c1.getArea();
		System.out.println(c1);
		
		Rectangle r1 = new Rectangle(12,10);
		r1.getArea();
		System.out.println(r1);
		
		Triangle t1 = new Triangle(25,10);
		t1.getArea();
		System.out.println(t1);
		
	}
	
	
}
