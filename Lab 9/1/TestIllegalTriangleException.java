package package9;

import java.util.Scanner;

public class TestIllegalTriangleException {

	public static void main(String[] args) {
		
		try {
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter 3 sides of a triangle: ");
			
			double side1 = input.nextDouble();
			double side2 = input.nextDouble();
			double side3 = input.nextDouble();
			
			
			new TriangleWithException(side1,side2,side3);
			
			
		} catch (IllegalTriangleException ex) {
			System.out.println("This is an illegal triangle, the sides entered cannot create a triangle");
		}

	}

}

class TriangleWithException {
	
	private double side1;
	private double side2;
	private double side3;
	
	public TriangleWithException(double newSide1, double newSide2, double newSide3) throws IllegalTriangleException { //declares the exception
		
		
		setSides(newSide1, newSide2, newSide3);
		
	}
		
		public double getSide1() {
			return side1;
		}
		public double getSide2() {
			return side2;
		}
		public double getSide3() {
			return side3;
		}
	
		// This checks to see if the triangle is a triangle or not 
		public void setSides(double newSide1, double newSide2, double newSide3) throws IllegalTriangleException {
			
			if (newSide1 + newSide2 >= newSide3 && newSide3 + newSide2 >= newSide1 && newSide1 + newSide3 >= newSide2 ) {
				side1 = newSide1;
				side2 = newSide2;
				side3 = newSide3;
				
				System.out.println("This is a legal triangle");
			}
			else
				throw new IllegalTriangleException(newSide1, newSide2, newSide3); 
			
		}
		
	

	
}
