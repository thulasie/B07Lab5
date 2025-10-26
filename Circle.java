package lab4;
import java.lang.Math;


public class Circle {
	Point origin;
	double radius;
	
	public Circle(Point origin, double radius) {
		this.origin = origin;
		this.radius = radius;
	}

	public double perimeter() {
		return 2 * Math.PI * radius;
	}

	public boolean insideContains (Point p) {
		return p.distance(origin) < radius;
	}

	public boolean borderContains (Point p) {
		return p.distance(origin) == radius;
	}

}

	

