import java.util.Scanner;

public class TestMyInteger {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		 // int value = input.nextInt();
		
	MyInteger value = new MyInteger(4);
	MyInteger value2 = new MyInteger(5);
	
	 int valueA = 4;
	 int valueB = 5;
	
	// These only work for MyInterger values not local values A & B - nothing is currently being overridden
	System.out.println("The integer " + valueA + " is Even: " + value.isEven1());
	System.out.println("The integer " + valueA + " is Odd: " + value.isOdd1());
	System.out.println("The integer " + valueA + " is Prime: " + value.isPrime1());
	
	//  Uses the local int passed values - value is overridden with valueB
	System.out.println("\nThe integer " + valueB + " is Even: " + value.isEven2(valueB));
	System.out.println("The integer " + valueB + " is Odd: " + value.isOdd2(valueB));
	System.out.println("The integer " + valueB + " is Prime: " + value.isPrime2(valueB));
	
	// The MyIntegers can only be passed through the isEven3()/isOdd3()/isPrime3() - cannot use a local value A & B - value2 is overridden with value
	System.out.println("\nThe integer " + valueA + " is Even: " + value2.isEven3(value));
	System.out.println("The integer " + valueA + " is Odd: " + value2.isOdd3(value));
	System.out.println("The integer " + valueA + " is Prime: " + value2.isPrime3(value));
	
	System.out.println("\nThe integer values " + valueA + " & " +valueB + " are Equal: " + value2.equals(valueA)); // local values can be passed through
	
	System.out.println("\nThe integer values " + valueA + " & " + valueA + " are Equal: " + value.equals2(value)); // only works for myInteger values
	
	System.out.println("\nParse int Hello string value: " + MyInteger.parseInt("Hello")); // takes string value and prints number
	
	   System.out.println("\nParse int World char array value: " + MyInteger.parseInt("World".toCharArray())); 
	
	
	
}
}