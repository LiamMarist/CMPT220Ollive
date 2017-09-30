import java.util.Scanner;

public class DisplayMatrix {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		  System.out.print("Enter a number: ");
		  
		  int num = input.nextInt();
		  createMatrix(num);
		 
		 }
		 // Will create a matrix of 1s and 0s in the number of rows and columns as the input num
		 public static void createMatrix(int num)
		 {	 
		  for (int row = 0; row < num; row++) 
		  {
		   for (int col = 0; col < num; col++) 
		   {		   
		    System.out.print((int)(Math.random() * 2)); // Creates random order of 1s and 0s
		   }
		   System.out.println();
		  }
		 
		 }

	}


