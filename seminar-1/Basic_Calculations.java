// Exercise 1: Basic Calculations
// Create a program that calculates the area and perimeter of a rectangle.

// Requirements:

// Prompt user for length and width
// Calculate area (length × width) and perimeter (2 × (length + width))
// Display results with appropriate labels
// Hints:

// Use Scanner for input
// Use Double.parseDouble) for string to double conversion
// Remember to import java.util.Scanner

// Exercise 2: Type Casting/Conversion and Validation
// Extend Exercise 1 to include:

// Integer division vs. floating-point division
// Modulo operation to check if dimensions are even/odd
// Boolean variables to track validation states

// Path: seminar-1/Basic_Calculations.java

import java.util.Scanner;  // Import the Scanner class

class BasicCalculations {
  public static void main(String[] args) {
    // Welcome user to calulator
    System.out.println("Welcome to the area and perimeter cacl for a rectangle!");

    Scanner scannerObject = new Scanner(System.in);  // Create a Scanner object

    System.out.print("Enter length: ");
    String length = scannerObject.nextLine();  // Read user inputed length
    double lengthValue = Double.parseDouble(length);  // Convert length to double
    System.out.println("Is odd input?: " + isOdd(lengthValue));

    System.out.print("Enter width: ");
    String width = scannerObject.nextLine();  // Read user inputed width
    double widthValue = Double.parseDouble(width);
    System.out.println("Is odd input?: " + isOdd(widthValue));

    // Area calc
    double calculatedArea = Double.parseDouble(length) * Double.parseDouble(width);  // Calculate area
    System.out.println("Calculated area is: " + calculatedArea);

    // Perimiter calc
    double calculatedPerimeter = 2 * (Double.parseDouble(length) + Double.parseDouble(width));  // Calculate perimeter
    System.out.println("Calculated perimeter is: " + calculatedPerimeter);
  }

  static boolean isOdd(double number) {
    // Return true if the number is odd, false otherwise
    return ((int) number % 2) != 0;
    // % is modulas, 3 % 2 will have a reminder of 1, while an even number like 10, when 10 % 2 will leave no reminders, thus being even
  }
}