import java.util.Scanner;

public class TestTriangleGeometricObject {

	public static void main(String[] args) {
		// This is the test class for the triangle and geometric object 
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 3 sides of a triangle: ");
		
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		System.out.println("Enter a color for the triangle: ");
		String color = input.next(); // this is just a string
		
		System.out.println("true or false, Is the triangle filled?: ");
		 String isFilledString = input.next(); // allows for user to enter string to print out as either true or false
	        boolean isFilled = (isFilledString.equals("true"));
	        
	  Triangle triangle; // calls to the triangle object
	       
	       triangle = new Triangle(side1, side2, side3);
	       triangle.setColor(color);
	       triangle.setFilled(isFilled);
	            
	            System.out.println("The area of the triangle is: " + triangle.getArea());
	            System.out.println("The perimeter of the triangle is: " + triangle.getPerimeter());
	            System.out.println("The color of the triangle is: " + triangle.getColor());
	            System.out.println("The triangle is filled: " + triangle.isFilled());


	}

}
