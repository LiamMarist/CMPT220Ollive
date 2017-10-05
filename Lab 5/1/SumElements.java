import java.util.Scanner;

public class SumElements {
	public static void main(String[] args) {

		double[][] matrix = getMatrix();

		// Display the sum of each of the matrix columns
		for (int col = 0; col < matrix[0].length; col++) {	
			System.out.println("Sum of the elements at column " + col + " is " + sumColumn(matrix, col));
		}
	}

	public static double[][] getMatrix() {
		
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		final int rows = 3;
		final int columns = 4;
		double[][] m = new double[rows][columns]; // a 3 by 4 matrix

		// Prompts the user to enter a matrix
		System.out.println("Enter a " + rows + "-by-" + columns + " matrix row by row:");
		
		for (int row = 0; row < m.length; row++)
			for (int col = 0; col < m[row].length; col++) 
				m[row][col] = input.nextDouble();
		
		return m;
	}

	// returns the sum of the elements in the index
	public static double sumColumn(double[][] m, int columnIndex) {
		
		double sum = 0;
		
		for (int row = 0; row < m.length; row++) {
			
			sum += m[row][columnIndex];		
		}
		
		return sum;
	}
}
