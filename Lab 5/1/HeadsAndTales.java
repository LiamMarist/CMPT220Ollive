import java.util.Scanner;

public class HeadsAndTales {
	 public static void main(String[] args)
	 {
		 // Create a scanner
		  Scanner input = new Scanner(System.in);
		  System.out.print("Enter a number between 0 and 511: ");
		  short n = input.nextShort();
		  int intArray[][] = new int[3][3];
		 
		  short mask = 0b1; 
		 
		  // Checks for number entered
		  for (int i = 0; i < 9; i++)
		  {
		 
		   short bit = (short) (n & mask); 
		          
		   intArray[2-i / 3][2-i % 3] = bit;
		   
		   n = (byte) (n >> 1); 
		        
		  }
		 
		  displayArray(intArray);
		 
		 }
		 // Displays the results based on user input
		 public static void displayArray(int array[][]) 
		 {
		 
		  for (int i = 0; i < array.length; i++)
		  {
			  
		   for (int j = 0; j < array[0].length; j++) 
		   {
			   
		    if (array[i][j] == 1)
		    {
		     System.out.print("T ");
		    } 
		    else 
		    {
		     System.out.print("H ");
		    }
		    
		   }
		 
		   System.out.println("");
		  }
		 }
}
