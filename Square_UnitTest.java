package lab5;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Square_UnitTesting {

	@Test
	//testing for isSquare true case
	void testisSquare() {
		Point A = new Point(0,0);
		Point B = new Point(0,1);
		Point C = new Point(1,0);
		Point D = new Point(1,1);
		
		Square s1 = new Square(A,B,C,D);
		assertEquals(s1.isSquare(), true);
	}
	
	@Test
	//testing for isSquare false case
	void testisSquareFalse() {
		Point A = new Point(0,0);
		Point B = new Point(2,1);
		Point C = new Point(1,0);
		Point D = new Point(1,5);
		
		Square s1 = new Square(A,B,C,D);
		assertEquals(s1.isSquare(), false);
	}
	
	@Test
	//testing for Area method
	void testArea() {
		Point A = new Point(0,0);
		Point B = new Point(0,2);
		Point C = new Point(2,0);
		Point D = new Point(2,2);
		
		Square s1 = new Square(A,B,C,D);
		assertEquals(s1.area(), 4);
	}
	
	@Test
	//testing for Perimeter method
	void testPerimeter() {
		Point A = new Point(0,0);
		Point B = new Point(0,2);
		Point C = new Point(2,0);
		Point D = new Point(2,2);
		
		Square s1 = new Square(A,B,C,D);
		assertEquals(s1.perimeter(), 8);
	}

}
