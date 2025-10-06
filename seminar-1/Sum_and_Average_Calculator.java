// Exercise 6: Sum and Average Calculator
// Create a program that:

// Continuously accepts numbers from the user
// Stops when user enters -1
// Calculates and displays:
// Sum of all entered numbers
// Average of all numbers
// Count of numbers entered
// Largest and smallest numbers
// Hints:

// Initialise tracking variables before the loop
// Update values inside the loop
// Handle the case where no valid numbers are entered

import java.util.Scanner;

public class Sum_and_Average_Calculator {

    public static void main(String[] args) {

        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Welcome to Sum and Average Calculator!");

        int totalValue = 0;
        int numbeOfValues = 0;

        while (true) {
            System.out.print("Enter a vlue to calc (or -1 to exit): ");
            String UserInt = scannerObject.nextLine();
            int UserIntValue = Integer.parseInt(UserInt);

            if (UserIntValue == -1) {
                break;
            } else if (UserIntValue < -1) {
                System.out.println("Invalid number! Must be greater than or equal to 0");
            } else {
                totalValue += UserIntValue;
                numbeOfValues += 1;
            }
        }

        System.out.println("Sum: " + totalValue);
        System.out.println("Number of values: " + numbeOfValues);
        double avrageSum = totalValue / numbeOfValues;
        System.out.println("Caluclated average sum: " + avrageSum);

    }
    
}
