// Exercise 7: Mathematical Methods
// Create a collection of mathematical utility methods:

// Required Methods:

// public static boolean isPrime(int number) - returns true if number is prime
// public static long factorial(int number) - returns the factorial of number
// public static int gcd(int a, int b) - returns greatest common divisor
// public static int fibonacci(int n) - returns the nth Fibonacci number
// Requirements:

// Each method should handle edge cases
// Include input validation where appropriate
// Test each method with multiple test cases
// Testing Strategy:

// Bash
// Test isPrime: 2(true), 4(false), 17(true), 25(false)
// Test factorial: 0(1), 1(1), 5(120)
// Test gcd: gcd(12,8)=4, gcd(17,13)=1
// Test fibonacci: fib(0)=0, fib(1)=1, fib(6)=8


public class Mathematical_Methods {

    public static boolean isPrime(int number) {
        // Prime number is a natural number greater than 1 that has no divisors other than 1 and itself.
        if (number <= 1) {
            return false;
        }

        if (number == 2) {
            return true;
        }

        if (number % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(number); i+= 2) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static long factorial(int number) {
        int factorialTotal = 1;

        for (int i = number; i > 0; i--) {
            factorialTotal = factorialTotal * i;
        }

        return factorialTotal;
    }

    public static int gcd(int a, int b) {

        int biggestNumber = 0;
        int smallestNumber = 0;

        if (a >= b) {
            biggestNumber = a;
            smallestNumber = b;
        } else {
            biggestNumber = b;
            smallestNumber = a;
        }

        int numerator = biggestNumber;
        int modulatoe = smallestNumber;
        int remainder = 0;

        while (true) {
            remainder = numerator % modulatoe;

            if (remainder == 0) {
                break;
            } else {
                numerator = modulatoe;
                modulatoe = remainder;
            }
        }
        
        return modulatoe;
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Mathematical Methods!");

        System.out.println("Prime numbers (isPrime):");
        System.out.println("2: " + isPrime(2));
        System.out.println("4: " + isPrime(4));
        System.out.println("17: " + isPrime(17));
        System.out.println("25: " + isPrime(25));

        System.out.println("\n\nFactorial numbers (factorial):");
        System.out.println("0: " + factorial(0));
        System.out.println("1: " + factorial(1));
        System.out.println("5: " + factorial(5));

        System.out.println("\n\nGreatest common divisor numbers (gcd):");
        System.out.println("12, 8: " + gcd(12, 8));
        System.out.println("17: " + gcd(17, 13));
        System.out.println("454, 2070: " + gcd(456, 2078));

        System.out.println("\n\nFibonacci number (fibonacci):");
        System.out.println("0: " + fibonacci(0));
        System.out.println("1: " + fibonacci(1));
        System.out.println("6: " + fibonacci(6));
    }
}
