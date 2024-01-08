package recursion;

public class StarPattern {
    // Method to print a line with 'n' stars
    public static void printStars(int n) {
        if (n > 0) {
            System.out.print("* ");
            printStars(n - 1);
        } else {
            System.out.println(); // Move to the next line after printing 'n' stars
        }
    }

    // Method to create a pattern of stars using recursion
    public static void createPattern(int n) {
        if (n > 0) {
            createPattern(n - 1); // Recursively call to print stars in decreasing order
            printStars(n); // Print 'n' stars
        }
    }

    public static void main(String[] args) {
        int rows = 5; // Change this value to alter the number of rows in the pattern
        createPattern(rows);
    }
}
