// Exercise 4: Number Guessing Game
// Implement a simple number guessing game.

// Requirements:

// Generate a random number between 1-100
// Allow user multiple guesses
// Provide "too high" or "too low" feedback
// Count and display the number of attempts
// Ask if user wants to play again
// Hints:

// Use Random class or Math.random()
// Import java.util.Random if using Random class
// Test edge cases (boundary values, invalid input)
// For random number generation: https://www.w3schools.com/java/java_math.asp

import java.util.Scanner;  // Import the Scanner class

public class Number_Guessing_Game {
    public static void main(String[] args) {

        Scanner scannerObject = new Scanner(System.in);  // Create a Scanner object

        int randomNumber = (int) (Math.random() * 100) + 1;

        int failedAttempts = 0;

        while (true) { 
            System.out.println("Guess the number! Between 0 - 100.");
            System.out.println("Number of failed attempts: " + failedAttempts);

            System.out.println("(enter 'x' to leave the game)");
            System.out.print("Enter a number to guess: ");
            String userGuess = scannerObject.nextLine().toLowerCase();
            if (userGuess.equals("x")) {
                System.out.println("Thank you for playing! Goodbye.");
                break;
            }

            int userGuessValue;
            try {
                userGuessValue = Integer.parseInt(userGuess);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number or 'x' to exit.");
                continue;
            }

            if (userGuessValue == randomNumber) {
                System.out.println("WELDONE! You guessed the number '" + randomNumber + "' right!");
                break;
            } else if (userGuessValue > randomNumber) {
                System.out.println("Incorrect! The number '" + userGuessValue + "' is too high!");
                failedAttempts += 1;
            } else if (userGuessValue < randomNumber) {
                System.out.println("Incorrect! The number '" + userGuessValue + "' is too low!");
                failedAttempts += 1;
            }
        }
    }
}
