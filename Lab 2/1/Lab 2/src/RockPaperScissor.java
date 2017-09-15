import java.util.Scanner;

public class RockPaperScissor {

	public static void main(String[] args) {
		// Create Scanner
        Scanner input = new Scanner(System.in);
         
        // Declare integers for computer and player
        int number;
        int choice;
        
        // Creates a random number 0, 1, 2 
        number = (int) (Math.random() * 3);
        
        System.out.print("Enter 0 for Scissor, 1 for Rock or 2 for Paper: ");
        choice = input.nextInt();

        // Check the guess
        if (number == 0 && choice == 0) {
            System.out.println("The computer is Scissors. You are Scissors too. It is a draw.");
        }
        if (number == 0 && choice == 1) {
            System.out.println("The computer is Scissors. You are Rock. You won!");
        }
        if (number == 0 && choice == 2) {
            System.out.println("The computer is Scissors. You are Paper. You lose!");
        }
        if (number == 1 && choice == 0) {
            System.out.println("The computer is Rock. You are Scissors. You lose!");
        }
        if (number == 1 && choice == 1) {
            System.out.println("The computer is Rock. You are Rock too. It is a draw.");
        }
        if (number == 1 && choice == 2) {
            System.out.println("The computer is Rock. You are Paper. You won!");
        }
        if (number == 2 && choice == 0) {
            System.out.println("The computer is Paper. You are Scissors. You won!");
        }
        if (number == 2 && choice == 1) {
            System.out.println("The computer is Paper. You are Rock. You lose!");
        }
        if (number == 2 && choice == 2) {
            System.out.println("The computer is Paper. You are Paper too. It is a draw.");
        }
    


	}

}
