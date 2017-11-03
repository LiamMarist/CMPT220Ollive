import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TestArrayList {

	public static void main(String[] args) {
		// Create ArrayList
		ArrayList<Double> numList = new ArrayList<>();
		
		System.out.println("Enter 5 numbers to be sorted: ");
		
		Scanner input = new Scanner(System.in);
		
		double n1 = input.nextDouble();
		double n2 = input.nextDouble();
		double n3 = input.nextDouble();
		double n4 = input.nextDouble();
		double n5 = input.nextDouble();
		
		
		
		numList.add(n1);
		numList.add(n2);
		numList.add(n3);
		numList.add(n4);
		numList.add(n5);
		
		System.out.println("Here is the sorted list");
		
		// allows for the list to be sorted
		Double[] array = {n1, n2, n3, n4, n5}; // creates array out of the entered numbers
		ArrayList<Double> list = new ArrayList<>(Arrays.asList(array)); 
		java.util.Collections.sort(list); // sorts numbers
		System.out.println(list);

	}

}
