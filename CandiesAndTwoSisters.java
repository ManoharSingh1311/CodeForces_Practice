/*
This Java program reads an integer T representing the number of test cases and, for each test case, reads n, 
the number of candies. It calculates how many ways the candies can be distributed between two sisters such that Alice
 receives more candies than Betty (a > b), both receive at least one candy, and the total candies equal n. If n is less than
  or equal to 2, it outputs 0 since no valid distribution exists. For larger n, it outputs (n - 1) / 2 as the number of valid ways 
  to distribute the candies.
  */
import java.util.Scanner;

public class CandiesAndTwoSisters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int T = scanner.nextInt();
        
        // Process each test case
        while (T-- > 0) {
            long n = scanner.nextLong();
            
            // Calculate the number of ways to distribute candies
            // If n <= 2, there are no valid ways
            if (n <= 2) {
                System.out.println(0);
            } else {
                System.out.println((n - 1) / 2);
            }
        }
        
        scanner.close();
    }
}
