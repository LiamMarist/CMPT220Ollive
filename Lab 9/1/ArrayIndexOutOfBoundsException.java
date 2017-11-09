package package9;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		
		System.out.println("Enter an index of the  array?");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
		  
        try {
	        int[] array = new int[100];
	        for(int i = 0; i <  array.length; i++) {
	            array[i] =(int)(Math.random() * 100);  
	            }  
	        System.out.println(array[n]);
	        
        } catch (IndexOutOfBoundsException ex) {
       	 System.out.println( "number out of bounds!");
        }
	       
	           
	            
	           
	        
	}

}
