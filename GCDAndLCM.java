import java.util.Scanner;
 /*
     * Problem Statement:
     * Given a positive integer n, find two integers a and b such that:
     * - If n is even, a = b = n / 2.
     * - If n is odd, a = n - 1 and b = 1.
     * Output the values of a and b for each test case.
     */
public class GCDAndLCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int t = scanner.nextInt();
        
        // Process each test case
        while (t-- > 0) {
            // Read the value of n
            long n = scanner.nextLong();
            int a = 0, b = 0;

            // Check if n is even or odd
            if (n % 2 == 0) {
                a = (int) (n / 2); // For even n, split it into two equal parts
                b = (int) (n / 2);
            } else {
                a = (int) (n - 1); // For odd n, set a to n-1 and b to 1
                b = 1;
            }

            // Output the result
            System.out.println(a + " " + b);
        }

        scanner.close(); // Close the scanner
    }
}
