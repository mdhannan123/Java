import java.util.Scanner;
import java.util.Random;

public class rockpaper {  // Class names must not contain spaces
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rm = new Random();
        String[] option = {"rock", "paper", "scissor"};
        int userScore = 0;
        int compScore = 0;

        System.out.println("Welcome to Rock Paper Scissors (Best of 3)!");

        while (userScore < 2 && compScore < 2) {
            System.out.println("\nChoose your move:");
            System.out.println("0: Rock\n1: Paper\n2: Scissor");
            System.out.print("Enter 0, 1, or 2: ");

            int userChoice = sc.nextInt();
            if (userChoice < 0 || userChoice > 2) {
                System.out.println("Invalid choice! Please enter a valid number.");
                continue;
            }

            int compChoice = rm.nextInt(3);
            System.out.println("You chose: " + option[userChoice]);
            System.out.println("Computer chose: " + option[compChoice]);

          
            if (userChoice == compChoice) {
                System.out.println("It's a tie!");
            } else if ((userChoice == 0 && compChoice == 2) || 
                       (userChoice == 1 && compChoice == 0) || 
                       (userChoice == 2 && compChoice == 1)) { 
                System.out.println("You won this round!");
                userScore++;
            } else {
                System.out.println("Computer wins this round!");
                compScore++;
            }

            
            System.out.println("Current Score: You = " + userScore + ", Computer = " + compScore);
        }

        
        if (userScore == 2) {
            System.out.println("\nCongratulations! You win the game!");
        } else if (compScore == 2) {
            System.out.println("\nComputer wins the game! Better luck next time.");
        }

       
    }
}
