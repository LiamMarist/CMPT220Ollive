import java.util.Scanner;

public class AddTwoMatrices {
	public static void main(String[] args)
	{
		
		// Set up first two matrices
		double[][] matrix1 = getmatrix(1);
		double[][] matrix2 = getmatrix(2);

		// Matrix3 will be the sum of matrix1 and matrix2
		double[][] matrix3 = addMatrix(matrix1, matrix2);

		// This will display the matrices
		print(matrix1, matrix2, matrix3);
	}

	public static double[][] getmatrix(int n)
	{
		
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a matrix
		System.out.print("Enter matrix" + n + ": ");
		
		// Will be a 3 by 3 matrix
		double[][] m = new double[3][3];
		for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j < 3; j++)
				m[i][j] = input.nextDouble();
		}

		return m;
	}

	public static double[][] addMatrix(double[][] a, double[][] b)
	{
		double[][] c = new double[3][3];

		for (int i = 0; i < c.length; i++) 
		{
			for (int j = 0; j < c[i].length; j++)
			{
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;
	}

	/** Displays all of  the elements in the row r */
	
	public static void print(double[][] m, int r)
	{	
		
		for (int j = 0; j < m[r].length; j++)
		{
			System.out.print(m[r][j] + " ");
		}	
	}

	// Displays the results
	public static void print(double[][] m1, double[][] m2, double[][] m3)
	{
		System.out.println("The matrices are added as follows");
		
		for (int i = 0; i < 3; i++)
		{
			print(m1, i);
			System.out.print((i == 1 ? "  +  " : "     "));
			
			print(m2, i);
			System.out.print((i == 1 ? "  =  " : "     "));
			
			print(m3, i);
			System.out.println();
		}
	}
}