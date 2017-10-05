import java.util.Scanner;

public class EliminateDuplicates {

	 public static void main(String[] args) {
		 
		 // Create Scanner
		  Scanner input = new Scanner(System.in);
		  int[] nums = new int[10];
		 
		  System.out.print("Enter ten numbers:");
		 
		  for (int i = 0; i < nums.length; i++) {
		   nums[i] = input.nextInt();
		  }
		 
		  /** Prompt user to enter 10 numbers */
		  
		  System.out.print("The distinct numbers are:");
		 
		  nums = eliminateDuplicates(nums);
		  for (int i = 0; i < nums.length; i++) {
		   System.out.print(nums[i] + " ");
		  }
		 }
		 
		 public static int[] eliminateDuplicates(int[] list) {
		 
		  int[] newArray = new int[0];
		  boolean x = true;
		 
		  newArray = add2Array(newArray, list[0]);
		  for (int i = 0; i < list.length; i++) {
		   for (int j = 0; j < newArray.length; j++) {
		 
		    if (list[i] == newArray[j]) {
		     x = false;
		     break;
		    }
		 
		   }
		 
		   if (x)
		   {
		    newArray = add2Array(newArray, list[i]);
		    
		   }
		    
		   x = true;
		 
		  }
		 
		  return newArray;
		 
		 }
		 
		 /** duplicate the array of numbers1 to array of numbers2 */
		 
		 public static boolean duplicateArray(int[] source, int[] destinct) {
		  if (source.length > destinct.length)
			  
		   return false;
		 
		  for (int i = 0; i < source.length; i++) {
		   destinct[i] = source[i];
		   
		  }
		  return true;
		 }
		 
		 // Return the new array
		 public static int[] add2Array(int[] source, int data) {
		 
		  int[] destinct = new int[source.length + 1];
		  duplicateArray(source, destinct);
		  destinct[source.length] = data;
		  
		  return destinct;
		 
		 }
	}


