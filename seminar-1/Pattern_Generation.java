
// Create programs that generate the following patterns:

// Pattern A (Right Triangle):

// Bash
// *
// **
// ***
// ****
// *****
// Pattern B (Number Triangle):

// Bash
// 1
// 12
// 123
// 1234
// 12345
// Requirements:

// Use nested loops
// Allow user to specify the size
// Use proper Java syntax and formatting

public class Pattern_Generation {
    public static void main(String[] args) {

        int triangle = 0;

        while (triangle < 5) { 

            for (int i = 0; i <= triangle; i++) {
                System.out.print("*");
            }
            System.out.println("");
            triangle += 1;
        }

        int numberTriangle = 0;

        while (numberTriangle < 5) { 

            for (int i = 0; i <= numberTriangle; i++) {
                System.out.print(i + 1);
            }
            System.out.println("");
            numberTriangle += 1;
        }
    }
}
