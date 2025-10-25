package lab4;

public class Square {
	
	Point2 A;
	Point2 B;
	Point2 C;
	Point2 D;
	
	
	public Square(Point2 A, Point2 B, Point2 C, Point2 D) {
		this.A = A;
		this.B = B;
		this.C = C;
		this.D = D;
	}
	
	
	public boolean isSquare(){
		
		double dAB = A.distance(B);		// length
		double dCD = C.distance(D);		// length
				
		double dAC = A.distance(C);		// width
		double dBD = B.distance(D);		// width
		
		return (dAB==dCD) && (dAB == dAC) && (dAB == dBD);
		
	}
	
	
	public double area() {
		double sideLen = A.distance(B);
		
		return sideLen * sideLen;
	}
	
	
	public double perimeter() {
		double sideLen = A.distance(B);
		
		return sideLen * 4;
	}

}
