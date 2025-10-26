package lab4;

public class Square {
	
	Point A;
	Point B;
	Point C;
	Point D;
	
	
	public Square(Point A, Point B, Point C, Point D) {
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
