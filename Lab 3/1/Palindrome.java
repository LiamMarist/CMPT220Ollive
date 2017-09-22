import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		  System.out.print("Enter an integer:");
		  int num = input.nextInt();
		 
		  // Check for Palindrome
		  if (isPalindrome(num)) {
		   System.out.print(num + " is a palindrome");
		   
		  } else {
		   System.out.print(num + " is not a palindrome");
		  }		 
		 }
		 // Checks if same reversed
		 public static int reverse(int num) {
		  int reverse = 0;
		  int digit;
		 
		  do {
		   digit = num % 10;
		   reverse = reverse * 10 + digit;
		   num /= 10;
		  } while (num != 0);
		 
		  return reverse;
		 }
		 
		 public static boolean isPalindrome(int number) {
		 
		  return (number == reverse(number));

	}

}
