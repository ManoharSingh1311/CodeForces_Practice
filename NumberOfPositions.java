import java.util.Scanner;

/**
 * This program calculates the number of possible positions Petr can occupy
 * in a line of `n` people. Petr knows there are at least `a` people standing
 * in front of him and at most `b` people standing behind him.
 * 
 * The program reads three integers n, a, and b and computes the number of valid
 * positions Petr can stand in.
 * 
 * Constraints:
 * 0 ≤ a, b < n ≤ 100
 */

public class NumberOfPositions {
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);
        
        // Read the three integers: n (total number of people), a (people in front), and b (people behind)
        int n = scanner.nextInt();  // Total number of people
        int a = scanner.nextInt();  // Minimum number of people in front
        int b = scanner.nextInt();  // Maximum number of people behind
        
        int count = 0;  // To count the number of valid positions for Petr
        
        // Loop through all possible positions from 1 to n
        for (int i = 0; i < n; i++) {
            // Check if the current position is valid based on the constraints:
            // n - (i + 1) gives the number of people behind the current position
            // i + 1 is the position in line, so we check if it's greater than `a`
            if (n - (i + 1) <= b && i + 1 > a) {
                count++;  // Valid position found, increase the count
            }
        }
        
        // Print the result: number of valid positions Petr can occupy
        System.out.println(count);
        
        // Close the scanner
        scanner.close();
    }
}
