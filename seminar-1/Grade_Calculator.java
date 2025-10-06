// Exercise 3: Grade Calculator
// Create a program that converts numerical scores to letter grades.

// Requirements:

// Input: numerical score (0-100)
// Output: letter grade using this scale:
// A: 90-100
// B: 80-89
// C: 70-79
// D: 60-69
// F: 0-59
// Include input validation (reject scores outside 0-100 range)
// Extension Challenge: Add plus/minus grades (e.g., A-, B+) based on the ones digit.

import java.util.Scanner;

public class Grade_Calculator {

    static int getOnesDigit(double number) {
        // Get the ones digit
        return (int) (number % 10);
    }

    static String getGradeSufix(int number) {
        if (number >= 7) {
            return "+";
        } else if (number <= 2) {
            return "-";
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the grade calc!");

        Scanner scannerObject = new Scanner(System.in);

        double scoreValue = 0;

        while (true) {
            System.out.print("Enter scorec(Out of 100): ");
            String score = scannerObject.nextLine();
            scoreValue = Double.parseDouble(score);

            if (scoreValue <= 100 && scoreValue >= 0) {
                break;
            }

            System.out.println("Grade must be a number between 0 and 100!");
        }

        String GradeSufix = getGradeSufix(getOnesDigit(scoreValue));

        if (scoreValue >= 90) {
            System.out.println("Grade is: A" + GradeSufix);
        } else if (scoreValue >= 80) {
            System.out.println("Grade is: B" + GradeSufix);
        } else if (scoreValue >= 70) {
            System.out.println("Grade is: C" + GradeSufix);
        } else if (scoreValue >= 60) {
            System.out.println("Grade is: D" + GradeSufix);
        } else if (scoreValue < 60) {
            System.out.println("Grade is: F" + GradeSufix);
        }
    }
}
