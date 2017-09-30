import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in); 

		// Prompt user to enter in sides of a triangle
		System.out.print("Enter a number for three sides of a triangle: ");
			
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
			
	    // Tells the user their input is invalid 
		System.out.println(isValid(side1, side2, side3) ? "The area of the triangle is " + area(side1, side2, side3) :"Input is invalid");
		}

	   // Checks if the user input is valid
		public static boolean isValid(
			double side1, double side2, double side3) { 
			boolean valid = side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1; 
			return valid;
		}

		// Computes the area of the values inputed 
		public static double area(
			double side1, double side2, double side3) {
			double s = (side1 + side2 + side3) / 2;
			return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		}

	}


